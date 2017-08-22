package hk.hku.cecid.hermes.api.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import hk.hku.cecid.ebms.pkg.EbxmlMessage;
import hk.hku.cecid.ebms.spa.EbmsProcessor;
import hk.hku.cecid.ebms.spa.util.EbmsMessageStatusReverser;
import hk.hku.cecid.ebms.spa.dao.MessageDAO;
import hk.hku.cecid.ebms.spa.dao.MessageDVO;
import hk.hku.cecid.ebms.spa.handler.MessageClassifier;
import hk.hku.cecid.piazza.commons.dao.DAOException;
import hk.hku.cecid.piazza.commons.json.JsonParseException;
import hk.hku.cecid.piazza.commons.rest.RestRequest;
import hk.hku.cecid.piazza.commons.servlet.RequestListenerException;
import hk.hku.cecid.hermes.api.Constants;
import hk.hku.cecid.hermes.api.ErrorCode;
import hk.hku.cecid.hermes.api.listener.HermesAbstractApiListener;
import hk.hku.cecid.hermes.api.spa.ApiPlugin;


/**
 * EbmsMessageHistoryHandler
 *
 * @author Patrick Yee
 *
 */
public class EbmsMessageHistoryHandler extends MessageHandler implements MessageHistoryHandler {

    public EbmsMessageHistoryHandler(HermesAbstractApiListener listener) {
        super(listener);
    }

    public Map<String, Object> getMessageHistory(HttpServletRequest httpRequest) {
        String messageId = httpRequest.getParameter("message_id");
        String messageBox = httpRequest.getParameter("message_box");
        if (messageBox != null) {
            if (!messageBox.equalsIgnoreCase(MessageClassifier.MESSAGE_BOX_INBOX) &&
                !messageBox.equalsIgnoreCase(MessageClassifier.MESSAGE_BOX_OUTBOX)) {
                String errorMessage = "Error parsing parameter: message_box";
                ApiPlugin.core.log.error(errorMessage);
                return listener.createError(ErrorCode.ERROR_PARSING_REQUEST, errorMessage);
            }
        }
        String conversationId = httpRequest.getParameter("conversation_id");
        String cpaId = httpRequest.getParameter("cpa_id");
        String service = httpRequest.getParameter("service");
        String action = httpRequest.getParameter("action");
        String status = httpRequest.getParameter("status");
        if (status != null) {
            if (!status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_RECEIVED) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_PENDING) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_PROCESSING) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_PROCESSED) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_PROCESSED_ERROR) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_DELIVERED) &&
                !status.equalsIgnoreCase(MessageClassifier.INTERNAL_STATUS_DELIVERY_FAILURE)) {
                String errorMessage = "Error parsing parameter: status";
                ApiPlugin.core.log.error(errorMessage);
                return listener.createError(ErrorCode.ERROR_PARSING_REQUEST, errorMessage);
            }
        }
        String limitString = httpRequest.getParameter("limit");
        int limit = MAX_NUMBER;
        if (limitString != null) {
            try {
                limit = Integer.parseInt(limitString);
                if (limit < 0) {
                    limit = MAX_NUMBER;
                }
            } catch (NumberFormatException e) {}
        }

        ApiPlugin.core.log.debug("Parameters: message_id=" + messageId + ", message_box=" + messageBox +
                                 ", converation_id=" + conversationId + ", cpa_id=" + cpaId +
                                 ", service=" + service + ", action=" + action + ", status=" + status +
                                 ", limit=" + limit);

        try {
            MessageDAO msgDAO = (MessageDAO) EbmsProcessor.core.dao.createDAO(MessageDAO.class);
            MessageDVO criteriaDVO = (MessageDVO)msgDAO.createDVO();
            criteriaDVO.setMessageId(messageId);
            criteriaDVO.setMessageBox(messageBox);
            criteriaDVO.setConvId(conversationId);
            criteriaDVO.setCpaId(cpaId);
            criteriaDVO.setService(service);
            criteriaDVO.setAction(action);
            criteriaDVO.setStatus(status);

            List results = msgDAO.findMessagesByHistory(criteriaDVO, limit, 0);

            if (results != null) {
                ArrayList<Object> messages = new ArrayList<Object>();
                for (Iterator i=results.iterator(); i.hasNext() ; ) {
                    MessageDVO message = (MessageDVO) i.next();
                    Map<String, Object> messageDict = new HashMap<String, Object>();
                    messageDict.put("id", message.getMessageId());
                    messageDict.put("timestamp", message.getTimeStamp().getTime() / 1000);
                    messageDict.put("status", message.getStatus());
                    messageDict.put("cpa_id", message.getCpaId());
                    messageDict.put("service", message.getService());
                    messageDict.put("action", message.getAction());
                    messageDict.put("conversation_id", message.getConvId());
                    messageDict.put("message_box", message.getMessageBox());
                    messages.add(messageDict);
                }
                Map<String, Object> returnObj = new HashMap<String, Object>();
                returnObj.put("message_ids", messages);
                ApiPlugin.core.log.info("" + messages.size() + " messages returned");
                return returnObj;
            }
            else {
                String errorMessage = "No message can be loaded";
                ApiPlugin.core.log.error(errorMessage);
                return listener.createError(ErrorCode.ERROR_DATA_NOT_FOUND, errorMessage);
            }
        }
        catch (DAOException e) {
            String errorMessage = "Error loading messages";
            ApiPlugin.core.log.error(errorMessage);
            return listener.createError(ErrorCode.ERROR_DATA_NOT_FOUND, errorMessage);
        }
    }

    public Map<String, Object> resetMessage(String messageId, String action) {
        ApiPlugin.core.log.debug("Parameters: message_id=" + messageId + ", action=" + action);

        try {
            EbmsMessageStatusReverser msgReverser = new EbmsMessageStatusReverser();
            msgReverser.updateToDownload(messageId);
        } catch (Exception e) {
            String errorMessage = "Error loading message status";
            ApiPlugin.core.log.error(errorMessage, e);
            return listener.createError(ErrorCode.ERROR_READING_DATABASE, errorMessage);
        }
        return listener.createActionResult(messageId, true);
    }
}

package hk.hku.cecid.edi.as2.module;

import hk.hku.cecid.edi.as2.AS2PlusProcessor;
import hk.hku.cecid.edi.as2.dao.MessageDAO;
import hk.hku.cecid.edi.as2.dao.MessageDVO;
import hk.hku.cecid.piazza.commons.module.ActiveTaskList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * OutgoingMessageList
 * 
 * @author Hugo Y. K. Lam
 *
 */
public class OutgoingMessageList extends ActiveTaskList {

    public List getTaskList() {
        try {
            MessageDAO messageDAO = (MessageDAO)AS2PlusProcessor.getInstance().getDAOFactory().createDAO(MessageDAO.class);
            Iterator messages = messageDAO.findMessagesByStatus(MessageDVO.STATUS_PENDING, MessageDVO.MSGBOX_OUT).iterator();
            
            List tasks = new ArrayList();
            while (messages.hasNext()) {
                MessageDVO messageDAOData = (MessageDVO) messages.next();
                try {
                    OutgoingMessageTask task = new OutgoingMessageTask(messageDAOData);
                    messageDAOData.setStatus(MessageDVO.STATUS_PROCESSING);
                    messageDAOData.setStatusDescription("");
                    messageDAO.persist(messageDAOData);
                    tasks.add(task);
                }
                catch (Exception e) {
                    messageDAOData.setStatus(MessageDVO.STATUS_DELIVERY_FAILURE);
                    messageDAOData.setStatusDescription(e.toString());
                    messageDAO.persist(messageDAOData);
                    AS2PlusProcessor.getInstance().getLogger().error("Error in creating outgoing message task", e);
                }
            }
            return tasks;
        }
        catch (Exception e) {
            AS2PlusProcessor.getInstance().getLogger().error("Error in retrieving outgoing messages", e);
            return Collections.EMPTY_LIST;
        }
    }
}

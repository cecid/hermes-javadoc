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
 * IncomingMessageList
 * 
 * @author Hugo Y. K. Lam
 *
 */
public class IncomingMessageList extends ActiveTaskList {

    public List getTaskList() {
        try {
        	MessageDAO messageDAO = (MessageDAO)AS2PlusProcessor.getInstance().getDAOFactory().createDAO(MessageDAO.class);
            Iterator messages = messageDAO.findMessagesByStatus(MessageDVO.STATUS_RECEIVED, MessageDVO.MSGBOX_IN).iterator();
            
            List tasks = new ArrayList();
            while (messages.hasNext()) {
                try {
                    MessageDVO messageDAOData = (MessageDVO) messages.next();
                    IncomingMessageTask task = new IncomingMessageTask(messageDAOData);
                    messageDAOData.setStatus(MessageDVO.STATUS_PROCESSING);
                    messageDAOData.setStatusDescription("");
                    messageDAO.persist(messageDAOData);
                    tasks.add(task);
                }
                catch (Exception e) {
                    AS2PlusProcessor.getInstance().getLogger().error("Error in creating incoming message task", e);
                }
            }
            return tasks;
        }
        catch (Exception e) {
            AS2PlusProcessor.getInstance().getLogger().error("Error in retrieving incoming messages", e);
            return Collections.EMPTY_LIST;
        }
    }
}

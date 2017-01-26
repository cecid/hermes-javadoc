.. java:import:: java.io FileNotFoundException

.. java:import:: java.io IOException

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

SFRMMessageHandler
==================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMMessageHandler extends DSHandler

   THe SFRM Message handler is a proxy object of DAO layers. It wraps with some useful query like retrieve message and create message by the SFRM Meta Header. Creation Date: 3/10/2006 V1.0.1 - supports DVO \ ``caching``\ .

   :author: Twinsen Tsang

Methods
-------
clearCache
^^^^^^^^^^

.. java:method:: public void clearCache(DVO dvo)
   :outertype: SFRMMessageHandler

   Clear the cache ONLY by a particular dvo object;

createMessageBySFRMMetaMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO createMessageBySFRMMetaMessage(SFRMMessage msg, SFRMPartnershipDVO pDVO, String messageBox, String status, String statusDesc) throws DAOException, SFRMException, FileNotFoundException, IOException
   :outertype: SFRMMessageHandler

   Create a new message record by a SFRM Mesasge which is meta type.

   :param msg: The SFRM message.
   :param pDVO: The partnership associated with this message.
   :param messageBox: The message box of the new message record.
   :param status: The status of the new message record.
   :param statusDesc: The status description of the new message record.
   :throws DAOException: If the sfrm message is null or with segment no not equal to zero , or other database error.
   :throws SFRMException:
   :throws IOException:
   :throws FileNotFoundException:
   :return: return null if database error, otherwise a new message record.

getInstance
^^^^^^^^^^^

.. java:method:: protected DAO getInstance() throws DAOException
   :outertype: SFRMMessageHandler

   Create / Get the instance of DAO.

removeMessage
^^^^^^^^^^^^^

.. java:method:: public boolean removeMessage(SFRMMessageDVO msgDVO) throws DAOException
   :outertype: SFRMMessageHandler

   Remove the \ ``msgDVO``\  to the pesistence DB. Developer SHOULD use this method instead of \ :java:ref:`hk.hku.cecid.piazza.commons.dao.DAO.remove(hk.hku.cecid.piazza.commons.dao.DVO)`\  because this invocation also manage the DVO cache.

   :param msgDVO: The message DVO to be update.
   :throws DAOException:
   :return: true if operation success, fail vice versa.

retrieveAcknowledgmentMessages
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveAcknowledgmentMessages(int numOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageHandler

   Retrieve a set of messages that is required to ack the acknowledgement from receiver

   :param numOfMessage: number of messages for acknowledgement request
   :param offset: offset in the message records
   :throws DAOException:
   :return: a list of message that is required to ack the acknowledgement

retrieveMessage
^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO retrieveMessage(String messageId, String messageBox) throws DAOException
   :outertype: SFRMMessageHandler

   Retrieve a message from the specified parameters. This method support caching. If the particular DVO is already in the cache, it returned immediately without JDBC calls.

   :param messageId: The message id of the message.
   :param messageBox: The message box of the message. either inbox or outbox.
   :throws DAOException:
   :return: return null if not found by the specified parameter, otherwise a message record.

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageBox, String status) throws DAOException
   :outertype: SFRMMessageHandler

   Retrieve a set of messages from the specified parameters.

   :param messageBox: The message box of the message. either inbox or outbox.
   :param status: The status of the message.
   :throws DAOException:
   :return: return a list of message that fit the criteria.

updateMessage
^^^^^^^^^^^^^

.. java:method:: public boolean updateMessage(SFRMMessageDVO msgDVO) throws DAOException
   :outertype: SFRMMessageHandler

   Update the \ ``msgDVO``\  to the pesistence DB. Developer SHOULD use this method instead of \ :java:ref:`hk.hku.cecid.piazza.commons.dao.DAO.persist(hk.hku.cecid.piazza.commons.dao.DVO)`\  because this invocation also manage the DVO cache.

   :param msgDVO: The message DVO to be update.
   :return: true if operation success, fail vice versa.


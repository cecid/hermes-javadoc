.. java:import:: java.util List

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

SFRMMessageDAO
==============

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public interface SFRMMessageDAO extends DAO

   The Interface of SFRM message dao. Creation Date: 3/10/2006

   :author: Twinsen Tsang

Methods
-------
findMessageByMessageBoxAndPartnershipIdAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageByMessageBoxAndPartnershipIdAndStatus(String messageBox, String partnershipId, String status) throws DAOException
   :outertype: SFRMMessageDAO

   Find a list of message record according to the message box and partnership id and status.

   :param messageBox: The message box of the message.
   :param partnershipId: The partnership id of the message.
   :param status: The status of the message.
   :throws DAOException: if any kind of errors.
   :return: a list of message record the satisfy this condition.

findMessageByMessageBoxAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageByMessageBoxAndStatus(String messageBox, String status) throws DAOException
   :outertype: SFRMMessageDAO

   Find a list of message record according to the message box and it's status.

   :param messageBox: The message box of message. it should be "INBOX" or "OUTBOX".
   :param status: The status of the message.
   :throws DAOException: if any kind of errors.
   :return: a list of message record that satisfy this condition.

findMessageByMessageIdAndBox
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO findMessageByMessageIdAndBox(String messageId, String messageBox) throws DAOException
   :outertype: SFRMMessageDAO

   Find a message record with specified message id.

   :param messageId: The message id of message to be found.
   :param messageBox: The message box of message. it should be "INBOX" or "OUTBOX".
   :throws DAOException: if any kind of errors.
   :return: return null if not found, otherwise a message record.

findMessageByMessageIdAndBox
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO findMessageByMessageIdAndBox(SFRMMessageDVO message) throws DAOException
   :outertype: SFRMMessageDAO

   Find a message record with specified message record. The field "message id" and "message box" will be used for record finding.

   :param message: The message record object to be used for searching.
   :throws DAOException: if any kind of errors.
   :return: return null if not found, otherwise a message record.

findMessageForAcknowledgement
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageForAcknowledgement(int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDAO

   Find the message that is ready for requesting the acknowledgement

   :param numberOfMessage: Number of message show in the page
   :param offset: Offset of the data in the list of the search result
   :throws DAOException: if any kind of errors
   :return: List of SFRMMessageDVO that is determined for ready to request for acknowledgement

findMessagesByHistory
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessagesByHistory(SFRMMessageDVO data, int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDAO

   Find messages order by descending timestamp by different criteria.

   :param data: The message data value object carrying query criteria.
   :param numberOfMessage: max no. of message in return.
   :param offset: no. of starting record in return.
   :throws DAOException: if any kind of errors

findMessagesByTime
^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessagesByTime(int time_period, SFRMMessageDVO data, int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDAO

   Find the message by the bound of certain time period

   :param time_period: How many month before today
   :param data: Criteria to search the message for
   :param numberOfMessage: Number of message show in the page
   :param offset: Offset of the data in the list of the search result
   :throws DAOException: if any kind of errors
   :return: List of SFRMMessageDVO that contain the search result

findNumberOfMessagesByHistory
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int findNumberOfMessagesByHistory(SFRMMessageDVO dao) throws DAOException
   :outertype: SFRMMessageDAO

   Find number of the message in the message history by a given search criteria given by dao

   :param dao: Search Criteria
   :return: Number of message found


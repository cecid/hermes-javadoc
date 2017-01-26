.. java:import:: java.sql Timestamp

.. java:import:: java.util GregorianCalendar

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SFRMMessageDSDAO
================

.. java:package:: hk.hku.cecid.edi.sfrm.dao.ds
   :noindex:

.. java:type:: public class SFRMMessageDSDAO extends DataSourceDAO implements SFRMMessageDAO

   The data access object controller for the database table \ ``sfrm_message``\ . It provides some useful database-level queries. Creation Date: 29/9/2006

   :author: Twinsen Tsang

Methods
-------
createDVO
^^^^^^^^^

.. java:method:: public DVO createDVO()
   :outertype: SFRMMessageDSDAO

   Create a new SFRM Message record Object.

   :return: a new SFRM Message record Object.

findMessageByMessageBoxAndPartnershipIdAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageByMessageBoxAndPartnershipIdAndStatus(String messageBox, String partnershipId, String status) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find a list of message record according to the message box and partnership id and status.

   :param messageBox: The message box of the message.
   :param partnershipId: The partnership id of the message.
   :param status: The status of the message.
   :throws DAOException: if any kind of errors.
   :return: a list of message record the satisfy this condition.

findMessageByMessageBoxAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageByMessageBoxAndStatus(String messageBox, String status) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find a message record according to the message box and it's status

   :param messageBox: The message box of message. it should be "INBOX" or "OUTBOX".
   :param status: The status of the message.
   :throws DAOException:
   :return: a list of message record that satisfy this condition.

findMessageByMessageIdAndBox
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO findMessageByMessageIdAndBox(String messageId, String messageBox) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find a message record with specified message id.

   :param messageId: The message id of message to be found.
   :param messageBox: The message box of message. it should be "INBOX" or "OUTBOX".
   :throws DAOException:
   :return: return null if not found, otherwise a message record.

findMessageByMessageIdAndBox
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageDVO findMessageByMessageIdAndBox(SFRMMessageDVO message) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find a message record with specified message record. The field "message id" and "message box" will be used for record finding.

   :param message: The message record object to be used for searching.
   :throws DAOException:
   :return: return null if not found, otherwise a message record.

findMessageForAcknowledgement
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageForAcknowledgement(int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDSDAO

findMessagesByHistory
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessagesByHistory(SFRMMessageDVO data, int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find messages order by descending timestamp by different criteria.

   :param data: The message data value object carrying query criteria.
   :param numberOfMessage: max no. of message in return.
   :param offset: no. of starting record in return.
   :throws DAOException: if any kind of errors

findMessagesByTime
^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessagesByTime(int time_period, SFRMMessageDVO data, int numberOfMessage, int offset) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find the message by the bound of certain time period. The bounded time period is in term of completed timestamp of message

   :param time_period: How many month before today
   :param data: Criteria to search the message for
   :param numberOfMessage: Number of message show in the page
   :param offset: Offset of the data in the list of the search result
   :return: List of SFRMMessageDVO that contain the search result

findNumberOfMessagesByHistory
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int findNumberOfMessagesByHistory(SFRMMessageDVO data) throws DAOException
   :outertype: SFRMMessageDSDAO

   Find number of the message in the message history by a given search criteria given by dao

   :param dao: Search Criteria
   :return: Number of message found


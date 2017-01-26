.. java:import:: java.util List

.. java:import:: java.util Vector

.. java:import:: java.sql Timestamp

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

SFRMMessageSegmentHandler
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMMessageSegmentHandler extends DSHandler

   The SFRM Message Segment handler is a proxy object of DAO layers. It wraps with some useful query like retrieve message segment and create message by the SFRM Message Header. Creation Date: 9/10/2006

   :author: Twinsen Tsang

Methods
-------
clearCache
^^^^^^^^^^

.. java:method:: public void clearCache(DVO dvo)
   :outertype: SFRMMessageSegmentHandler

   DOES NOT SUPPORT CACHING.

createMessageSegmentBySFRMMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO createMessageSegmentBySFRMMessage(SFRMMessage message, String messageBox, String status) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Create an Message Segment according to the SFRM message.

   :param message: The message segmented used for generating the message segment record.
   :param messageBox: The message box for the mesasge. It should either be "inbox" or "outbox".
   :param status: The status for the new message segment record. if this field is null, we conside the status is PENDING.
   :throws DAOException: Error in Database connectivity.
   :return: a message segment dvo if the operation runs succesfully.

getInstance
^^^^^^^^^^^

.. java:method:: protected DAO getInstance() throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Create / Get the instance of DAO.

retrieveDeliveredSegmentForMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveDeliveredSegmentForMessage(String messageId) throws DAOException
   :outertype: SFRMMessageSegmentHandler

retrieveIncompleteSegments
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveIncompleteSegments(String messageBox, String status, String type, int limit) throws DAOException
   :outertype: SFRMMessageSegmentHandler

retrieveLastUpdatedMessageSegment
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO retrieveLastUpdatedMessageSegment(String messageId, String messageBox, String type) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Select the last updated message segment with the specified parameter. The last updated message segment is defined as the message segment which has the latest \ ``proceedTimestamp value.``\

   :param messageId: The message id of the message segment belong to.
   :param messageBox: The message box of the message segment. It should either "inbox" or "outbox".
   :param type: The segment type (META, PAYLOAD, RECEIPT, RECOVERY)
   :throws DAOException:
   :return: A message segment dvo if the operation runs succesfully.

retrieveLastUpdatedTimestamp
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp retrieveLastUpdatedTimestamp(String messageId, String messageBox, String type) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Select the last updated timestamp with the specified parameter. The last updated message segment is defined as the message segment which has the latest \ ``proceedTimestamp value.``\

   :param messageId: The message id of the message segment belong to.
   :param messageBox: The message box of the message segment. It should either "inbox" or "outbox".
   :param type: The segment type (META, PAYLOAD, RECEIPT, RECOVERY)
   :throws DAOException:
   :return: A message segment dvo if the operation runs succesfully.

retrieveMaxMessageSegmentNumber
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int retrieveMaxMessageSegmentNumber(String messageId, String messageBox, String type) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Find the maximum segment number it has in the DB for the specified message.

   :param messageId: The message id of the message segment belong to.
   :param messageBox: The message box of the message segment.
   :param type: The segment type (META, PAYLOAD, RECEIPT, RECOVERY)
   :throws DAOException:

retrieveMessageSegment
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO retrieveMessageSegment(String messageId, String messageBox, int segmentNo, String type) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Select a message segment with the specified parameter.

   :param messageId: The message id of the message segment belong to.
   :param messageBox: The message box of the message segment. It should either "inbox" or "outbox".
   :param segmentNo: The segment number of the segment
   :param type: The segment type (META, PAYLOAD, RECEIPT, RECOVERY)
   :throws DAOException: Error in Database connectivity.
   :return: A message segment dvo if the operation runs succesfully.

retrieveMessageSegment
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO retrieveMessageSegment(SFRMMessage message, String messageBox) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Select a message segment with the specified parameter. The segment type is omitted here is this query.

   :param message: The message segmented used for get the message segment record.
   :param messageBox: The message box for the mesasge. It should either be "inbox" or "outbox".
   :throws DAOException:
   :return: A message segment dvo if the operation runs succesfully.

retrieveMessageSegmentCount
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int retrieveMessageSegmentCount(String messageId, String messageBox, String type, String status) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Find how many message for the partiucalur message id and message box are available in the database.

   :param messageId: The message id of the message segment belong to.
   :param messageBox: The message box of the message segment. Either inbox or outbox can be allowed.
   :param type: The segment type of the message segment.
   :param status: The status of the message segment
   :throws DAOException:

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageBox, String status, int limit) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Retrieve a set of messages from the specified parameters.

   :param messageBox: The message box of the message segment. Either inbox or outbox can be allowed.
   :param status: The status of the message segment.
   :param limit: The maximum message that can be retrieved.
   :throws DAOException:
   :return: Return a list of message that fit the criteria.

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageBox, String status, String messageStatus, int limit) throws DAOException
   :outertype: SFRMMessageSegmentHandler

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageBox, String status, String type, String messageStatus, int limit) throws DAOException
   :outertype: SFRMMessageSegmentHandler

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageId, String messageBox, String messageType, String[] status) throws DAOException
   :outertype: SFRMMessageSegmentHandler

   Find message segment by providing the message ID, message box, message type and a list of status

   :param messageId: The message id of the mesage segment belong to
   :param messageBox: The message box of the message segment
   :param messageType: The segment type (META, PAYLOAD, ACK)
   :param status: The status of message status
   :throws DAOException:
   :return: List of SFRMMessageSegmentDVO

retrieveMessages
^^^^^^^^^^^^^^^^

.. java:method:: public List retrieveMessages(String messageId, String messageBox, String type, List<Integer> segmentNums) throws DAOException
   :outertype: SFRMMessageSegmentHandler


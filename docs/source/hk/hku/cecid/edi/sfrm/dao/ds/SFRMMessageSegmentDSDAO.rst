.. java:import:: java.sql Timestamp

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

SFRMMessageSegmentDSDAO
=======================

.. java:package:: hk.hku.cecid.edi.sfrm.dao.ds
   :noindex:

.. java:type:: public class SFRMMessageSegmentDSDAO extends DataSourceDAO implements SFRMMessageSegmentDAO

   The data access object controller for the database table \ ``sfrm_message_segment``\ . It provides some useful database-level queries. Creation Date: 29/9/2006

   :author: Twinsen Tsang

Methods
-------
createDVO
^^^^^^^^^

.. java:method:: public DVO createDVO()
   :outertype: SFRMMessageSegmentDSDAO

   Create a new SFRM Message Segment Object.

   :return: a new SFRM Message Segment Object.

findIncompleteSegments
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findIncompleteSegments(String messageBox, String status, String type, int limit) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find-out all segments which are incomplete in SFRM semantic. Incomplete Segments are defined as their corresponding message is not in the status of either 'DF' or 'PS'. The query support wildcard on \ ``status``\  by using '%' string.

findLastUpdatedMessageSegmentByMessageIdAndBoxAndType
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO findLastUpdatedMessageSegmentByMessageIdAndBoxAndType(String messageId, String messageBox, String type) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find a message segment recrod with specified parameters. The field "message id", "message box" and "type" will be used for record searching. The message segment extracted is the last updated segments by other module.

   :param messageId: The message id of the message segment.
   :param messageBox: The message box of the message segment.
   :param type: The type of the message segment
   :throws DAOException: Any kind of database error.
   :return: A message segment record if found.

findMaxSegmentNoByMessageIdAndBoxAndType
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int findMaxSegmentNoByMessageIdAndBoxAndType(String messageId, String messageBox, String type) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find the maximum number of segment no in the database from the specified parameters.

   :param messageId: The message id of the message segment.
   :param messageBox: The message box of the message segment.
   :param type: The type of the message segment

findMessageSegmentByMessageBoxAndStatusAndTypeAndMessageStatusNotEqualTo
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageSegmentByMessageBoxAndStatusAndTypeAndMessageStatusNotEqualTo(String messageBox, String status, String type, String messageStatus, int limit) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

findMessageSegmentByMessageIdAndBoxAndType
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentDVO findMessageSegmentByMessageIdAndBoxAndType(String messageId, String messageBox, int segmentNo, String type) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find a message segment record with specified parameters. The field "message id", "message box" , "segment no" and "segment type" will be used for record finding.

   :param messageId: The message id of the message segment.
   :param messageBox: The message box of the message segment.
   :param type: The status of the message segment
   :throws DAOException: Any kind of database error.
   :return: A set of message segment which meets the specified condition or empty list if no record matched.

findMessageSegmentsByMessageBoxAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageSegmentsByMessageBoxAndStatus(String messageBox, String status, int limit) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find a set of message segment record with specified message box and message status.

   :param messageBox: The message box of the message segment.
   :param status: The status of the message segment.
   :param limit: The maximum message segment can be retrieved at one invocation.
   :throws DAOException: Any kind of database error.
   :return: A set of message segment which meets the specified condition or empty list if no record matched.

findMessageSegmentsByMessageBoxAndStatusAndMessageStatusNotEqualTo
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findMessageSegmentsByMessageBoxAndStatusAndMessageStatusNotEqualTo(String messageBox, String status, String messageStatus, int limit) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find a set of message segment record with specified message box and message status.

   :param messageBox: The message box of the message segment.
   :param status: The status of the message segment.
   :param messageStatus: The associated main message status of the segment.
   :param limit: The maximum message segment can be retrieved at one invocation.
   :throws DAOException: Any kind of database error.
   :return: A set of message segment which meets the specified condition or empty list if no record matched.

findNumOfBytesSentByMessageIdAndBoxAndTypeAndStatues
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public long findNumOfBytesSentByMessageIdAndBoxAndTypeAndStatues(String messageId, String messageBox, String type, long proceedTime, List<String> statues) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

findNumOfSegmentByMessageIdAndBoxAndTypeAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int findNumOfSegmentByMessageIdAndBoxAndTypeAndStatus(String messageId, String messageBox, String type, String status) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find how many segments is available into the database.

   :param messageId: The message id of the message segment.
   :param messageBox: The message box of the message segment.
   :throws DAOException:

findSegmentByMessageIdAndBoxAndTypeAndNos
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findSegmentByMessageIdAndBoxAndTypeAndNos(String messageId, String messageBox, String type, List<Integer> segmentNos) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

findSegmentsByMessageIdAndBoxAndTypeAndStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findSegmentsByMessageIdAndBoxAndTypeAndStatus(String messageId, String messageBox, String type, String status) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Find segment by their message Id, nessage box, message type and message status

   :param messageId: The message id of the message segment.
   :param messageBox: The message box of the message segment.
   :param type: The segment type of the message segment.
   :param status: The status of the message segment.
   :throws DAOException:

updateBatchSegmentsRecoveryStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int updateBatchSegmentsRecoveryStatus(String status, String messageId, String messageBox, String segmentType, List<Integer> segNums) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO

   Update the message segment status in batch

   :param status: status of message segments to update to
   :param segNums: list of segment number to be update

updateBatchSegmentsStatus
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int updateBatchSegmentsStatus(String status, Timestamp completeTime, String messageId, String messageBox, String segmentType, List<Integer> segNums) throws DAOException
   :outertype: SFRMMessageSegmentDSDAO


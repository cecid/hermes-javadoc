.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementBuilder

.. java:import:: org.dom4j Document

.. java:import:: org.dom4j Element

.. java:import:: org.dom4j DocumentException

.. java:import:: org.dom4j.io SAXReader

.. java:import:: java.io StringReader

.. java:import:: java.util List

.. java:import:: java.util ArrayList

SFRMAcknowledgementParser
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.pkg
   :noindex:

.. java:type:: public class SFRMAcknowledgementParser

Constructors
------------
SFRMAcknowledgementParser
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMAcknowledgementParser(String xmlContent) throws DocumentException
   :outertype: SFRMAcknowledgementParser

Methods
-------
getMessageSegmentNums
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public List<Integer> getMessageSegmentNums(String messageId)
   :outertype: SFRMAcknowledgementParser

   Get a list of mesasge segmnet num for the specific message

   :param messageId: message ID
   :return: list of message segment number

getMessageSegmentStatus
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getMessageSegmentStatus(String messageId, int segmentNum)
   :outertype: SFRMAcknowledgementParser

   Get status for specific message segment

   :param messageId: message ID
   :param segmentNum: segment number
   :return: message segment status

getMessageStatus
^^^^^^^^^^^^^^^^

.. java:method:: public String getMessageStatus(String messageId)
   :outertype: SFRMAcknowledgementParser

   Get status for a specific message

   :param messageId: message ID
   :return: message status

getMessagesIDs
^^^^^^^^^^^^^^

.. java:method:: public List<String> getMessagesIDs()
   :outertype: SFRMAcknowledgementParser

   Get the list of message ID in the acknowledgement

   :return: list of message ID

getNumMessageSegment
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int getNumMessageSegment(String messageId)
   :outertype: SFRMAcknowledgementParser

   Get the number of message segment for specific message

   :param messageId: message ID
   :return: number of message segments

getNumMessages
^^^^^^^^^^^^^^

.. java:method:: public int getNumMessages()
   :outertype: SFRMAcknowledgementParser

   Get the number of message in the acknowledgement

   :return: number of messages


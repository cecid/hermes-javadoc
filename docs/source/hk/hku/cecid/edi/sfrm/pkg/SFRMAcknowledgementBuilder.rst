.. java:import:: org.dom4j Document

.. java:import:: org.dom4j Element

.. java:import:: org.dom4j DocumentHelper

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SFRMAcknowledgementBuilder
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.pkg
   :noindex:

.. java:type:: public class SFRMAcknowledgementBuilder

   :author: Patrick Yip To build the SFRM Acknowledgement content body

Fields
------
ID_ATTR
^^^^^^^

.. java:field:: public static final String ID_ATTR
   :outertype: SFRMAcknowledgementBuilder

MESSAGES_TAG
^^^^^^^^^^^^

.. java:field:: public static final String MESSAGES_TAG
   :outertype: SFRMAcknowledgementBuilder

MESSAGE_NODE_XPATH_PARAM
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String MESSAGE_NODE_XPATH_PARAM
   :outertype: SFRMAcknowledgementBuilder

MESSAGE_SEGMENT_NODE_XPATH_PARAM
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String MESSAGE_SEGMENT_NODE_XPATH_PARAM
   :outertype: SFRMAcknowledgementBuilder

MESSAGE_SEGMENT_XPATH_PARAM
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String MESSAGE_SEGMENT_XPATH_PARAM
   :outertype: SFRMAcknowledgementBuilder

MESSAGE_TAG
^^^^^^^^^^^

.. java:field:: public static final String MESSAGE_TAG
   :outertype: SFRMAcknowledgementBuilder

MESSAGE_XPATH
^^^^^^^^^^^^^

.. java:field:: public static final String MESSAGE_XPATH
   :outertype: SFRMAcknowledgementBuilder

NUM_ATTR
^^^^^^^^

.. java:field:: public static final String NUM_ATTR
   :outertype: SFRMAcknowledgementBuilder

PARAM_TOKEN
^^^^^^^^^^^

.. java:field:: public static final String PARAM_TOKEN
   :outertype: SFRMAcknowledgementBuilder

SEGMENTS_TAG
^^^^^^^^^^^^

.. java:field:: public static final String SEGMENTS_TAG
   :outertype: SFRMAcknowledgementBuilder

SEGMENT_TAG
^^^^^^^^^^^

.. java:field:: public static final String SEGMENT_TAG
   :outertype: SFRMAcknowledgementBuilder

STATUS_ATTR
^^^^^^^^^^^

.. java:field:: public static final String STATUS_ATTR
   :outertype: SFRMAcknowledgementBuilder

STATUS_TAG
^^^^^^^^^^

.. java:field:: public static final String STATUS_TAG
   :outertype: SFRMAcknowledgementBuilder

Constructors
------------
SFRMAcknowledgementBuilder
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMAcknowledgementBuilder()
   :outertype: SFRMAcknowledgementBuilder

   Constructor for Acknowledgement Builder, create an empty acknowledgement content

Methods
-------
getMessageSegmentXPath
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static String getMessageSegmentXPath(String messageId, int segmentNum)
   :outertype: SFRMAcknowledgementBuilder

getMessageXPath
^^^^^^^^^^^^^^^

.. java:method:: public static String getMessageXPath(String messageId)
   :outertype: SFRMAcknowledgementBuilder

getSegmentsXPath
^^^^^^^^^^^^^^^^

.. java:method:: public static String getSegmentsXPath(String messageId)
   :outertype: SFRMAcknowledgementBuilder

setMessage
^^^^^^^^^^

.. java:method:: public Element setMessage(String messageId, String status)
   :outertype: SFRMAcknowledgementBuilder

   Set the message information to the acknowledgment content, if the message is not present, it will create an entry, otherwise it will modify the entry

   :param messageId: message id
   :param status: message status
   :return: the newly created or modified XML element

setSegment
^^^^^^^^^^

.. java:method:: public Element setSegment(String messageId, int segmentNum, String segmentStatus) throws IllegalArgumentException
   :outertype: SFRMAcknowledgementBuilder

   Set the message segment information for a given message id, if the message segment is present, it will create one, otherwise it will modify the existing entry

   :param messageId: message id for message segment
   :param segmentNum: segment number
   :param segmentStatus: segment status
   :throws IllegalArgumentException: if the given message id is not existing in the acknowledgment content
   :return: the newly created or modified XML element

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: SFRMAcknowledgementBuilder


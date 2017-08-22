.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io FileInputStream

.. java:import:: java.util ArrayList

.. java:import:: java.util Enumeration

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: java.util.zip DeflaterOutputStream

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: org.apache.commons.codec.binary Base64

.. java:import:: hk.hku.cecid.edi.as2 AS2Processor

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDAO

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDVO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDAO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDVO

.. java:import:: hk.hku.cecid.edi.as2.module PayloadCache

.. java:import:: hk.hku.cecid.edi.as2.module PayloadRepository

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

As2ReceiveMessageHandler
========================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class As2ReceiveMessageHandler extends MessageHandler implements ReceiveMessageHandler

Constructors
------------
As2ReceiveMessageHandler
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public As2ReceiveMessageHandler(HermesAbstractApiListener listener)
   :outertype: As2ReceiveMessageHandler

Methods
-------
getHeader
^^^^^^^^^

.. java:method:: protected String getHeader(HttpServletRequest request, String headerName)
   :outertype: As2ReceiveMessageHandler

getReceivedMessage
^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessage(String messageId, HttpServletRequest request)
   :outertype: As2ReceiveMessageHandler

getReceivedMessageList
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessageList(String partnershipId, boolean includeRead)
   :outertype: As2ReceiveMessageHandler


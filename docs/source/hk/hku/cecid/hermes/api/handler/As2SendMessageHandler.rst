.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.activation DataHandler

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.edi.as2 AS2Processor

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDAO

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDVO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDAO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDVO

.. java:import:: hk.hku.cecid.edi.as2.pkg AS2Message

.. java:import:: hk.hku.cecid.edi.as2.module PayloadCache

.. java:import:: hk.hku.cecid.edi.as2.module PayloadRepository

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: org.apache.commons.codec.binary Base64

As2SendMessageHandler
=====================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class As2SendMessageHandler extends MessageHandler implements SendMessageHandler

Constructors
------------
As2SendMessageHandler
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public As2SendMessageHandler(HermesAbstractApiListener listener)
   :outertype: As2SendMessageHandler

Methods
-------
getMessageStatus
^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageStatus(String messageId)
   :outertype: As2SendMessageHandler

sendMessage
^^^^^^^^^^^

.. java:method:: public Map<String, Object> sendMessage(Map<String, Object> inputDict, RestRequest sourceRequest)
   :outertype: As2SendMessageHandler


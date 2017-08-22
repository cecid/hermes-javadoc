.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.activation DataHandler

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.xml.soap SOAPException

.. java:import:: hk.hku.cecid.ebms.pkg EbxmlMessage

.. java:import:: hk.hku.cecid.ebms.pkg MessageHeader

.. java:import:: hk.hku.cecid.ebms.spa EbmsProcessor

.. java:import:: hk.hku.cecid.ebms.spa EbmsUtility

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDVO

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDVO

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageClassifier

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageServiceHandler

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageServiceHandlerException

.. java:import:: hk.hku.cecid.ebms.spa.listener EbmsRequest

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.activation ByteArrayDataSource

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.util Generator

.. java:import:: org.apache.commons.codec.binary Base64

EbmsSendMessageHandler
======================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class EbmsSendMessageHandler extends MessageHandler implements SendMessageHandler

Constructors
------------
EbmsSendMessageHandler
^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EbmsSendMessageHandler(HermesAbstractApiListener listener)
   :outertype: EbmsSendMessageHandler

Methods
-------
getMessageStatus
^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageStatus(String messageId)
   :outertype: EbmsSendMessageHandler

sendMessage
^^^^^^^^^^^

.. java:method:: public Map<String, Object> sendMessage(Map<String, Object> inputDict, RestRequest sourceRequest)
   :outertype: EbmsSendMessageHandler


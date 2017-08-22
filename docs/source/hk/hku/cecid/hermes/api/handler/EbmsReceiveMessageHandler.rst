.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io InputStream

.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.xml.soap AttachmentPart

.. java:import:: javax.xml.soap SOAPException

.. java:import:: org.apache.commons.codec.binary Base64

.. java:import:: hk.hku.cecid.ebms.pkg EbxmlMessage

.. java:import:: hk.hku.cecid.ebms.spa EbmsProcessor

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDVO

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageServerDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDVO

.. java:import:: hk.hku.cecid.ebms.spa.handler EbxmlMessageDAOConvertor

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageClassifier

.. java:import:: hk.hku.cecid.ebms.spa.task MessageValidationException

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

EbmsReceiveMessageHandler
=========================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class EbmsReceiveMessageHandler extends MessageHandler implements ReceiveMessageHandler

Constructors
------------
EbmsReceiveMessageHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EbmsReceiveMessageHandler(HermesAbstractApiListener listener)
   :outertype: EbmsReceiveMessageHandler

Methods
-------
getReceivedMessage
^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessage(String messageId, HttpServletRequest request)
   :outertype: EbmsReceiveMessageHandler

getReceivedMessageList
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessageList(String partnershipId, boolean includeRead)
   :outertype: EbmsReceiveMessageHandler


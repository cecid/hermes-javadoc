.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.net HttpURLConnection

.. java:import:: java.net MalformedURLException

.. java:import:: java.security NoSuchAlgorithmException

.. java:import:: java.security UnrecoverableKeyException

.. java:import:: java.security.cert X509Certificate

.. java:import:: hk.hku.cecid.edi.sfrm.net FastHttpConnector

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageClassifier

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMComponent

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.activation FileRegionDataSource

.. java:import:: hk.hku.cecid.piazza.commons.net ConnectionException

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.security TrustedHostnameVerifier

OutgoingMessageHandler
======================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class OutgoingMessageHandler extends SFRMComponent

   The outgoing message handler is a singleton classes that provides service for processing outgoing SFRM message. Creation Date: 5/12/2006

   :author: Twinsen Tsang

Methods
-------
getInstance
^^^^^^^^^^^

.. java:method:: public static OutgoingMessageHandler getInstance()
   :outertype: OutgoingMessageHandler

   :return: an instance of OutgoingMessageHandler.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: OutgoingMessageHandler

   Initialization of this Component

packOutgoingMessage
^^^^^^^^^^^^^^^^^^^

.. java:method:: protected SFRMMessage packOutgoingMessage(SFRMMessage message, String signAlgorithm, String encryptAlgorithm, X509Certificate encryptCert) throws SFRMException, NoSuchAlgorithmException, UnrecoverableKeyException
   :outertype: OutgoingMessageHandler

   Pack the SMIME (secure MIME) message to become secured SFRM Message.  Currently, the packing mechanisms support:

   ..

   #. Digitial Signing using MD5 or SHA-1
   #. Encryption using RC2_CBC or DES_EDE3_CBC

   :param message: The outgoing SFRM Message.
   :param msgDVO: The message record associated to this SFRM message.
   :param pDVO:
   :throws UnrecoverableKeyException:
   :throws NoSuchAlgorithmException:
   :throws SFRMException:
   :return: The secured SFRM message.

sendMessage
^^^^^^^^^^^

.. java:method:: public FastHttpConnector sendMessage(SFRMMessage message, String endpoint, boolean isHostVerified, String signAlg, String encryptAlg, X509Certificate encryptCert) throws SFRMMessageException, ConnectionException
   :outertype: OutgoingMessageHandler

   Send SFRM message.

   :param message: The original SFRM Message.
   :param isSign: Digital signature is required
   :param isEncryptReq: Encryption is required
   :param signAlg: Signing algorithm
   :param encryptAlg: Encryption algorithm
   :param encrypt: Partner public certificate for encryption
   :throws SFRMMessageException:
   :throws ConnectionException:
   :return: HTTP response

sendMessageWithMessageResponse
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage sendMessageWithMessageResponse(SFRMMessage message, String endpoint, boolean isHostVerified, String signAlg, String encryptAlg, X509Certificate encryptCert) throws SFRMMessageException, ConnectionException, IllegalStateException, IOException
   :outertype: OutgoingMessageHandler


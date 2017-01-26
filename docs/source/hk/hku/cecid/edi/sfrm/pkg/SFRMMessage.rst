.. java:import:: java.io BufferedInputStream

.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.lang Cloneable

.. java:import:: java.nio ByteBuffer

.. java:import:: java.security DigestInputStream

.. java:import:: java.security MessageDigest

.. java:import:: java.security PrivateKey

.. java:import:: java.security.cert CertStore

.. java:import:: java.security.cert CollectionCertStoreParameters

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.util ArrayList

.. java:import:: java.util Enumeration

.. java:import:: java.util Iterator

.. java:import:: javax.activation CommandMap

.. java:import:: javax.activation MailcapCommandMap

.. java:import:: javax.mail MessagingException

.. java:import:: javax.mail.internet InternetHeaders

.. java:import:: javax.mail.internet MimeBodyPart

.. java:import:: javax.mail.internet MimeMultipart

.. java:import:: org.bouncycastle.asn1 ASN1ObjectIdentifier

.. java:import:: org.bouncycastle.asn1.smime SMIMECapability

.. java:import:: org.bouncycastle.asn1.smime SMIMECapabilityVector

.. java:import:: org.bouncycastle.cms DefaultCMSSignatureAlgorithmNameGenerator

.. java:import:: org.bouncycastle.cms RecipientId

.. java:import:: org.bouncycastle.cms RecipientInformation

.. java:import:: org.bouncycastle.cms RecipientInformationStore

.. java:import:: org.bouncycastle.cms SignerInformation

.. java:import:: org.bouncycastle.cms SignerInformationStore

.. java:import:: org.bouncycastle.cms SignerInformationVerifier

.. java:import:: org.bouncycastle.cms.bc BcRSASignerInfoVerifierBuilder

.. java:import:: org.bouncycastle.cms.jcajce JcaSimpleSignerInfoGeneratorBuilder

.. java:import:: org.bouncycastle.cms.jcajce JceCMSContentEncryptorBuilder

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransEnvelopedRecipient

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransRecipientId

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransRecipientInfoGenerator

.. java:import:: org.bouncycastle.cert.jcajce JcaCertStore

.. java:import:: org.bouncycastle.cert.jcajce JcaX509CertificateHolder

.. java:import:: org.bouncycastle.mail.smime SMIMEEnveloped

.. java:import:: org.bouncycastle.mail.smime SMIMEEnvelopedGenerator

.. java:import:: org.bouncycastle.mail.smime SMIMESigned

.. java:import:: org.bouncycastle.mail.smime SMIMESignedGenerator

.. java:import:: org.bouncycastle.operator DefaultSignatureAlgorithmIdentifierFinder

.. java:import:: org.bouncycastle.operator DefaultDigestAlgorithmIdentifierFinder

.. java:import:: org.bouncycastle.operator.bc BcDigestCalculatorProvider

.. java:import:: hk.hku.cecid.edi.sfrm.activation FileRegionDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SFRMMessage
===========

.. java:package:: hk.hku.cecid.edi.sfrm.pkg
   :noindex:

.. java:type:: public class SFRMMessage implements Cloneable

   This is the SFRM Message used for wrapping the payload and send it to the receiver side. Specification: Creation Date: 29/9/2006 Version 1.0.2 -

   ..

   * Add a message classifier for recognizing the message nature much easily.
   *

   Version 1.0.1 -

   ..

   * MIC Value is stored into ContentMD5 in the MimeBodyPart.
   *
   * Support cloning.

   :author: Twinsen Tsang

Fields
------
ALG_ENCRYPT_3DES
^^^^^^^^^^^^^^^^

.. java:field:: public static final String ALG_ENCRYPT_3DES
   :outertype: SFRMMessage

ALG_ENCRYPT_RC2
^^^^^^^^^^^^^^^

.. java:field:: public static final String ALG_ENCRYPT_RC2
   :outertype: SFRMMessage

ALG_SIGN_MD5
^^^^^^^^^^^^

.. java:field:: public static final String ALG_SIGN_MD5
   :outertype: SFRMMessage

ALG_SIGN_SHA1
^^^^^^^^^^^^^

.. java:field:: public static final String ALG_SIGN_SHA1
   :outertype: SFRMMessage

SFRM_MESSAGE_VERSION
^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_MESSAGE_VERSION
   :outertype: SFRMMessage

   The current version of SFRM Message.

Constructors
------------
SFRMMessage
^^^^^^^^^^^

.. java:constructor:: public SFRMMessage()
   :outertype: SFRMMessage

   Creates a new instance of SFRM Message.

SFRMMessage
^^^^^^^^^^^

.. java:constructor:: public SFRMMessage(InputStream message) throws SFRMMessageException
   :outertype: SFRMMessage

   Creates a new instance of SFRM Message.

   :param message: the message as input stream.
   :throws SFRMMessageException: if unable to construct from the given input stream.

SFRMMessage
^^^^^^^^^^^

.. java:constructor:: public SFRMMessage(InternetHeaders headers, InputStream content) throws SFRMMessageException
   :outertype: SFRMMessage

   Creates a new instance of SFRMMessage.

   :param headers: the headers of this message.
   :param ins: the content stream.
   :throws SFRMMessageException: if unable to construct from the given content stream.

Methods
-------
addHeader
^^^^^^^^^

.. java:method:: public void addHeader(String name, String value)
   :outertype: SFRMMessage

   Adds a message header of the specified name.

   :param name: the header name.
   :param value: the header value.

clone
^^^^^

.. java:method:: protected Object clone() throws CloneNotSupportedException
   :outertype: SFRMMessage

   :return: returns a clone for this Message.

decrypt
^^^^^^^

.. java:method:: public void decrypt(X509Certificate cert, PrivateKey privateKey) throws SFRMException
   :outertype: SFRMMessage

digest
^^^^^^

.. java:method:: public static String digest(InputStream inStream) throws SFRMMessageException
   :outertype: SFRMMessage

digest
^^^^^^

.. java:method:: public static String digest(FileRegionDataSource frds) throws SFRMMessageException
   :outertype: SFRMMessage

digest
^^^^^^

.. java:method:: public String digest() throws SFRMException
   :outertype: SFRMMessage

encrypt
^^^^^^^

.. java:method:: public void encrypt(X509Certificate cert, String encryptAlg) throws SFRMException
   :outertype: SFRMMessage

getBodyPart
^^^^^^^^^^^

.. java:method:: public MimeBodyPart getBodyPart()
   :outertype: SFRMMessage

   Gets the MIME body part of this message.

   :return: the MIME body part.

getClassifier
^^^^^^^^^^^^^

.. java:method:: public SFRMMessageClassifier getClassifier()
   :outertype: SFRMMessage

   :return: a message classifier for this message.

getContent
^^^^^^^^^^

.. java:method:: public Object getContent() throws SFRMMessageException
   :outertype: SFRMMessage

   Gets the content of payload from this message.

   :throws SFRMMessageException: if unable to get the content.
   :return: the content part.

getContentStream
^^^^^^^^^^^^^^^^

.. java:method:: public InputStream getContentStream() throws IOException
   :outertype: SFRMMessage

   Gets the content stream of this message.

   :return: the content stream of this message. null if there is no content.

getContentType
^^^^^^^^^^^^^^

.. java:method:: public String getContentType() throws SFRMMessageException
   :outertype: SFRMMessage

   Gets the content type of the payload from this message.

   :throws SFRMMessageException: if unable to get the content type.
   :return: the content type.

getConverationId
^^^^^^^^^^^^^^^^

.. java:method:: public String getConverationId()
   :outertype: SFRMMessage

   :return: the SFRM conversation id from the message.

getFilename
^^^^^^^^^^^

.. java:method:: public String getFilename()
   :outertype: SFRMMessage

   Get the filename of SFRM payload

   :return: filename of the SFRM payload

getHeader
^^^^^^^^^

.. java:method:: public String getHeader(String name)
   :outertype: SFRMMessage

   Gets a message header of the specified name.

   :param name: the header name.
   :return: the header value.

getHeader
^^^^^^^^^

.. java:method:: public String getHeader(String name, String def)
   :outertype: SFRMMessage

   Gets a message header of the specified name.

   :param name: the header name.
   :param def: the default value.
   :return: the header value.

getHeaders
^^^^^^^^^^

.. java:method:: public InternetHeaders getHeaders()
   :outertype: SFRMMessage

   Gets the headers of this message.

   :return: a copy of the headers of this message.

getHostname
^^^^^^^^^^^

.. java:method:: public String getHostname()
   :outertype: SFRMMessage

   :return: the host name of the message.

getInputStream
^^^^^^^^^^^^^^

.. java:method:: public InputStream getInputStream() throws SFRMMessageException
   :outertype: SFRMMessage

   Gets the input stream of this message's content. Any transfer encodings will be decoded before the input stream is provided.

   :throws SFRMMessageException: if unable to retrieve the stream.
   :return: the input stream of this message's content.

getMessageID
^^^^^^^^^^^^

.. java:method:: public String getMessageID()
   :outertype: SFRMMessage

   Gets the message ID.

   :return: the message ID.

getMicValue
^^^^^^^^^^^

.. java:method:: public String getMicValue()
   :outertype: SFRMMessage

   :return: the mic value of this message.

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: SFRMMessage

   :return: the SFRM partnership id from the message.

getSegmentLength
^^^^^^^^^^^^^^^^

.. java:method:: public long getSegmentLength()
   :outertype: SFRMMessage

   :return: the SFRM segment length from this message.

getSegmentNo
^^^^^^^^^^^^

.. java:method:: public int getSegmentNo()
   :outertype: SFRMMessage

   :return: the SFRM segmet no from the message.

getSegmentOffset
^^^^^^^^^^^^^^^^

.. java:method:: public long getSegmentOffset()
   :outertype: SFRMMessage

   :return: the SFRM segment offset position from the message.

getSegmentType
^^^^^^^^^^^^^^

.. java:method:: public String getSegmentType()
   :outertype: SFRMMessage

   :return: the SFRM segment type from the message.

getTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public int getTotalSegment()
   :outertype: SFRMMessage

   :return: get the total segment in the meta message.

getTotalSize
^^^^^^^^^^^^

.. java:method:: public long getTotalSize()
   :outertype: SFRMMessage

   :return: the total size of payload in the meta message.

getVersion
^^^^^^^^^^

.. java:method:: public String getVersion()
   :outertype: SFRMMessage

   :return: the SFRM Version from the message.

isEncryptedContentType
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isEncryptedContentType() throws SFRMException
   :outertype: SFRMMessage

isSignedContentType
^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isSignedContentType() throws SFRMException
   :outertype: SFRMMessage

removeHeader
^^^^^^^^^^^^

.. java:method:: public void removeHeader(String name)
   :outertype: SFRMMessage

   Removes a message header of the specified name.

   :param name: the header name.

setBodyPart
^^^^^^^^^^^

.. java:method:: public void setBodyPart(MimeBodyPart bp)
   :outertype: SFRMMessage

   Sets the MIME body part of this message.

   :param bp: the new MIME body part.

setContent
^^^^^^^^^^

.. java:method:: public void setContent(Object content, String contentType) throws SFRMMessageException
   :outertype: SFRMMessage

   Sets a content to this message.

   :param content: the content part.
   :param contentType: the content type.
   :throws SFRMMessageException: if unable to set the content.

setContent
^^^^^^^^^^

.. java:method:: public void setContent(Object content, String contentType, String transferEncoding) throws SFRMMessageException
   :outertype: SFRMMessage

setConversationId
^^^^^^^^^^^^^^^^^

.. java:method:: public void setConversationId(String conversationId)
   :outertype: SFRMMessage

   Set the conversation id of this message.

   :param conversationId: The conversation id.

setFilename
^^^^^^^^^^^

.. java:method:: public void setFilename(String filename)
   :outertype: SFRMMessage

   Set the filename of the SFRM payload

   :param filename: the filename of the SFRM payload to be set

setHeader
^^^^^^^^^

.. java:method:: public void setHeader(String name, String value)
   :outertype: SFRMMessage

   Sets a message header of the specified name.

   :param name: the header name.
   :param value: the header value.

setIsEncrypted
^^^^^^^^^^^^^^

.. java:method:: public void setIsEncrypted(boolean isEncrypted)
   :outertype: SFRMMessage

   Set whether the message is encrypted.

   :param isEncrypted: true if encrypted, false vice versa.

setIsSigned
^^^^^^^^^^^

.. java:method:: public void setIsSigned(boolean isSigned)
   :outertype: SFRMMessage

   Set whether the message is signed.

   :param isSigned: true if signed, false vice versa.

setMessageID
^^^^^^^^^^^^

.. java:method:: public void setMessageID(String messageId)
   :outertype: SFRMMessage

   Set the message id of this message.

   :param messageId: The message id of this message.

setMicValue
^^^^^^^^^^^

.. java:method:: public void setMicValue(String micValue) throws SFRMMessageException
   :outertype: SFRMMessage

   Set the MIC value of the message. I.e. the checksum of this message.

   :param micValue: the mic value of this message.

setPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipId(String partnershipId)
   :outertype: SFRMMessage

   Set the partnership id of the message.

setSegmentLength
^^^^^^^^^^^^^^^^

.. java:method:: public void setSegmentLength(long length)
   :outertype: SFRMMessage

   Set the segment payload into this message. The segment length will only be set when it is greater than or equal to zero.

   :param length: The length of this segment.

setSegmentNo
^^^^^^^^^^^^

.. java:method:: public void setSegmentNo(int segmentNo)
   :outertype: SFRMMessage

   Set the segment number of the message. The segment number will only be set when it is greater than or equal to zero.

   :param segmentNo: The segment number of message.

setSegmentOffset
^^^^^^^^^^^^^^^^

.. java:method:: public void setSegmentOffset(long offset)
   :outertype: SFRMMessage

   Set the segment offset of this message. The segment offset will only be set when it is greater than or equal to zero.

   :param offset: The offset of this segment.

setSegmentType
^^^^^^^^^^^^^^

.. java:method:: public void setSegmentType(String segmentType)
   :outertype: SFRMMessage

   Set the segment type of the message. It can only be either "META", "PAYLOAD", "RECEIPT" AND "RECOVERY".

   :param segmentType: The segment type of the message.

setTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public void setTotalSegment(int totalSegment)
   :outertype: SFRMMessage

   Set the total segment in the meta message.

   :param totalSegment: The total segment of the message.

setTotalSize
^^^^^^^^^^^^

.. java:method:: public void setTotalSize(long totalSize)
   :outertype: SFRMMessage

   Set the total size in the meta message.

   :param totalSize: The total size of the message.

sign
^^^^

.. java:method:: public void sign(X509Certificate cert, PrivateKey privateKey, String digestAlg) throws SFRMException
   :outertype: SFRMMessage

toByteArray
^^^^^^^^^^^

.. java:method:: public byte[] toByteArray() throws SFRMMessageException
   :outertype: SFRMMessage

   Returns a byte array which represents this message contnet.

   :throws SFRMMessageException: if unable to convert this message into bytes.
   :return: a byte array which represents this message.

toByteBuffer
^^^^^^^^^^^^

.. java:method:: public ByteBuffer toByteBuffer(boolean hardwareBuffer) throws SFRMMessageException
   :outertype: SFRMMessage

   Returns a byte buffer which represents this message content, i.e. a MIME body part byte buffer.

   :param hardwareBuffer:

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: SFRMMessage

   Returns a string representation of this message.

   :return: a string representation of this message.

   **See also:** :java:ref:`java.lang.Object.toString()`

verify
^^^^^^

.. java:method:: public void verify(X509Certificate cert) throws SFRMException
   :outertype: SFRMMessage

writeTo
^^^^^^^

.. java:method:: public void writeTo(OutputStream outs) throws SFRMMessageException
   :outertype: SFRMMessage

   Writes the message to the given output stream.

   :param outs: the output stream to be written.
   :throws SFRMMessageException: if unable to write the message.


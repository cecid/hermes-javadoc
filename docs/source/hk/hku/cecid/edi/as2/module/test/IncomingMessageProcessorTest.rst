.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io InputStream

.. java:import:: java.lang.reflect Method

.. java:import:: java.security MessageDigest

.. java:import:: java.security.cert CertStore

.. java:import:: java.security.cert CollectionCertStoreParameters

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.util ArrayList

.. java:import:: javax.activation CommandMap

.. java:import:: javax.activation MailcapCommandMap

.. java:import:: javax.mail.internet InternetHeaders

.. java:import:: javax.mail.internet MimeBodyPart

.. java:import:: javax.mail.internet MimeMultipart

.. java:import:: junit.framework Assert

.. java:import:: org.bouncycastle.asn1 ASN1EncodableVector

.. java:import:: org.bouncycastle.asn1 ASN1ObjectIdentifier

.. java:import:: org.bouncycastle.asn1.cms AttributeTable

.. java:import:: org.bouncycastle.asn1.cms IssuerAndSerialNumber

.. java:import:: org.bouncycastle.asn1.smime SMIMECapabilitiesAttribute

.. java:import:: org.bouncycastle.asn1.smime SMIMECapability

.. java:import:: org.bouncycastle.asn1.smime SMIMECapabilityVector

.. java:import:: org.bouncycastle.asn1.smime SMIMEEncryptionKeyPreferenceAttribute

.. java:import:: org.bouncycastle.asn1.x509 X509Name

.. java:import:: org.bouncycastle.cms.jcajce JcaSimpleSignerInfoGeneratorBuilder

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransRecipientInfoGenerator

.. java:import:: org.bouncycastle.cms.jcajce JceCMSContentEncryptorBuilder

.. java:import:: org.bouncycastle.cert.jcajce JcaCertStore

.. java:import:: org.bouncycastle.mail.smime SMIMEEnvelopedGenerator

.. java:import:: org.bouncycastle.mail.smime SMIMESignedGenerator

.. java:import:: org.bouncycastle.util.encoders Base64

.. java:import:: org.junit Test

.. java:import:: hk.hku.cecid.edi.as2.dao AS2DAOHandler

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDAO

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDVO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDAO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDVO

.. java:import:: hk.hku.cecid.edi.as2.dao RepositoryDVO

.. java:import:: hk.hku.cecid.edi.as2.module IncomingMessageProcessor

.. java:import:: hk.hku.cecid.edi.as2.pkg AS2Header

.. java:import:: hk.hku.cecid.edi.as2.pkg AS2Message

.. java:import:: hk.hku.cecid.edi.as2.pkg DispositionNotification

.. java:import:: hk.hku.cecid.edi.as2.pkg DispositionNotificationOption

.. java:import:: hk.hku.cecid.edi.as2.pkg DispositionNotificationOptions

.. java:import:: hk.hku.cecid.piazza.commons.activation InputStreamDataSource

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.security SMimeMessage

.. java:import:: hk.hku.cecid.piazza.commons.test SystemComponentTest

IncomingMessageProcessorTest
============================

.. java:package:: hk.hku.cecid.edi.as2.module.test
   :noindex:

.. java:type:: public class IncomingMessageProcessorTest extends SystemComponentTest<IncomingMessageProcessor>

   Unit Test IncomingMessageProcessor

   :author: Jumbo Cheung

Methods
-------
getSystemComponentId
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public String getSystemComponentId()
   :outertype: IncomingMessageProcessorTest

setUp
^^^^^

.. java:method:: @Override public void setUp() throws Exception
   :outertype: IncomingMessageProcessorTest

tearDown
^^^^^^^^

.. java:method:: @Override public void tearDown() throws Exception
   :outertype: IncomingMessageProcessorTest

testDecryption
^^^^^^^^^^^^^^

.. java:method:: @Test public void testDecryption() throws Exception
   :outertype: IncomingMessageProcessorTest

testDecryptionSignatureVerfication
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testDecryptionSignatureVerfication() throws Exception
   :outertype: IncomingMessageProcessorTest

testSignatureVerfication
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignatureVerfication()
   :outertype: IncomingMessageProcessorTest


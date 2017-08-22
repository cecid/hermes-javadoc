.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io InputStream

.. java:import:: java.security MessageDigest

.. java:import:: java.util Arrays

.. java:import:: java.util Iterator

.. java:import:: javax.activation CommandMap

.. java:import:: javax.activation MailcapCommandMap

.. java:import:: javax.mail.internet MimeBodyPart

.. java:import:: javax.mail.internet MimeMultipart

.. java:import:: org.junit Test

.. java:import:: junit.framework Assert

.. java:import:: org.bouncycastle.cms RecipientId

.. java:import:: org.bouncycastle.cms RecipientInformation

.. java:import:: org.bouncycastle.cms RecipientInformationStore

.. java:import:: org.bouncycastle.cms SignerInformation

.. java:import:: org.bouncycastle.cms SignerInformationStore

.. java:import:: org.bouncycastle.cms SignerInformationVerifier

.. java:import:: org.bouncycastle.cms DefaultCMSSignatureAlgorithmNameGenerator

.. java:import:: org.bouncycastle.cms.bc BcRSASignerInfoVerifierBuilder

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransRecipientId

.. java:import:: org.bouncycastle.cms.jcajce JceKeyTransEnvelopedRecipient

.. java:import:: org.bouncycastle.cms.jcajce ZlibExpanderProvider

.. java:import:: org.bouncycastle.cert.jcajce JcaX509CertificateHolder

.. java:import:: org.bouncycastle.mail.smime SMIMECompressed

.. java:import:: org.bouncycastle.mail.smime SMIMEEnveloped

.. java:import:: org.bouncycastle.mail.smime SMIMESigned

.. java:import:: org.bouncycastle.mail.smime SMIMEUtil

.. java:import:: org.bouncycastle.operator DefaultSignatureAlgorithmIdentifierFinder

.. java:import:: org.bouncycastle.operator DefaultDigestAlgorithmIdentifierFinder

.. java:import:: org.bouncycastle.operator.bc BcDigestCalculatorProvider

.. java:import:: org.bouncycastle.util.encoders Base64

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDAO

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDVO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDAO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDVO

.. java:import:: hk.hku.cecid.edi.as2.module OutgoingMessageProcessor

.. java:import:: hk.hku.cecid.edi.as2.pkg AS2Message

.. java:import:: hk.hku.cecid.piazza.commons.activation InputStreamDataSource

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.test SystemComponentTest

OutgoingMessageProcessorTest
============================

.. java:package:: hk.hku.cecid.edi.as2.module.test
   :noindex:

.. java:type:: public class OutgoingMessageProcessorTest extends SystemComponentTest<OutgoingMessageProcessor>

   Unit Test OutgoingMessageProcessor

   :author: Jumbo Cheung

Fields
------
CREATE_TABLE_SQL
^^^^^^^^^^^^^^^^

.. java:field:: static final String CREATE_TABLE_SQL
   :outertype: OutgoingMessageProcessorTest

DROP_TABLE_SQL
^^^^^^^^^^^^^^

.. java:field:: static final String DROP_TABLE_SQL
   :outertype: OutgoingMessageProcessorTest

partnershipDAO
^^^^^^^^^^^^^^

.. java:field::  PartnershipDAO partnershipDAO
   :outertype: OutgoingMessageProcessorTest

partnershipDVO
^^^^^^^^^^^^^^

.. java:field::  PartnershipDVO partnershipDVO
   :outertype: OutgoingMessageProcessorTest

Methods
-------
getSystemComponentId
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public String getSystemComponentId()
   :outertype: OutgoingMessageProcessorTest

setUp
^^^^^

.. java:method:: @Override public void setUp() throws Exception
   :outertype: OutgoingMessageProcessorTest

tearDown
^^^^^^^^

.. java:method:: @Override public void tearDown() throws Exception
   :outertype: OutgoingMessageProcessorTest

testCompressAS2Message
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testCompressAS2Message() throws Exception
   :outertype: OutgoingMessageProcessorTest

testEncrytedAS2Message
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testEncrytedAS2Message() throws Exception
   :outertype: OutgoingMessageProcessorTest

testPlainMessageMIC
^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testPlainMessageMIC() throws Exception
   :outertype: OutgoingMessageProcessorTest

testSignedAS2Message
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignedAS2Message() throws Exception
   :outertype: OutgoingMessageProcessorTest

testSignedCommpressMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignedCommpressMessage() throws Exception
   :outertype: OutgoingMessageProcessorTest

testSignedEncryptedAS2Message
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignedEncryptedAS2Message() throws Exception
   :outertype: OutgoingMessageProcessorTest


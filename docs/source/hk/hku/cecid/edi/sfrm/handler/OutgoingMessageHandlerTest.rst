.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.util Map

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.dao.ds SFRMPartnershipDSDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler OutgoingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMHeader

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageFactory

.. java:import:: hk.hku.cecid.piazza.commons.net ConnectionException

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.security SMimeException

.. java:import:: hk.hku.cecid.piazza.commons.security SMimeMessage

.. java:import:: hk.hku.cecid.piazza.commons.test SystemComponentTest

.. java:import:: hk.hku.cecid.piazza.commons.test.utils SimpleHttpMonitor

.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.io OutputStream

.. java:import:: java.lang.reflect Method

OutgoingMessageHandlerTest
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class OutgoingMessageHandlerTest extends SystemComponentTest<OutgoingMessageHandler>

   :author: Patrick Yip

Methods
-------
getSystemComponentId
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public String getSystemComponentId()
   :outertype: OutgoingMessageHandlerTest

setUp
^^^^^

.. java:method:: @Override public void setUp() throws Exception
   :outertype: OutgoingMessageHandlerTest

tearDown
^^^^^^^^

.. java:method:: @Override public void tearDown() throws Exception
   :outertype: OutgoingMessageHandlerTest

testCreateHandshakingRequest
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testCreateHandshakingRequest() throws Exception
   :outertype: OutgoingMessageHandlerTest

testEncryptDES3MetaMessge
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testEncryptDES3MetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest

testEncryptMetaMessgeFailed
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testEncryptMetaMessgeFailed() throws Exception
   :outertype: OutgoingMessageHandlerTest

testEncryptRC2MetaMessge
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testEncryptRC2MetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest

testMetaMessgeHeader
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testMetaMessgeHeader() throws Exception
   :outertype: OutgoingMessageHandlerTest

testOutgoingMetaMessageFail
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testOutgoingMetaMessageFail() throws SFRMMessageException, ConnectionException
   :outertype: OutgoingMessageHandlerTest

   Test for sending the handshaking message

   :throws SFRMMessageException:
   :throws SFRMException:
   :throws ConnectionException:
   :throws Exception:

testPlainMetaMessge
^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testPlainMetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest

testSendMetaMessage
^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSendMetaMessage() throws SFRMMessageException, ConnectionException
   :outertype: OutgoingMessageHandlerTest

   Test for sending the handshaking message

   :throws ConnectionException:
   :throws SFRMMessageException:
   :throws Exception:

testSignEncryptMetaMessge
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignEncryptMetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest

testSignMD5MetaMessge
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignMD5MetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest

testSignMetaMessgeFailed
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignMetaMessgeFailed() throws Exception
   :outertype: OutgoingMessageHandlerTest

testSignSHA1MetaMessge
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testSignSHA1MetaMessge() throws Exception
   :outertype: OutgoingMessageHandlerTest


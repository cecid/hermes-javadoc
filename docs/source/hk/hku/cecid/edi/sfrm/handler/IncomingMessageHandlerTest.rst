.. java:import:: hk.hku.cecid.piazza.commons.test PluginTest

.. java:import:: hk.hku.cecid.piazza.commons.test.utils ResSetter

.. java:import:: hk.hku.cecid.edi.sfrm.handler IncomingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementParser

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: java.io File

.. java:import:: java.io FileInputStream

.. java:import:: java.io InputStreamReader

.. java:import:: org.junit Test

.. java:import:: java.net MalformedURLException

IncomingMessageHandlerTest
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class IncomingMessageHandlerTest extends PluginTest<SFRMProcessor>

   :author: Patrick Yip

Methods
-------
getDBName
^^^^^^^^^

.. java:method:: public String getDBName()
   :outertype: IncomingMessageHandlerTest

getDSDAO
^^^^^^^^

.. java:method:: public DataSourceDAO getDSDAO() throws Exception
   :outertype: IncomingMessageHandlerTest

init
^^^^

.. java:method:: public void init()
   :outertype: IncomingMessageHandlerTest

postSetUp
^^^^^^^^^

.. java:method:: public void postSetUp() throws Exception
   :outertype: IncomingMessageHandlerTest

postTearDown
^^^^^^^^^^^^

.. java:method:: public void postTearDown() throws Exception
   :outertype: IncomingMessageHandlerTest

testMetaReceived
^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testMetaReceived() throws Exception
   :outertype: IncomingMessageHandlerTest

testMetaReceivedPartnershipNonExist
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testMetaReceivedPartnershipNonExist() throws Exception
   :outertype: IncomingMessageHandlerTest

testProcessPDFAck
^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testProcessPDFAck() throws Exception
   :outertype: IncomingMessageHandlerTest

testProcessPPSAck
^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testProcessPPSAck() throws Exception
   :outertype: IncomingMessageHandlerTest

testProcessPRAck
^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testProcessPRAck() throws Exception
   :outertype: IncomingMessageHandlerTest

testProcessPRSAck
^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testProcessPRSAck() throws Exception
   :outertype: IncomingMessageHandlerTest

testProcessPSDAck
^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testProcessPSDAck() throws Exception
   :outertype: IncomingMessageHandlerTest


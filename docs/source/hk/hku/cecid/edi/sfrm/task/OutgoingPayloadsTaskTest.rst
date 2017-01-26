.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.task OutgoingPayloadsTask

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.piazza.commons.net ConnectionException

.. java:import:: hk.hku.cecid.piazza.commons.test PluginTest

.. java:import:: hk.hku.cecid.piazza.commons.test.utils ResSetter

.. java:import:: hk.hku.cecid.piazza.commons.test.utils SimpleHttpMonitor

.. java:import:: java.io IOException

.. java:import:: java.io OutputStream

.. java:import:: java.util Iterator

.. java:import:: java.util List

OutgoingPayloadsTaskTest
========================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class OutgoingPayloadsTaskTest extends PluginTest<SFRMProcessor>

Methods
-------
getDBName
^^^^^^^^^

.. java:method:: @Override public String getDBName()
   :outertype: OutgoingPayloadsTaskTest

getDSDAO
^^^^^^^^

.. java:method:: @Override public DataSourceDAO getDSDAO() throws Exception
   :outertype: OutgoingPayloadsTaskTest

init
^^^^

.. java:method:: @Override public void init()
   :outertype: OutgoingPayloadsTaskTest

postSetUp
^^^^^^^^^

.. java:method:: public void postSetUp() throws Exception
   :outertype: OutgoingPayloadsTaskTest

postTearDown
^^^^^^^^^^^^

.. java:method:: public void postTearDown() throws Exception
   :outertype: OutgoingPayloadsTaskTest

testSendMeta
^^^^^^^^^^^^

.. java:method:: public void testSendMeta() throws Exception
   :outertype: OutgoingPayloadsTaskTest

   Test if handshaking is success

   :throws Exception:

testSendMetaFailed
^^^^^^^^^^^^^^^^^^

.. java:method:: public void testSendMetaFailed() throws Exception
   :outertype: OutgoingPayloadsTaskTest

   Test with handshaking, that the mock server responsed with 400 bad request

   :throws Exception:

testSendMetaFailedNotConnection
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testSendMetaFailedNotConnection() throws Exception
   :outertype: OutgoingPayloadsTaskTest

   Test if the mock server was not started up, not connection establish

   :throws Exception:


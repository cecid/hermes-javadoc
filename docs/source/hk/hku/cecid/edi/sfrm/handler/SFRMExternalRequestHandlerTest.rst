.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.test PluginTest

SFRMExternalRequestHandlerTest
==============================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMExternalRequestHandlerTest extends PluginTest<SFRMProcessor>

Methods
-------
getDBName
^^^^^^^^^

.. java:method:: @Override public String getDBName()
   :outertype: SFRMExternalRequestHandlerTest

getDSDAO
^^^^^^^^

.. java:method:: @Override public DataSourceDAO getDSDAO() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

init
^^^^

.. java:method:: @Override public void init()
   :outertype: SFRMExternalRequestHandlerTest

testResumeMessage
^^^^^^^^^^^^^^^^^

.. java:method:: public void testResumeMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

testResumeNonExistingMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testResumeNonExistingMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

   Test if client want to resume the non-existing message

   :throws Exception:

testResumeProcessedMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testResumeProcessedMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

   Test if client want to resume the processed message

   :throws Exception:

testSuspendMessage
^^^^^^^^^^^^^^^^^^

.. java:method:: public void testSuspendMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

testSuspendNonExistMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testSuspendNonExistMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest

testSuspendProcessedMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testSuspendProcessedMessage() throws Exception
   :outertype: SFRMExternalRequestHandlerTest


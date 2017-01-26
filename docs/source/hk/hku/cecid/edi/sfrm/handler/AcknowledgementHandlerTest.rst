.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.test PluginTest

.. java:import:: hk.hku.cecid.piazza.commons.test.utils ResSetter

.. java:import:: hk.hku.cecid.edi.sfrm.handler AcknowledgementHandler

.. java:import:: java.io FileReader

.. java:import:: java.io File

AcknowledgementHandlerTest
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class AcknowledgementHandlerTest extends PluginTest<SFRMProcessor>

Methods
-------
getDBName
^^^^^^^^^

.. java:method:: @Override public String getDBName()
   :outertype: AcknowledgementHandlerTest

getDSDAO
^^^^^^^^

.. java:method:: @Override public DataSourceDAO getDSDAO() throws Exception
   :outertype: AcknowledgementHandlerTest

init
^^^^

.. java:method:: @Override public void init()
   :outertype: AcknowledgementHandlerTest

postSetUp
^^^^^^^^^

.. java:method:: @Override public void postSetUp() throws Exception
   :outertype: AcknowledgementHandlerTest

postTearDown
^^^^^^^^^^^^

.. java:method:: @Override public void postTearDown() throws Exception
   :outertype: AcknowledgementHandlerTest

testMarkMessagePreCompleted
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testMarkMessagePreCompleted() throws Exception
   :outertype: AcknowledgementHandlerTest

   Test if the message status will change to pre-processed, accordingly to the acknowledgement response

   :throws Exception:

testUpdateMessageDF
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testUpdateMessageDF() throws Exception
   :outertype: AcknowledgementHandlerTest

   Test for dealing with the DF response from receiver

   :throws Exception:

testUpdateMessagePS
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testUpdateMessagePS() throws Exception
   :outertype: AcknowledgementHandlerTest

   Test for dealing with the PS response from receiver

   :throws Exception:

testUpdateMessageSD
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testUpdateMessageSD() throws Exception
   :outertype: AcknowledgementHandlerTest

   Test for dealing with the SD response from receiver

   :throws Exception:

testUpdateMessageSegmentForPRMessage
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testUpdateMessageSegmentForPRMessage() throws Exception
   :outertype: AcknowledgementHandlerTest

   Test if the segment was updated corrspending to the message segment acknowledgement response

   :throws Exception:


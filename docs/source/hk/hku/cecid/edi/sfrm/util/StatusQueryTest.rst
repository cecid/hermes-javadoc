.. java:import:: junit.framework Assert

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.test PluginTest

StatusQueryTest
===============

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class StatusQueryTest extends PluginTest<SFRMProcessor>

   :author: Patrick Yip

Methods
-------
getDBName
^^^^^^^^^

.. java:method:: @Override public String getDBName()
   :outertype: StatusQueryTest

getDSDAO
^^^^^^^^

.. java:method:: @Override public DataSourceDAO getDSDAO() throws Exception
   :outertype: StatusQueryTest

init
^^^^

.. java:method:: @Override public void init()
   :outertype: StatusQueryTest

testCheckMessageStatus
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testCheckMessageStatus() throws Exception
   :outertype: StatusQueryTest

   Test for checking the message progress status

   :throws Exception:

testCheckMessageStatusNotStarted
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testCheckMessageStatusNotStarted() throws Exception
   :outertype: StatusQueryTest

   Test for if checking the message without called start method of StatusQuery

   :throws Exception:

testCheckNonExistingMessageStatus
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testCheckNonExistingMessageStatus() throws Exception
   :outertype: StatusQueryTest

   Test for checking the message which is non-existing

   :throws Exception:


.. java:import:: java.io File

.. java:import:: java.io InputStream

.. java:import:: java.net URL

.. java:import:: java.sql Connection

.. java:import:: java.sql SQLException

.. java:import:: java.sql Statement

.. java:import:: java.util Random

.. java:import:: org.junit After

.. java:import:: org.junit Assert

.. java:import:: org.junit Before

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceProcess

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceTransaction

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.module ModuleGroup

.. java:import:: hk.hku.cecid.piazza.commons.module SystemComponent

.. java:import:: hk.hku.cecid.piazza.commons.test.utils FixtureStore

.. java:import:: hk.hku.cecid.piazza.commons.util Logger

SystemComponentTest
===================

.. java:package:: hk.hku.cecid.piazza.commons.test
   :noindex:

.. java:type:: public abstract class SystemComponentTest<SC extends SystemComponent>

Fields
------
FIXTURE_LOADER
^^^^^^^^^^^^^^

.. java:field:: protected ClassLoader FIXTURE_LOADER
   :outertype: SystemComponentTest

LOG
^^^

.. java:field:: protected Logger LOG
   :outertype: SystemComponentTest

MODULE_GROUP
^^^^^^^^^^^^

.. java:field:: protected ModuleGroup MODULE_GROUP
   :outertype: SystemComponentTest

MODULE_GROUP_XML
^^^^^^^^^^^^^^^^

.. java:field:: protected static String MODULE_GROUP_XML
   :outertype: SystemComponentTest

RANDOM
^^^^^^

.. java:field:: protected Random RANDOM
   :outertype: SystemComponentTest

TARGET
^^^^^^

.. java:field:: protected SC TARGET
   :outertype: SystemComponentTest

TMP_DIR
^^^^^^^

.. java:field:: protected File TMP_DIR
   :outertype: SystemComponentTest

Methods
-------
after
^^^^^

.. java:method:: @After public void after() throws Exception
   :outertype: SystemComponentTest

before
^^^^^^

.. java:method:: @Before public void before() throws Exception
   :outertype: SystemComponentTest

commitSQL
^^^^^^^^^

.. java:method:: protected void commitSQL(Class<? extends DAO> daoClass, String sqlName) throws Exception
   :outertype: SystemComponentTest

getSystemComponentId
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract String getSystemComponentId()
   :outertype: SystemComponentTest

initDatasourceDAO
^^^^^^^^^^^^^^^^^

.. java:method:: protected DataSourceDAO initDatasourceDAO(Class<? extends DAO> daoClass) throws DAOException
   :outertype: SystemComponentTest

setUp
^^^^^

.. java:method:: public abstract void setUp() throws Exception
   :outertype: SystemComponentTest

tearDown
^^^^^^^^

.. java:method:: public abstract void tearDown() throws Exception
   :outertype: SystemComponentTest


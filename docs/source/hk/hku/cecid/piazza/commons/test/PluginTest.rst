.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceProcess

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceTransaction

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.spa PluginHandler

.. java:import:: hk.hku.cecid.piazza.commons.spa Plugin

.. java:import:: hk.hku.cecid.piazza.commons.test.utils FixtureStore

.. java:import:: junit.framework TestCase

.. java:import:: java.io File

.. java:import:: java.io InputStream

.. java:import:: java.lang.reflect ParameterizedType

.. java:import:: java.lang.reflect Type

.. java:import:: java.net URL

.. java:import:: java.sql Connection

.. java:import:: java.sql SQLException

.. java:import:: java.sql Statement

.. java:import:: org.junit Assert

PluginTest
==========

.. java:package:: hk.hku.cecid.piazza.commons.test
   :noindex:

.. java:type:: public abstract class PluginTest<T extends PluginHandler> extends TestCase

   Testing class used to kick up all the necessary thing for testing the plugin

   :author: Patrick Yip
   :param <T>: the Processor class to test against with

Fields
------
CREATE_SQL_SUFFIX
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String CREATE_SQL_SUFFIX
   :outertype: PluginTest

DROP_SQL_SUFFIX
^^^^^^^^^^^^^^^

.. java:field:: public static final String DROP_SQL_SUFFIX
   :outertype: PluginTest

FIXTURE_LOADER
^^^^^^^^^^^^^^

.. java:field:: protected ClassLoader FIXTURE_LOADER
   :outertype: PluginTest

INSERT_SQL_SUFFIX
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String INSERT_SQL_SUFFIX
   :outertype: PluginTest

baseFile
^^^^^^^^

.. java:field:: protected File baseFile
   :outertype: PluginTest

isLoadDB
^^^^^^^^

.. java:field:: protected boolean isLoadDB
   :outertype: PluginTest

pluginDescriptor
^^^^^^^^^^^^^^^^

.. java:field:: public static final String pluginDescriptor
   :outertype: PluginTest

processor
^^^^^^^^^

.. java:field:: protected PluginHandler processor
   :outertype: PluginTest

Methods
-------
commitSQL
^^^^^^^^^

.. java:method:: public void commitSQL(String fixtureName) throws Exception
   :outertype: PluginTest

getDBName
^^^^^^^^^

.. java:method:: public abstract String getDBName()
   :outertype: PluginTest

getDSDAO
^^^^^^^^

.. java:method:: public abstract DataSourceDAO getDSDAO() throws Exception
   :outertype: PluginTest

getParameterizedClass
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public Class getParameterizedClass()
   :outertype: PluginTest

init
^^^^

.. java:method:: public abstract void init()
   :outertype: PluginTest

loadDB
^^^^^^

.. java:method:: public void loadDB() throws Exception
   :outertype: PluginTest

postSetUp
^^^^^^^^^

.. java:method:: public void postSetUp() throws Exception
   :outertype: PluginTest

postTearDown
^^^^^^^^^^^^

.. java:method:: public void postTearDown() throws Exception
   :outertype: PluginTest

setUp
^^^^^

.. java:method:: @SuppressWarnings public void setUp() throws Exception
   :outertype: PluginTest

   Setup the plugin module

tearDown
^^^^^^^^

.. java:method:: public void tearDown() throws Exception
   :outertype: PluginTest

unloadDB
^^^^^^^^

.. java:method:: public void unloadDB() throws Exception
   :outertype: PluginTest


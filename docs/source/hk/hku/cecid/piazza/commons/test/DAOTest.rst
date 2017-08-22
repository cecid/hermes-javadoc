.. java:import:: java.io InputStream

.. java:import:: java.sql Connection

.. java:import:: java.sql SQLException

.. java:import:: java.sql Statement

.. java:import:: java.lang.reflect Type

.. java:import:: java.lang.reflect ParameterizedType

.. java:import:: java.net URL

.. java:import:: org.junit After

.. java:import:: org.junit Assert

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOFactory

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceProcess

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceTransaction

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.module Module

.. java:import:: hk.hku.cecid.piazza.commons.util Logger

DAOTest
=======

.. java:package:: hk.hku.cecid.piazza.commons.test
   :noindex:

.. java:type:: public abstract class DAOTest<T extends DataSourceDAO> extends UnitTest<T>

   The \ ``DAOTest``\  is base class for testing DAO.

   :author: Twinsen Tsang
   :param <T>: The class which implements DataSourceDAO.

   **See also:** :java:ref:`DataSourceDAO`

Fields
------
CREATE_SQL_SUFFIX
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String CREATE_SQL_SUFFIX
   :outertype: DAOTest

DROP_SQL_SUFFIX
^^^^^^^^^^^^^^^

.. java:field:: public static final String DROP_SQL_SUFFIX
   :outertype: DAOTest

INSERT_SQL_SUFFIX
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String INSERT_SQL_SUFFIX
   :outertype: DAOTest

MODULE_XML_DESCRIPTOR_SUFFIX
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String MODULE_XML_DESCRIPTOR_SUFFIX
   :outertype: DAOTest

container
^^^^^^^^^

.. java:field:: protected Module container
   :outertype: DAOTest

containerLogger
^^^^^^^^^^^^^^^

.. java:field:: protected Logger containerLogger
   :outertype: DAOTest

daoFactory
^^^^^^^^^^

.. java:field:: protected DAOFactory daoFactory
   :outertype: DAOTest

Constructors
------------
DAOTest
^^^^^^^

.. java:constructor:: public DAOTest()
   :outertype: DAOTest

   Create an instance of \ ``DAOTest``\ . By default, it disable JMOCK features for reducing dependency.

DAOTest
^^^^^^^

.. java:constructor:: public DAOTest(boolean noMocking)
   :outertype: DAOTest

   Create an instance of \ ``DAOTest``\ .

   :param noMocking: the flag representing the test requires object mocking or not ?

Methods
-------
commitSQL
^^^^^^^^^

.. java:method:: protected void commitSQL(String fixtureName) throws Exception
   :outertype: DAOTest

   This is a helper function for commit SQL from Fixture.

createDAOContainer
^^^^^^^^^^^^^^^^^^

.. java:method:: public Module createDAOContainer() throws Exception
   :outertype: DAOTest

   This is the factory to create the DAO container (typically it is a common module). Sub-class may override this to customize the DAO container.

dropTable
^^^^^^^^^

.. java:method:: public synchronized void dropTable() throws Exception
   :outertype: DAOTest

   Drop the table for next test-case.

getTableName
^^^^^^^^^^^^

.. java:method:: public abstract String getTableName()
   :outertype: DAOTest

   Return the DB table name accessed by this DAO.

   :return: the DB table name accessed by this DAO.

getTestContainer
^^^^^^^^^^^^^^^^

.. java:method:: public Module getTestContainer()
   :outertype: DAOTest

initTestTarget
^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public synchronized void initTestTarget() throws Exception
   :outertype: DAOTest

   Initialize the test target for this test-case.  A Special piazza common module is constructed during this initialization. We will call the module as a container of our test-case because the \ ``DAO``\  can only be constructed through \ ``DAOFactory``\ .  Moreover, we have to create the database table and insert some SQL for testing because of non-persistence database has been adopted for performing unit-testing.

tearDown
^^^^^^^^

.. java:method:: @Override public void tearDown() throws Exception
   :outertype: DAOTest


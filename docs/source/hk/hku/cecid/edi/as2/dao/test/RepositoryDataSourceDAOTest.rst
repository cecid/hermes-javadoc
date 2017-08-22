.. java:import:: java.io InputStream

.. java:import:: java.util Date

.. java:import:: org.junit After

.. java:import:: org.junit Before

.. java:import:: org.junit Test

.. java:import:: hk.hku.cecid.edi.as2.dao RepositoryDVO

.. java:import:: hk.hku.cecid.edi.as2.dao RepositoryDataSourceDAO

.. java:import:: hk.hku.cecid.edi.as2.pkg AS2Message

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.test DAOTest

.. java:import:: hk.hku.cecid.piazza.commons.test.utils FixtureStore

RepositoryDataSourceDAOTest
===========================

.. java:package:: hk.hku.cecid.edi.as2.dao.test
   :noindex:

.. java:type:: public class RepositoryDataSourceDAOTest extends DAOTest<RepositoryDataSourceDAO>

Methods
-------
dropRecord
^^^^^^^^^^

.. java:method:: @After public void dropRecord() throws Exception
   :outertype: RepositoryDataSourceDAOTest

getTableName
^^^^^^^^^^^^

.. java:method:: @Override public String getTableName()
   :outertype: RepositoryDataSourceDAOTest

initialTest
^^^^^^^^^^^

.. java:method:: @Before public void initialTest() throws Exception
   :outertype: RepositoryDataSourceDAOTest

insertRepositoryRecord
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void insertRepositoryRecord() throws DAOException, Exception
   :outertype: RepositoryDataSourceDAOTest

setUp
^^^^^

.. java:method:: @Override public void setUp() throws Exception
   :outertype: RepositoryDataSourceDAOTest

updateRepositoryRecord
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void updateRepositoryRecord() throws DAOException, Exception
   :outertype: RepositoryDataSourceDAOTest


.. java:import:: org.junit Assert

.. java:import:: org.junit Test

.. java:import:: java.io File

.. java:import:: java.util Collection

.. java:import:: java.util Iterator

.. java:import:: hk.hku.cecid.piazza.commons.test SystemComponentTest

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloadsRepository

.. java:import:: hk.hku.cecid.piazza.commons.test.utils ResSetter

PackagedPayloadsRepositoryTest
==============================

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public class PackagedPayloadsRepositoryTest extends SystemComponentTest<PackagedPayloadsRepository>

Methods
-------
getSystemComponentId
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Override public String getSystemComponentId()
   :outertype: PackagedPayloadsRepositoryTest

setUp
^^^^^

.. java:method:: public void setUp() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

tearDown
^^^^^^^^

.. java:method:: public void tearDown() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

testCreateProcessingPayload
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testCreateProcessingPayload() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

   Test creating a processing payload

   :throws Exception:

testFindingRepository
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testFindingRepository() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

testGetPayloads
^^^^^^^^^^^^^^^

.. java:method:: @Test public void testGetPayloads() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

   Test number of payload in repository

   :throws Exception:

testGetReadyPayloads
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testGetReadyPayloads() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

   Test whether it can retreive the payload that is ready to send

   :throws Exception:

testRenamePayloadToProcessed
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testRenamePayloadToProcessed() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

   Test renaming the payload to processed status

   :throws Exception:

testRenamePayloadToProcessing
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testRenamePayloadToProcessing() throws Exception
   :outertype: PackagedPayloadsRepositoryTest

   Test renaming the payload to processing status

   :throws Exception:


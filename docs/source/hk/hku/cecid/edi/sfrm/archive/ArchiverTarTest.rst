.. java:import:: java.io File

.. java:import:: hk.hku.cecid.piazza.commons.os OSCommander

.. java:import:: hk.hku.cecid.piazza.commons.test.utils FixtureStore

.. java:import:: junit.framework Assert

.. java:import:: junit.framework TestCase

ArchiverTarTest
===============

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class ArchiverTarTest extends TestCase

   :author: Patrick Yip

Methods
-------
setUp
^^^^^

.. java:method:: public void setUp()
   :outertype: ArchiverTarTest

tearDown
^^^^^^^^

.. java:method:: public void tearDown()
   :outertype: ArchiverTarTest

testCompressFile
^^^^^^^^^^^^^^^^

.. java:method:: public void testCompressFile() throws Exception
   :outertype: ArchiverTarTest

   Test for tar a file

   :throws Exception:

testCompressLongFileName
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testCompressLongFileName() throws Exception
   :outertype: ArchiverTarTest

   Test for tar the file with long filename, for traditional tar format , it only support the tar entry name <= 100 characters

   :throws Exception:

testExtractFile
^^^^^^^^^^^^^^^

.. java:method:: public void testExtractFile() throws Exception
   :outertype: ArchiverTarTest

   Test for untar the file Notice: Run this test should have at least 4GB disk space

   :throws Exception:


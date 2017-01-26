.. java:import:: hk.hku.cecid.edi.sfrm.util TimedOutEntryListener

.. java:import:: hk.hku.cecid.edi.sfrm.util TimedOutHashTable

.. java:import:: junit.framework TestCase

TimedOutHashTableTest
=====================

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class TimedOutHashTableTest extends TestCase

   The test case for \ ``TimedOutHashTable``\ . Creation Date: 25/6/2007

   :author: Twinsen Tsang

Methods
-------
setUp
^^^^^

.. java:method:: public void setUp() throws Exception
   :outertype: TimedOutHashTableTest

   Setup for testing.

tearDown
^^^^^^^^

.. java:method:: public void tearDown() throws Exception
   :outertype: TimedOutHashTableTest

   Invoked for completing one testcase

testContain
^^^^^^^^^^^

.. java:method:: public void testContain() throws Exception
   :outertype: TimedOutHashTableTest

   Test for existence of the putting object using method \ ``contain``\ .

testContainValue
^^^^^^^^^^^^^^^^

.. java:method:: public void testContainValue() throws Exception
   :outertype: TimedOutHashTableTest

   Test for existence of the putting object using method \ ``containValue``\ .

testGet
^^^^^^^

.. java:method:: public void testGet() throws Exception
   :outertype: TimedOutHashTableTest

   Test for getting object from the hashtable using \ ``get``\

testMultiplePutWithMixed
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testMultiplePutWithMixed() throws Exception
   :outertype: TimedOutHashTableTest

   Test for putting multiple object with some time out specified while some don't. It then check whether some records are swept out after [sweeping_interval + timeout value].

testMultiplePutWithTimeout
^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testMultiplePutWithTimeout() throws Exception
   :outertype: TimedOutHashTableTest

   Test for putting multiple object with time out specified and see whether all records are swept out after [sweeping_interval + timeout value].

testPut
^^^^^^^

.. java:method:: public void testPut() throws Exception
   :outertype: TimedOutHashTableTest

   Test for simple and normal scenario for putting object.

testPutWithTimeout
^^^^^^^^^^^^^^^^^^

.. java:method:: public void testPutWithTimeout() throws Exception
   :outertype: TimedOutHashTableTest

   Test for putting a object with time out specific and see whether it will timeout after maximum time [sweeping_interval + timeout value].

testSetListener
^^^^^^^^^^^^^^^

.. java:method:: public void testSetListener() throws Exception
   :outertype: TimedOutHashTableTest

   Test for setting the customized listener for handling timeout entry.


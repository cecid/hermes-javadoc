.. java:import:: junit.framework TestCase

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

SFRMDoSHandlerTest
==================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMDoSHandlerTest extends TestCase

   The test-case of \ ``SFRMDoSHandler``\ . Creation Date: 03/07/2007

   :author: Twinsen Tsang

Methods
-------
setUp
^^^^^

.. java:method:: protected void setUp() throws Exception
   :outertype: SFRMDoSHandlerTest

   Invoke for setup.

testEnterAfterThreadDie_Pos_0
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testEnterAfterThreadDie_Pos_0()
   :outertype: SFRMDoSHandlerTest

   Testcase for entering the message after previous thread owner has been died.

testEnterAfterThreadDie_Pos_1
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testEnterAfterThreadDie_Pos_1()
   :outertype: SFRMDoSHandlerTest

   Testcase for entering the message being owner by other active thread.

testEnterWithLifetime_Pos_0
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testEnterWithLifetime_Pos_0()
   :outertype: SFRMDoSHandlerTest

   Testcase for a message entering the DoSHandler with a specified lifetime. The record should be removed after at least (1 + sweeping_interval) seconds.

testEnterWithLifetime_Pos_1
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void testEnterWithLifetime_Pos_1()
   :outertype: SFRMDoSHandlerTest

   Testcase for a message entering the DosHandler with a specified lifetime. The record should exist within the lifetime.

testEnter_Neg_0
^^^^^^^^^^^^^^^

.. java:method:: public void testEnter_Neg_0()
   :outertype: SFRMDoSHandlerTest

   Testcase for duplicate message entering the DosHandler.

testEnter_Pos_0
^^^^^^^^^^^^^^^

.. java:method:: public void testEnter_Pos_0()
   :outertype: SFRMDoSHandlerTest

   Simplest Testcase for a message entering the DoS Handler.

testEnter_Pos_1
^^^^^^^^^^^^^^^

.. java:method:: public void testEnter_Pos_1()
   :outertype: SFRMDoSHandlerTest

   Testcase for multiple message entering the DoS Handler.

testExit_Neg_0
^^^^^^^^^^^^^^

.. java:method:: public void testExit_Neg_0()
   :outertype: SFRMDoSHandlerTest

   Testcase for entering one record, but with a illegal message exiting.

testExit_Pos_0
^^^^^^^^^^^^^^

.. java:method:: public void testExit_Pos_0()
   :outertype: SFRMDoSHandlerTest

   Testcase for entering and exiting for one record.


.. java:import:: java.lang.reflect ParameterizedType

.. java:import:: java.lang.reflect Type

.. java:import:: java.net URL

.. java:import:: java.text MessageFormat

.. java:import:: org.junit Assert

.. java:import:: hk.hku.cecid.piazza.commons.module Module

.. java:import:: hk.hku.cecid.piazza.commons.util Instance

ModuleTest
==========

.. java:package:: hk.hku.cecid.piazza.commons.test
   :noindex:

.. java:type:: public abstract class ModuleTest<T extends Module> extends UnitTest<T>

Fields
------
MISSING_MODULE_DESCRITOR
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String MISSING_MODULE_DESCRITOR
   :outertype: ModuleTest

NO_MODULE_DESCRIPTOR
^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String NO_MODULE_DESCRIPTOR
   :outertype: ModuleTest

Constructors
------------
ModuleTest
^^^^^^^^^^

.. java:constructor:: public ModuleTest()
   :outertype: ModuleTest

   Create an instance of \ ``ModuleTest``\ . By default, it disable JMOCK features for reducing dependency.

ModuleTest
^^^^^^^^^^

.. java:constructor:: public ModuleTest(boolean noMocking)
   :outertype: ModuleTest

   Create an instance of \ ``DAOTest``\ .

   :param noMocking: the flag representing the test requires object mocking or not ?

Methods
-------
getModuleDescription
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract String getModuleDescription()
   :outertype: ModuleTest

initAtOnce
^^^^^^^^^^

.. java:method:: public abstract boolean initAtOnce()
   :outertype: ModuleTest

initTestTarget
^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public synchronized void initTestTarget() throws Exception
   :outertype: ModuleTest

   Initialize the test target for this test-case.


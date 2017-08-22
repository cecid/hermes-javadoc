.. java:import:: hk.hku.cecid.piazza.commons.test.utils FixtureStore

.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

.. java:import:: org.jmock Mockery

.. java:import:: org.jmock.lib.legacy ClassImposteriser

.. java:import:: org.junit Before

.. java:import:: org.junit After

UnitTest
========

.. java:package:: hk.hku.cecid.piazza.commons.test
   :noindex:

.. java:type:: public abstract class UnitTest<T>

   The \ ``UnitTest``\  is top level class for performing unit-test.

   :author: Twinsen Tsang

Fields
------
FIXTURE_LOADER
^^^^^^^^^^^^^^

.. java:field:: protected ClassLoader FIXTURE_LOADER
   :outertype: UnitTest

logger
^^^^^^

.. java:field:: protected final Logger logger
   :outertype: UnitTest

mockContext
^^^^^^^^^^^

.. java:field:: protected Mockery mockContext
   :outertype: UnitTest

target
^^^^^^

.. java:field:: protected T target
   :outertype: UnitTest

Constructors
------------
UnitTest
^^^^^^^^

.. java:constructor:: public UnitTest()
   :outertype: UnitTest

   Create an instance of \ ``UnitTest``\ .

UnitTest
^^^^^^^^

.. java:constructor:: public UnitTest(boolean noMocking)
   :outertype: UnitTest

   Create an instance of \ ``UnitTest``\ .

   :param noMocking:

Methods
-------
addTestDependency
^^^^^^^^^^^^^^^^^

.. java:method:: public void addTestDependency(UnitTest<?> testClass, boolean fixtureOnly)
   :outertype: UnitTest

   Add a testClass dependency to this UnitTest.

   :param testClass:
   :param fixtureOnly:

addTestDependency
^^^^^^^^^^^^^^^^^

.. java:method:: public <C extends UnitTest<?>> void addTestDependency(Class<C> testClass, boolean fixtureOnly)
   :outertype: UnitTest

checkMonk
^^^^^^^^^

.. java:method:: @After public void checkMonk()
   :outertype: UnitTest

   Check the mock whether the expectations is correct or not.

getTestDependency
^^^^^^^^^^^^^^^^^

.. java:method:: @SuppressWarnings public <T extends UnitTest<?>> T getTestDependency(Class<T> testClass)
   :outertype: UnitTest

   :param <T>:

getTestingTarget
^^^^^^^^^^^^^^^^

.. java:method:: public T getTestingTarget()
   :outertype: UnitTest

   :return: Get the testing target.

initFixtureLoader
^^^^^^^^^^^^^^^^^

.. java:method:: public void initFixtureLoader() throws Exception
   :outertype: UnitTest

   Initialize the resource class loader for loading resource at test-case class folders under res/.

initTestDependency
^^^^^^^^^^^^^^^^^^

.. java:method:: public void initTestDependency() throws Exception
   :outertype: UnitTest

   Initialize all test-class dependency used for testing.

initTestDependencyInjection
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void initTestDependencyInjection() throws Exception
   :outertype: UnitTest

   Initialize the testing dependency injection for this test-case

initTestMockObjects
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void initTestMockObjects() throws Exception
   :outertype: UnitTest

   Initialize the mock object used in the test-case.

initTestTarget
^^^^^^^^^^^^^^

.. java:method:: public void initTestTarget() throws Exception
   :outertype: UnitTest

   Initialize the test target for this test-case.

setUp
^^^^^

.. java:method:: @Before public void setUp() throws Exception
   :outertype: UnitTest

   Compatible to JUnit3-style.

tearDown
^^^^^^^^

.. java:method:: @After public void tearDown() throws Exception
   :outertype: UnitTest

   Tear-down all resource loaded.


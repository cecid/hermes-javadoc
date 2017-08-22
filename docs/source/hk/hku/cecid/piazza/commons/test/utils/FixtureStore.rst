.. java:import:: java.io File

.. java:import:: java.io FilenameFilter

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: java.lang ClassLoader

.. java:import:: java.lang.reflect Method

.. java:import:: java.net URL

.. java:import:: java.net URLClassLoader

.. java:import:: java.net MalformedURLException

.. java:import:: org.slf4j Logger

.. java:import:: org.slf4j LoggerFactory

FixtureStore
============

.. java:package:: hk.hku.cecid.piazza.commons.test.utils
   :noindex:

.. java:type:: public class FixtureStore

   The \ ``FixtureStore``\  contains a set of global method for creating class loader for loading fixture data in Test-case.

   :author: Twinsen Tsang

Fields
------
TEST_LOG
^^^^^^^^

.. java:field:: public static final String TEST_LOG
   :outertype: FixtureStore

Methods
-------
addFixtureLoaderFrom
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ClassLoader addFixtureLoaderFrom(ClassLoader src, ClassLoader dest) throws Exception
   :outertype: FixtureStore

   :param src:
   :param dest:
   :throws Exception:

addFixturesToLoader
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ClassLoader addFixturesToLoader(ClassLoader loader, URL[] fixtureURL) throws Exception
   :outertype: FixtureStore

createFixtureLoader
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ClassLoader createFixtureLoader(boolean autoJarInclude, Class<?> clazz)
   :outertype: FixtureStore

   Create a Fixture loader under the class \ ``clazz``\ .

   :param autoJarInclude: The boolean flag representing whether jar files in the fixture path are automatically included.
   :param clazz: The class to create the fixture loader.
   :return: A Fixture loader under the class \ ``clazz``\ .

createFixtureLoader
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ClassLoader createFixtureLoader(boolean autoJarInclude, Class<?>... classes)
   :outertype: FixtureStore

   Create a Fixture loader under the class \ ``clazz``\ .

   :param autoJarInclude: The boolean flag representing whether jar files in the fixture path are automatically included.
   :param classes: A set of class to create the fixture loader.
   :return: A Fixture loader under the class \ ``clazz``\ .

createFixtureLoader
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static ClassLoader createFixtureLoader(boolean autoJarInclude, ClassLoader old, Class<?>... classes)
   :outertype: FixtureStore

   Create a class loader which has \ ``old``\  as the basis, and in additional to a set fixture path from \ ``classes``\ .

   :param old:
   :param classes:

getFixtureURL
^^^^^^^^^^^^^

.. java:method:: public static URL getFixtureURL(Class<?> clazz)
   :outertype: FixtureStore

   Get the fixture URL from the \ ``clazz``\ .  For example,

   .. parsed-literal::

      package yourpackage;

      public class foo
      {
      }

      public class fooTest
      {
          public void testFoo()
          {
              URL url = FixtureStore.getFixtureURL(foo.class);     // By default, return /res/yourpackage.foo;
          }
      }

   :return: The URL base for this fixture class.


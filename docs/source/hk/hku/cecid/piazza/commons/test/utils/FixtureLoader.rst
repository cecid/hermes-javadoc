.. java:import:: java.io IOException

.. java:import:: java.net URL

.. java:import:: java.net URLClassLoader

.. java:import:: java.util Enumeration

.. java:import:: org.slf4j LoggerFactory

.. java:import:: org.slf4j Logger

FixtureLoader
=============

.. java:package:: hk.hku.cecid.piazza.commons.test.utils
   :noindex:

.. java:type:: public class FixtureLoader extends URLClassLoader

   The \ ``FixtureLoader``\  is

   :author: Twinsen Tsang

Fields
------
logger
^^^^^^

.. java:field:: protected final Logger logger
   :outertype: FixtureLoader

Constructors
------------
FixtureLoader
^^^^^^^^^^^^^

.. java:constructor::  FixtureLoader(URL[] urls, ClassLoader parent)
   :outertype: FixtureLoader

   Create an instance of \ ``FixtureLoader``\ .

   :param urls: the URLs from which to load classes and resources
   :param parent: the parent class loader for delegation

FixtureLoader
^^^^^^^^^^^^^

.. java:constructor::  FixtureLoader(URL[] urls)
   :outertype: FixtureLoader

   Create an instance of \ ``FixtureLoader``\ .

   :param urls: the URLs from which to load classes and resources

Methods
-------
findResource
^^^^^^^^^^^^

.. java:method:: @Override public URL findResource(String name)
   :outertype: FixtureLoader

findResourceImpl
^^^^^^^^^^^^^^^^

.. java:method::  URL findResourceImpl(String name)
   :outertype: FixtureLoader

   :param name:

findResources
^^^^^^^^^^^^^

.. java:method:: @Override public Enumeration<URL> findResources(String name) throws IOException
   :outertype: FixtureLoader

findResourcesImpl
^^^^^^^^^^^^^^^^^

.. java:method::  Enumeration<URL> findResourcesImpl(String name)
   :outertype: FixtureLoader

   :param name:


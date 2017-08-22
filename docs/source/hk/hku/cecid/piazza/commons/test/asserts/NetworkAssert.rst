.. java:import:: java.text MessageFormat

.. java:import:: java.io IOException

.. java:import:: java.net InetSocketAddress

.. java:import:: java.net Socket

.. java:import:: java.net SocketTimeoutException

NetworkAssert
=============

.. java:package:: hk.hku.cecid.piazza.commons.test.asserts
   :noindex:

.. java:type:: public class NetworkAssert

   The \ ``NetworkAssert``\  is

   :author: Twinsen Tsang

Methods
-------
assertSocketNonReachable
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static void assertSocketNonReachable(String host, int port, int timeout)
   :outertype: NetworkAssert

   Assert whether the server socket with \ ``host``\  and \ ``port``\  is reachable with the time limit \ ``timeout``\ .

   :param message: The customized error message when the assertion failed.
   :param host: The host of the server socket binds to.
   :param port: The port of the server socket binds to .
   :param timeout: How long does this assert think it is time out, ie failed to connect.

assertSocketNonReachable
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static void assertSocketNonReachable(String message, String host, int port, int timeout)
   :outertype: NetworkAssert

   Assert whether the server socket with \ ``host``\  and \ ``port``\  is reachable with the time limit \ ``timeout``\ .

   :param host: The host of the server socket binds to.
   :param port: The port of the server socket binds to .
   :param timeout: How long does this assert think it is time out, ie failed to connect.

assertSocketReachable
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static void assertSocketReachable(String host, int port, int timeout)
   :outertype: NetworkAssert

   Assert whether the server socket with \ ``host``\  and \ ``port``\  is reachable with the time limit \ ``timeout``\ .

   :param host: The host of the server socket binds to.
   :param port: The port of the server socket binds to .
   :param timeout: How long does this assert think it is time out, ie failed to connect.

assertSocketReachable
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static void assertSocketReachable(String message, String host, int port, int timeout)
   :outertype: NetworkAssert

   Assert whether the server socket with \ ``host``\  and \ ``port``\  is reachable with the time limit \ ``timeout``\ .

   :param message: The customized error message when the assertion failed.
   :param host: The host of the server socket binds to.
   :param port: The port of the server socket binds to .
   :param timeout: How long does this assert think it is time out, ie failed to connect.


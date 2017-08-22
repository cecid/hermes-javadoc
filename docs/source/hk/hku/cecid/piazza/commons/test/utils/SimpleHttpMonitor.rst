.. java:import:: java.io BufferedInputStream

.. java:import:: java.io BufferedOutputStream

.. java:import:: java.io PushbackInputStream

.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io ByteArrayOutputStream

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.util Map

.. java:import:: java.util HashMap

.. java:import:: java.net ServerSocket

.. java:import:: java.net Socket

SimpleHttpMonitor
=================

.. java:package:: hk.hku.cecid.piazza.commons.test.utils
   :noindex:

.. java:type:: public class SimpleHttpMonitor implements Runnable

   The \ ``SimpleHttpMonitor``\  is a very very simple HTTP monitor used for testing.

Fields
------
CONTENT_LENGTH
^^^^^^^^^^^^^^

.. java:field:: public static final String CONTENT_LENGTH
   :outertype: SimpleHttpMonitor

CONTENT_TYPE
^^^^^^^^^^^^

.. java:field:: public static final String CONTENT_TYPE
   :outertype: SimpleHttpMonitor

CRLF
^^^^

.. java:field:: protected static final byte[] CRLF
   :outertype: SimpleHttpMonitor

HD_CT_LEN
^^^^^^^^^

.. java:field:: protected static final byte[] HD_CT_LEN
   :outertype: SimpleHttpMonitor

HD_CT_TYPE
^^^^^^^^^^

.. java:field:: protected static final byte[] HD_CT_TYPE
   :outertype: SimpleHttpMonitor

HD_SERVIER
^^^^^^^^^^

.. java:field:: protected static final byte[] HD_SERVIER
   :outertype: SimpleHttpMonitor

STATUS_200
^^^^^^^^^^

.. java:field:: protected static final byte[] STATUS_200
   :outertype: SimpleHttpMonitor

Constructors
------------
SimpleHttpMonitor
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleHttpMonitor(int port)
   :outertype: SimpleHttpMonitor

   Explicit Constructor.

   :param port: The port number listening HTTP request.

Methods
-------
getContentLength
^^^^^^^^^^^^^^^^

.. java:method:: public int getContentLength()
   :outertype: SimpleHttpMonitor

   :return: The content length of last HTTP request.

getContentStream
^^^^^^^^^^^^^^^^

.. java:method:: public InputStream getContentStream()
   :outertype: SimpleHttpMonitor

   Get the input stream containing the HTTP body content from the last HTTP request. It is different from \ :java:ref:`getInputStream()`\  because that returns the stream containing (HTTP header + HTTP body content).

   :return: the input stream containing the HTTP body content from the last HTTP request.

getContentType
^^^^^^^^^^^^^^

.. java:method:: public String getContentType()
   :outertype: SimpleHttpMonitor

   :return: The content type of last HTTP request

getHeaders
^^^^^^^^^^

.. java:method:: public Map getHeaders()
   :outertype: SimpleHttpMonitor

   :return: Get the last HTTP request header monitored.

getInputStream
^^^^^^^^^^^^^^

.. java:method:: public InputStream getInputStream()
   :outertype: SimpleHttpMonitor

   :return: Get the last HTTP request content.

onAccept
^^^^^^^^

.. java:method:: protected void onAccept(Socket s)
   :outertype: SimpleHttpMonitor

   [@EVENT] This method is invoked when a socket connection is accepted.

onRequest
^^^^^^^^^

.. java:method:: protected void onRequest(InputStream ins) throws IOException
   :outertype: SimpleHttpMonitor

   [@EVENT] This method is invoked after the socket is accepted.

onResponse
^^^^^^^^^^

.. java:method:: protected void onResponse(OutputStream os) throws IOException
   :outertype: SimpleHttpMonitor

   [@EVENT] This method is invoked when the HTTP content has been parsed, and now ready to write content to socket.

onResponseLength
^^^^^^^^^^^^^^^^

.. java:method:: protected int onResponseLength()
   :outertype: SimpleHttpMonitor

   [@EVENT] This method is invoked before calling onResponse. It ask the sub-class implementation for the content length of this response. Default return 0.

run
^^^

.. java:method:: public void run()
   :outertype: SimpleHttpMonitor

   The thread execution method.

start
^^^^^

.. java:method:: public void start()
   :outertype: SimpleHttpMonitor

   Start the HTTP monitor.

stop
^^^^

.. java:method:: public void stop()
   :outertype: SimpleHttpMonitor

   Stop the HTTP monitor.


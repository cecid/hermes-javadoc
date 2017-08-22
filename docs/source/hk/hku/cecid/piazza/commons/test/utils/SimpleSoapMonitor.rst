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

SimpleSoapMonitor
=================

.. java:package:: hk.hku.cecid.piazza.commons.test.utils
   :noindex:

.. java:type:: public class SimpleSoapMonitor implements Runnable

   The \ ``SimpleHttpMonitor``\  is a very simple raw HTTP monitor used for testing. It is usually required to override some method in this class to provide handle the HTTP request / response event such as generating proper response for the requester.

   :author: Twinsen Tsang

Fields
------
CONTENT_LENGTH
^^^^^^^^^^^^^^

.. java:field:: public static final String CONTENT_LENGTH
   :outertype: SimpleSoapMonitor

CONTENT_TYPE
^^^^^^^^^^^^

.. java:field:: public static final String CONTENT_TYPE
   :outertype: SimpleSoapMonitor

CRLF
^^^^

.. java:field:: protected static final byte[] CRLF
   :outertype: SimpleSoapMonitor

HD_CT_LEN
^^^^^^^^^

.. java:field:: protected static final byte[] HD_CT_LEN
   :outertype: SimpleSoapMonitor

HD_CT_TYPE
^^^^^^^^^^

.. java:field:: protected static final byte[] HD_CT_TYPE
   :outertype: SimpleSoapMonitor

HD_SERVIER
^^^^^^^^^^

.. java:field:: protected static final byte[] HD_SERVIER
   :outertype: SimpleSoapMonitor

STATUS_200
^^^^^^^^^^

.. java:field:: protected static final byte[] STATUS_200
   :outertype: SimpleSoapMonitor

Constructors
------------
SimpleSoapMonitor
^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleSoapMonitor(int port)
   :outertype: SimpleSoapMonitor

   Explicit constructor for \ ``SimpleHttpMonitor``\

   :param port: The port number listening HTTP request.

Methods
-------
getContentLength
^^^^^^^^^^^^^^^^

.. java:method:: public synchronized int getContentLength()
   :outertype: SimpleSoapMonitor

   :return: The content length of last HTTP request.

getContentStream
^^^^^^^^^^^^^^^^

.. java:method:: public InputStream getContentStream()
   :outertype: SimpleSoapMonitor

   Get the input stream containing the HTTP body content from the last HTTP request. It is different from \ :java:ref:`getInputStream()`\  because that returns the stream containing (HTTP header + HTTP body content).

   :return: the input stream containing the HTTP body content from the last HTTP request.

getContentType
^^^^^^^^^^^^^^

.. java:method:: public String getContentType()
   :outertype: SimpleSoapMonitor

   :return: The content type of last HTTP request

getHeaders
^^^^^^^^^^

.. java:method:: public Map getHeaders()
   :outertype: SimpleSoapMonitor

   :return: Get the last HTTP request header monitored.

getInputStream
^^^^^^^^^^^^^^

.. java:method:: public InputStream getInputStream()
   :outertype: SimpleSoapMonitor

   Get the input stream containing the raw last HTTP request (header + content).

   :return: Get the last HTTP request content.

onAccept
^^^^^^^^

.. java:method:: protected void onAccept(Socket s)
   :outertype: SimpleSoapMonitor

   [@EVENT] This method is invoked when a socket connection is accepted. Do nothing by default.

onRequest
^^^^^^^^^

.. java:method:: protected void onRequest(InputStream ins) throws IOException
   :outertype: SimpleSoapMonitor

   [@EVENT] This method is invoked after the socket is accepted.

onResponse
^^^^^^^^^^

.. java:method:: protected void onResponse(OutputStream os) throws IOException
   :outertype: SimpleSoapMonitor

   [@EVENT] This method is invoked when the HTTP content has been parsed, and now ready to write content to socket.

onResponseContentType
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected String onResponseContentType()
   :outertype: SimpleSoapMonitor

onResponseLength
^^^^^^^^^^^^^^^^

.. java:method:: protected int onResponseLength()
   :outertype: SimpleSoapMonitor

   [@EVENT] This method is invoked before calling onResponse. It ask the sub-class implementation for the content length of this response. Default return 0.

run
^^^

.. java:method:: public void run()
   :outertype: SimpleSoapMonitor

   The thread execution method.

start
^^^^^

.. java:method:: public synchronized void start()
   :outertype: SimpleSoapMonitor

   Start the HTTP monitor.

stop
^^^^

.. java:method:: public synchronized void stop()
   :outertype: SimpleSoapMonitor

   Stop the HTTP monitor.


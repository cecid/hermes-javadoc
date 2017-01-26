.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.net ConnectionException

.. java:import:: hk.hku.cecid.piazza.commons.net HttpConnector

.. java:import:: hk.hku.cecid.piazza.commons.util Headers

.. java:import:: java.io BufferedInputStream

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.net HttpURLConnection

.. java:import:: java.net MalformedURLException

.. java:import:: javax.mail.internet InternetHeaders

FastHttpConnector
=================

.. java:package:: hk.hku.cecid.edi.sfrm.net
   :noindex:

.. java:type:: public class FastHttpConnector extends HttpConnector

   Creation Date: 10/10/2006 Modified Date: 17/06/2009

   :author: Twinsen, Philip

Constructors
------------
FastHttpConnector
^^^^^^^^^^^^^^^^^

.. java:constructor:: public FastHttpConnector(Object destUrl) throws MalformedURLException
   :outertype: FastHttpConnector

   Creates a new instance of HttpConnector.

   :param destUrl: the destination URL, either in String or URL format.
   :throws MalformedURLException: if the URL is malformed.

Methods
-------
getResponseCode
^^^^^^^^^^^^^^^

.. java:method:: public int getResponseCode()
   :outertype: FastHttpConnector

   Sends an HTTP/S request using the given HTTP connection.

   :param request: the HTTP request content or null for a simple get request.
   :param internet: headers
   :throws ConnectionException: if failed in sending the HTTP request.
   :return: an input stream for reading the reply from the host.

getResponseContentStream
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public InputStream getResponseContentStream()
   :outertype: FastHttpConnector

getResponseHeaders
^^^^^^^^^^^^^^^^^^

.. java:method:: public InternetHeaders getResponseHeaders()
   :outertype: FastHttpConnector

send
^^^^

.. java:method:: public HttpURLConnection send(InputStream request, InternetHeaders headers) throws ConnectionException
   :outertype: FastHttpConnector


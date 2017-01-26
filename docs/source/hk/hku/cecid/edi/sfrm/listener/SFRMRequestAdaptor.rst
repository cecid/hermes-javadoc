.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.io IOException

.. java:import:: java.net HttpURLConnection

.. java:import:: java.net MalformedURLException

.. java:import:: java.security GeneralSecurityException

.. java:import:: java.security.cert CertificateException

.. java:import:: java.security KeyStoreException

.. java:import:: javax.mail.internet InternetHeaders

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.servlet.http HttpServletResponse

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.piazza.commons.servlet.http HttpRequestAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.security SMimeException

.. java:import:: hk.hku.cecid.piazza.commons.util Headers

SFRMRequestAdaptor
==================

.. java:package:: hk.hku.cecid.edi.sfrm.listener
   :noindex:

.. java:type:: public abstract class SFRMRequestAdaptor extends HttpRequestAdaptor

   This is the sfrm customizied HTTP Request Adaptor.

   :author: Twinsen

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.servlet.http.HttpRequestAdaptor`

Methods
-------
processFail
^^^^^^^^^^^

.. java:method:: public String processFail(HttpServletRequest request, HttpServletResponse response, Exception cause) throws IOException
   :outertype: SFRMRequestAdaptor

   It process a HTTP request from the piazza corvus framework when there is exception thrown from underlying handler.

   :param request: The HTTP Request
   :param response: The HTTP Response
   :param cause: The exception cause to fail.

processRequest
^^^^^^^^^^^^^^

.. java:method:: public String processRequest(HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: SFRMRequestAdaptor

   It process a HTTP request from the piazza corvus framework.

   :param request: The HTTP Request
   :param response: The HTTP Response
   :throws RequestListenerException:

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.servlet.http.HttpRequestListener.processRequest(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

processRequest
^^^^^^^^^^^^^^

.. java:method:: public abstract void processRequest(SFRMRequest request, SFRMResponse response) throws RequestListenerException
   :outertype: SFRMRequestAdaptor

   :param request:
   :param response:
   :throws RequestListenerException:


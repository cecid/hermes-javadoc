.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.piazza.commons.servlet.http HttpRequestAdaptor

.. java:import:: java.io IOException

.. java:import:: java.io InputStreamReader

.. java:import:: java.nio.charset Charset

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.servlet.http HttpServletResponse

HttpPageletAdaptor
==================

.. java:package:: hk.hku.cecid.piazza.commons.pagelet
   :noindex:

.. java:type:: public abstract class HttpPageletAdaptor extends HttpRequestAdaptor

   HttpPageletAdaptor is an HTTP request adaptor which generates a page from a template pagelet. A template pagelet may contain the content, or part of the content, of the page to be generated. It also describes the layout of other pagelets in the page.

   The tag in the template which declares a pagelet should follow the convention stated below:

   .. parsed-literal::

      <!-- template-[pagelet-id] -->

   By default, there are two generation modes of the page.

   ..

   #. full - Generate the page according to the template pre-defined by this adaptor. This is the default generation mode.
   #. raw - Generate the page according to the dynamically specified pagelet.

   Note: All the pagelets, including the template, must be saved in UTF-8 encoding.

   :author: Hugo Y. K. Lam

   **See also:** :java:ref:`Pagelet`, :java:ref:`PageletStore`, :java:ref:`Template`

Fields
------
REQ_PARAM_ACTION
^^^^^^^^^^^^^^^^

.. java:field:: protected static final String REQ_PARAM_ACTION
   :outertype: HttpPageletAdaptor

   The name of the request parameter which specifies an action. This parameter is named 'action'.

REQ_PARAM_PAGELET
^^^^^^^^^^^^^^^^^

.. java:field:: protected static final String REQ_PARAM_PAGELET
   :outertype: HttpPageletAdaptor

   The name of the request parameter which specifies a pagelet ID. This parameter is named 'pagelet'.

REQ_PARAM_PAGEMODE
^^^^^^^^^^^^^^^^^^

.. java:field:: protected static final String REQ_PARAM_PAGEMODE
   :outertype: HttpPageletAdaptor

   The name of the request parameter which specifies the generation mode. This parameter is named 'mode'.

Methods
-------
getErrorPagelet
^^^^^^^^^^^^^^^

.. java:method:: protected Pagelet getErrorPagelet(HttpServletRequest request)
   :outertype: HttpPageletAdaptor

   Gets the error pagelet. This method invokes getPagelet() with a parameter "&pagelet-error".

   :param request: the servlet request.
   :return: the template pagelet.

getPagelet
^^^^^^^^^^

.. java:method:: protected Pagelet getPagelet(String id)
   :outertype: HttpPageletAdaptor

   Gets the pagelet from the underlying pagelet store. If the specified ID is preceded by an ampersand, it indicates the pagelet id should be firstly treated as a listener parameter name which has a value of the target pagelet ID. In this case, if there is a corresponding listener parameter, its value will be used as the target pagelet ID. Otherwise, the specified id will be matched against the underlying pagelet store as if there is no ampersand indicator.

   :param id: the pagelet ID.
   :return: the corresponding pagelet or null if not found.

getPageletStore
^^^^^^^^^^^^^^^

.. java:method:: protected abstract PageletStore getPageletStore()
   :outertype: HttpPageletAdaptor

   Gets the pagelet store which holds all the registered pagelets of this adaptor.

   :return: a pagelet store.

getTemplate
^^^^^^^^^^^

.. java:method:: protected Pagelet getTemplate(HttpServletRequest request)
   :outertype: HttpPageletAdaptor

   Gets the template pagelet. This method invokes getPagelet() with a parameter "&pagelet-template".

   :param request: the servlet request.
   :return: the template pagelet.

processError
^^^^^^^^^^^^

.. java:method:: protected void processError(TemplateElement element, Throwable error, HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: HttpPageletAdaptor

   Processes the error generated when processing a pagelet.

   :param element: the template element which represents the pagelet.
   :param error: the error generated by the pagelet process.
   :param request: the servlet request.
   :param response: the servlet response.
   :throws RequestListenerException: if unable to process the pagelet error.

   **See also:** :java:ref:`.processTemplate(HttpServletRequest,HttpServletResponse)`

processPagelet
^^^^^^^^^^^^^^

.. java:method:: protected void processPagelet(TemplateElement element, Pagelet pagelet, HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: HttpPageletAdaptor

   Processes the pagelet of the generating page by reading the content from the pagelet and generates it to the output.

   :param element: the template element which represents the pagelet.
   :param pagelet: the pagelet to be processed.
   :param request: the servlet request.
   :param response: the servlet response.
   :throws RequestListenerException: if unable to process the pagelet.

   **See also:** :java:ref:`.processTemplate(HttpServletRequest,HttpServletResponse)`

processRequest
^^^^^^^^^^^^^^

.. java:method:: public String processRequest(HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: HttpPageletAdaptor

   Processes the page request. This method determines if the generation mode is "raw". If not, it invokes processTemplate() to complete the rest of the generation.

   **See also:** :java:ref:`.processTemplate(HttpServletRequest,HttpServletResponse)`, :java:ref:`hk.hku.cecid.piazza.commons.servlet.http.HttpRequestListener.processRequest(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)`

processTemplate
^^^^^^^^^^^^^^^

.. java:method:: protected void processTemplate(HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: HttpPageletAdaptor

   Processes the template of the generating page. This method invokes getTemplate() to retrieve the template pagelet. It then generates the page according to the pagelet. The content of the template pagelet will be parsed according to the following alogirthm:

   ..

   * When it encounters any text other than a template tag, it invokes processText() to generate the content.
   * When it encounters a template tag in the template, it invokes processPagelet() to generate the content.
   * When it encounters any errors while invoking processPagelet(), it will invokes processError() to generate the content.

   :param request: the servlet request.
   :param response: the servlet response.
   :throws RequestListenerException: if unable to process the template.

   **See also:** :java:ref:`.getTemplate(HttpServletRequest)`, :java:ref:`.processText(TemplateElement,String,HttpServletRequest,HttpServletResponse)`, :java:ref:`.processPagelet(TemplateElement,Pagelet,HttpServletRequest,HttpServletResponse)`, :java:ref:`.processError(TemplateElement,Throwable,HttpServletRequest,HttpServletResponse)`

processText
^^^^^^^^^^^

.. java:method:: protected void processText(TemplateElement element, String text, HttpServletRequest request, HttpServletResponse response) throws RequestListenerException
   :outertype: HttpPageletAdaptor

   Processes the text part of the generating page by simply generating the text to the output.

   :param element: the template element which represents the text.
   :param text: the text to be processed.
   :param request: the servlet request.
   :param response: the servlet response.
   :throws RequestListenerException: if unable to process the text.

   **See also:** :java:ref:`.processTemplate(HttpServletRequest,HttpServletResponse)`


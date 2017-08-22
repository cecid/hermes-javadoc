.. java:import:: java.io IOException

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.xml.soap AttachmentPart

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.handler As2ReceiveMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.handler EbmsReceiveMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.handler ReceiveMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

HermesMessageReceiveApiListener
===============================

.. java:package:: hk.hku.cecid.hermes.api.listener
   :noindex:

.. java:type:: public class HermesMessageReceiveApiListener extends HermesProtocolApiListener

   HermesMessageReceiveApiListener

   :author: Patrick Yee

Fields
------
handlers
^^^^^^^^

.. java:field:: protected Map<String, ReceiveMessageHandler> handlers
   :outertype: HermesMessageReceiveApiListener

Constructors
------------
HermesMessageReceiveApiListener
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public HermesMessageReceiveApiListener()
   :outertype: HermesMessageReceiveApiListener

Methods
-------
processGetRequest
^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processGetRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageReceiveApiListener

processPostRequest
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processPostRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageReceiveApiListener


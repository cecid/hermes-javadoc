.. java:import:: java.io IOException

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.handler As2SendMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.handler EbmsSendMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.handler SendMessageHandler

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

HermesMessageSendApiListener
============================

.. java:package:: hk.hku.cecid.hermes.api.listener
   :noindex:

.. java:type:: public class HermesMessageSendApiListener extends HermesProtocolApiListener

   HermesMessageSendApiListener

   :author: Patrick Yee

Fields
------
handlers
^^^^^^^^

.. java:field:: protected Map<String, SendMessageHandler> handlers
   :outertype: HermesMessageSendApiListener

Constructors
------------
HermesMessageSendApiListener
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public HermesMessageSendApiListener()
   :outertype: HermesMessageSendApiListener

Methods
-------
processGetRequest
^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processGetRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageSendApiListener

processPostRequest
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processPostRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageSendApiListener


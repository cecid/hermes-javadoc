.. java:import:: java.io IOException

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.handler As2MessageHistoryHandler

.. java:import:: hk.hku.cecid.hermes.api.handler EbmsMessageHistoryHandler

.. java:import:: hk.hku.cecid.hermes.api.handler MessageHistoryHandler

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

HermesMessageHistoryApiListener
===============================

.. java:package:: hk.hku.cecid.hermes.api.listener
   :noindex:

.. java:type:: public class HermesMessageHistoryApiListener extends HermesProtocolApiListener

   HermesMessageHistoryApiListener

   :author: Patrick Yee

Fields
------
handlers
^^^^^^^^

.. java:field:: protected Map<String, MessageHistoryHandler> handlers
   :outertype: HermesMessageHistoryApiListener

Constructors
------------
HermesMessageHistoryApiListener
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public HermesMessageHistoryApiListener()
   :outertype: HermesMessageHistoryApiListener

Methods
-------
processGetRequest
^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processGetRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageHistoryApiListener

processPostRequest
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processPostRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageHistoryApiListener


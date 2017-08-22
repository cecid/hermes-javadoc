.. java:import:: java.io IOException

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.handler EbmsRedownloadHandler

.. java:import:: hk.hku.cecid.hermes.api.handler RedownloadHandler

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

HermesMessageRedownloadApiListener
==================================

.. java:package:: hk.hku.cecid.hermes.api.listener
   :noindex:

.. java:type:: public class HermesMessageRedownloadApiListener extends HermesProtocolApiListener

   HermesMessageRedownloadApiListener

   :author: Patrick Yee

Fields
------
handlers
^^^^^^^^

.. java:field:: protected Map<String, RedownloadHandler> handlers
   :outertype: HermesMessageRedownloadApiListener

Constructors
------------
HermesMessageRedownloadApiListener
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public HermesMessageRedownloadApiListener()
   :outertype: HermesMessageRedownloadApiListener

Methods
-------
processPostRequest
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processPostRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesMessageRedownloadApiListener


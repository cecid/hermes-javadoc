.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.handler As2PartnershipHandler

.. java:import:: hk.hku.cecid.hermes.api.handler EbmsPartnershipHandler

.. java:import:: hk.hku.cecid.hermes.api.handler PartnershipHandler

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

HermesPartnershipApiListener
============================

.. java:package:: hk.hku.cecid.hermes.api.listener
   :noindex:

.. java:type:: public class HermesPartnershipApiListener extends HermesProtocolApiListener

   HermesPartnershipApiListener

   :author: Patrick Yee

Fields
------
handlers
^^^^^^^^

.. java:field:: protected Map<String, PartnershipHandler> handlers
   :outertype: HermesPartnershipApiListener

Constructors
------------
HermesPartnershipApiListener
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public HermesPartnershipApiListener()
   :outertype: HermesPartnershipApiListener

Methods
-------
processDeleteRequest
^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processDeleteRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesPartnershipApiListener

processGetRequest
^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processGetRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesPartnershipApiListener

processPostRequest
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Map<String, Object> processPostRequest(RestRequest request) throws RequestListenerException
   :outertype: HermesPartnershipApiListener


.. java:import:: java.util Map

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

SendMessageHandler
==================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public interface SendMessageHandler

Methods
-------
getMessageStatus
^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageStatus(String messageId)
   :outertype: SendMessageHandler

sendMessage
^^^^^^^^^^^

.. java:method:: public Map<String, Object> sendMessage(Map<String, Object> inputDict, RestRequest sourceRequest)
   :outertype: SendMessageHandler


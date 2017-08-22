.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

ReceiveMessageHandler
=====================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public interface ReceiveMessageHandler

Methods
-------
getReceivedMessage
^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessage(String messageId, HttpServletRequest request)
   :outertype: ReceiveMessageHandler

getReceivedMessageList
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getReceivedMessageList(String partnershipId, boolean includeRead)
   :outertype: ReceiveMessageHandler


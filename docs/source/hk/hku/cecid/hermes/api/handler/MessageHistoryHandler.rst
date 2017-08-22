.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

MessageHistoryHandler
=====================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public interface MessageHistoryHandler

Methods
-------
getMessageHistory
^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageHistory(HttpServletRequest request)
   :outertype: MessageHistoryHandler

resetMessage
^^^^^^^^^^^^

.. java:method:: public Map<String, Object> resetMessage(String messageId, String action)
   :outertype: MessageHistoryHandler


.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.edi.as2 AS2Processor

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDAO

.. java:import:: hk.hku.cecid.edi.as2.dao MessageDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

As2MessageHistoryHandler
========================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class As2MessageHistoryHandler extends MessageHandler implements MessageHistoryHandler

   As2MessageHistoryHandler

   :author: Patrick Yee

Constructors
------------
As2MessageHistoryHandler
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public As2MessageHistoryHandler(HermesAbstractApiListener listener)
   :outertype: As2MessageHistoryHandler

Methods
-------
getMessageHistory
^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageHistory(HttpServletRequest httpRequest)
   :outertype: As2MessageHistoryHandler

resetMessage
^^^^^^^^^^^^

.. java:method:: public Map<String, Object> resetMessage(String messageId, String action)
   :outertype: As2MessageHistoryHandler


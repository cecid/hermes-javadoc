.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util Map

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: hk.hku.cecid.ebms.pkg EbxmlMessage

.. java:import:: hk.hku.cecid.ebms.spa EbmsProcessor

.. java:import:: hk.hku.cecid.ebms.spa.util EbmsMessageStatusReverser

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDVO

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageClassifier

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.json JsonParseException

.. java:import:: hk.hku.cecid.piazza.commons.rest RestRequest

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

EbmsMessageHistoryHandler
=========================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class EbmsMessageHistoryHandler extends MessageHandler implements MessageHistoryHandler

   EbmsMessageHistoryHandler

   :author: Patrick Yee

Constructors
------------
EbmsMessageHistoryHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EbmsMessageHistoryHandler(HermesAbstractApiListener listener)
   :outertype: EbmsMessageHistoryHandler

Methods
-------
getMessageHistory
^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getMessageHistory(HttpServletRequest httpRequest)
   :outertype: EbmsMessageHistoryHandler

resetMessage
^^^^^^^^^^^^

.. java:method:: public Map<String, Object> resetMessage(String messageId, String action)
   :outertype: EbmsMessageHistoryHandler


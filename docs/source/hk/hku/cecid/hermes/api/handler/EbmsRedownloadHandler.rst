.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: hk.hku.cecid.ebms.spa.util EbmsMessageStatusReverser

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

EbmsRedownloadHandler
=====================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class EbmsRedownloadHandler extends MessageHandler implements RedownloadHandler

Constructors
------------
EbmsRedownloadHandler
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EbmsRedownloadHandler(HermesAbstractApiListener listener)
   :outertype: EbmsRedownloadHandler

Methods
-------
redownload
^^^^^^^^^^

.. java:method:: public Map<String, Object> redownload(String messageId)
   :outertype: EbmsRedownloadHandler


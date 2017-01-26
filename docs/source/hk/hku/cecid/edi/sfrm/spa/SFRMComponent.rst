.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.handler AcknowledgementHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler IncomingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler OutgoingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMExternalRequestHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageSegmentHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMPartnershipHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.piazza.commons.module SystemComponent

.. java:import:: hk.hku.cecid.piazza.commons.os OSManager

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

SFRMComponent
=============

.. java:package:: hk.hku.cecid.edi.sfrm.spa
   :noindex:

.. java:type:: public abstract class SFRMComponent extends SystemComponent

   :author: Patrick Yip

Methods
-------
getAcknowledgementHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public AcknowledgementHandler getAcknowledgementHandler()
   :outertype: SFRMComponent

getExternalRequestHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMExternalRequestHandler getExternalRequestHandler()
   :outertype: SFRMComponent

getIncomingMessageHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public IncomingMessageHandler getIncomingMessageHandler()
   :outertype: SFRMComponent

getIncomingRepository
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PackagedPayloadsRepository getIncomingRepository()
   :outertype: SFRMComponent

getKeyStoreManager
^^^^^^^^^^^^^^^^^^

.. java:method:: public KeyStoreManager getKeyStoreManager()
   :outertype: SFRMComponent

getMessageHandler
^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageHandler getMessageHandler()
   :outertype: SFRMComponent

getMessageSegmentHandler
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentHandler getMessageSegmentHandler()
   :outertype: SFRMComponent

getMessageSpeedQueryHandler
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public MessageStatusQueryHandler getMessageSpeedQueryHandler()
   :outertype: SFRMComponent

getOSManager
^^^^^^^^^^^^

.. java:method:: public OSManager getOSManager() throws Exception
   :outertype: SFRMComponent

getOutgoingMessageHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public OutgoingMessageHandler getOutgoingMessageHandler()
   :outertype: SFRMComponent

getOutgoingRepository
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PackagedPayloadsRepository getOutgoingRepository()
   :outertype: SFRMComponent

getPartnershipHandler
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipHandler getPartnershipHandler()
   :outertype: SFRMComponent


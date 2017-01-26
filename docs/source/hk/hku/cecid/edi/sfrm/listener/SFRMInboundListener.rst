.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.piazza.commons.servlet RequestListenerException

SFRMInboundListener
===================

.. java:package:: hk.hku.cecid.edi.sfrm.listener
   :noindex:

.. java:type:: public class SFRMInboundListener extends SFRMRequestAdaptor

   This is the inbound listener for receiving the payload segment from the sender.

   :author: Twinsen

Methods
-------
processRequest
^^^^^^^^^^^^^^

.. java:method:: public void processRequest(SFRMRequest request, SFRMResponse response) throws RequestListenerException
   :outertype: SFRMInboundListener

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.listener.SFRMRequestAdaptor.processRequest(hk.hku.cecid.edi.as2.listener.SFRMRequest,hk.hku.cecid.edi.as2.listener.SFRMResponse)`


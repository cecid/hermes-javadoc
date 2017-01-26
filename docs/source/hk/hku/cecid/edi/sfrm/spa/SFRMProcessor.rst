.. java:import:: java.util HashMap

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.piazza.commons.module ModuleException

.. java:import:: hk.hku.cecid.piazza.commons.module ModuleGroup

.. java:import:: hk.hku.cecid.piazza.commons.module PluginProcessor

.. java:import:: hk.hku.cecid.piazza.commons.os OSManager

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.spa Plugin

.. java:import:: hk.hku.cecid.piazza.commons.spa PluginException

.. java:import:: hk.hku.cecid.edi.sfrm.handler AcknowledgementHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMExternalRequestHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageSegmentHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMPartnershipHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler IncomingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

SFRMProcessor
=============

.. java:package:: hk.hku.cecid.edi.sfrm.spa
   :noindex:

.. java:type:: public class SFRMProcessor extends PluginProcessor

   The SFRM SPA plugin processor for initiating and containing the references to all SFRM components. Creation Date: 27/9/2006

   :author: Twinsen, Philip

Fields
------
moduleGroup
^^^^^^^^^^^

.. java:field:: protected static ModuleGroup moduleGroup
   :outertype: SFRMProcessor

Methods
-------
createLock
^^^^^^^^^^

.. java:method:: public static synchronized Object createLock(String key)
   :outertype: SFRMProcessor

   [@SYNCRHONIZED] Create a Global lock for a particular key.

   :param key:

getAcknowledgementHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public AcknowledgementHandler getAcknowledgementHandler()
   :outertype: SFRMProcessor

getExternalRequestHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMExternalRequestHandler getExternalRequestHandler()
   :outertype: SFRMProcessor

getIncomingMessageHandler
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public IncomingMessageHandler getIncomingMessageHandler()
   :outertype: SFRMProcessor

getIncomingRepository
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PayloadsRepository getIncomingRepository()
   :outertype: SFRMProcessor

getInstance
^^^^^^^^^^^

.. java:method:: public static SFRMProcessor getInstance() throws ModuleException
   :outertype: SFRMProcessor

getKeyStoreManager
^^^^^^^^^^^^^^^^^^

.. java:method:: public KeyStoreManager getKeyStoreManager()
   :outertype: SFRMProcessor

getLock
^^^^^^^

.. java:method:: public static synchronized Object getLock(String key)
   :outertype: SFRMProcessor

   [@SYNCRHONIZED] Get a global lock for a particular key.

getMessageHandler
^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageHandler getMessageHandler()
   :outertype: SFRMProcessor

getMessageSegmentHandler
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessageSegmentHandler getMessageSegmentHandler()
   :outertype: SFRMProcessor

getMessageSpeedQueryHandler
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public MessageStatusQueryHandler getMessageSpeedQueryHandler()
   :outertype: SFRMProcessor

getModuleGroupImpl
^^^^^^^^^^^^^^^^^^

.. java:method:: protected ModuleGroup getModuleGroupImpl()
   :outertype: SFRMProcessor

getOSManager
^^^^^^^^^^^^

.. java:method:: public OSManager getOSManager()
   :outertype: SFRMProcessor

getOutgoingRepository
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public PackagedPayloadsRepository getOutgoingRepository()
   :outertype: SFRMProcessor

getPartnershipHandler
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipHandler getPartnershipHandler()
   :outertype: SFRMProcessor

processActivation
^^^^^^^^^^^^^^^^^

.. java:method:: public void processActivation(Plugin plugin) throws PluginException
   :outertype: SFRMProcessor

removeLock
^^^^^^^^^^

.. java:method:: public static synchronized void removeLock(String key)
   :outertype: SFRMProcessor

   [@SYNCRHONIZED] Remove a global lock for a particular key.

   :param key:

setModuleGroupImpl
^^^^^^^^^^^^^^^^^^

.. java:method:: protected void setModuleGroupImpl(ModuleGroup mg)
   :outertype: SFRMProcessor


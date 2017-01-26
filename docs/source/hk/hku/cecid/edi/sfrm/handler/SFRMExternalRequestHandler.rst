.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMComponent

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

SFRMExternalRequestHandler
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMExternalRequestHandler extends SFRMComponent

   :author: Patrick Yip

Methods
-------
getInstance
^^^^^^^^^^^

.. java:method:: public SFRMExternalRequestHandler getInstance()
   :outertype: SFRMExternalRequestHandler

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: SFRMExternalRequestHandler

resumeMessage
^^^^^^^^^^^^^

.. java:method:: public synchronized void resumeMessage(String messageId) throws DAOException, SFRMException
   :outertype: SFRMExternalRequestHandler

suspendMessage
^^^^^^^^^^^^^^

.. java:method:: public synchronized void suspendMessage(String messageId) throws DAOException, SFRMException, InterruptedException
   :outertype: SFRMExternalRequestHandler


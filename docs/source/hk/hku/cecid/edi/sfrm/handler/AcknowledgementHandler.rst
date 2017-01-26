.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadException

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsState

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementParser

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMComponent

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: java.sql Timestamp

.. java:import:: java.util List

.. java:import:: java.util Vector

AcknowledgementHandler
======================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class AcknowledgementHandler extends SFRMComponent

Methods
-------
getInstance
^^^^^^^^^^^

.. java:method:: public static AcknowledgementHandler getInstance()
   :outertype: AcknowledgementHandler

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: AcknowledgementHandler

   Initialization of this Component

processAcknowledgementResponse
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void processAcknowledgementResponse(String responseContent) throws Exception
   :outertype: AcknowledgementHandler


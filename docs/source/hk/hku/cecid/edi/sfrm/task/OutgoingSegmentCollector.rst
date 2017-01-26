.. java:import:: java.io IOException

.. java:import:: java.util Properties

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.util BandWidthOptimizer

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsState

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskModule

.. java:import:: hk.hku.cecid.piazza.commons.module LimitedActiveTaskList

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

OutgoingSegmentCollector
========================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class OutgoingSegmentCollector extends LimitedActiveTaskList

   The outgoing segment payloads collector collect all segmented payload at the database which is ready for sending to receiver. (status: PS). Creation Date: 25/10/2006

   :author: Twinsen Tsang

Methods
-------
getTaskList
^^^^^^^^^^^

.. java:method:: public List getTaskList()
   :outertype: OutgoingSegmentCollector

   It get the set of payload directory from the segmented payloads repository and pass to outgoing segmented payload tasks for process.

   :return: A list of Outgoing segmented payloads task.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: OutgoingSegmentCollector


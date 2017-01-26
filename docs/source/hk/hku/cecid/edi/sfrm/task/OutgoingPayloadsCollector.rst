.. java:import:: java.io IOException

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.module LimitedActiveTaskList

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsState

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMPartnershipHandler

OutgoingPayloadsCollector
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class OutgoingPayloadsCollector extends LimitedActiveTaskList

   The outgoing message payloads collector collects all packaged message from the DB with the associated payload which then create DB segments for send. The looking query for packaged message.

   .. parsed-literal::

      select * from sfrm_message where message_box = ? and status = ?

   Creation Date: 5/10/2006.

   :author: Twinsen Tsang

Methods
-------
getTaskList
^^^^^^^^^^^

.. java:method:: public List getTaskList()
   :outertype: OutgoingPayloadsCollector

   It get the set of payload directory from the packaged payloads repository and pass to outgoing message payload tasks for process.

   :return: A list of Outgoing message payload task.


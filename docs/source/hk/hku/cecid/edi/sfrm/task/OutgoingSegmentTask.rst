.. java:import:: java.io IOException

.. java:import:: java.sql Timestamp

.. java:import:: java.security NoSuchAlgorithmException

.. java:import:: java.security UnrecoverableKeyException

.. java:import:: javax.activation DataSource

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.activation EmptyDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.activation FileRegionDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.handler OutgoingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

OutgoingSegmentTask
===================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class OutgoingSegmentTask extends ActiveTaskAdaptor

   Creation Date: 9/10/2006

   :author: Twinsen Tsang

Constructors
------------
OutgoingSegmentTask
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public OutgoingSegmentTask(SFRMMessageSegmentDVO sgtDVO, SFRMPartnershipDVO pDVO, SFRMMessageDVO msgDVO, PackagedPayloads payload)
   :outertype: OutgoingSegmentTask

   Explicit Constructor.

   :param sgtDVO: The payload need to be send out.
   :param pDVO: The partnership record associated to this segment.
   :param msgDVO: The message record associated to this segment.
   :param payload: The packaged payloads
   :throws NullPointerException: If the message, partnership and segment is null.

Methods
-------
execute
^^^^^^^

.. java:method:: public void execute() throws Exception
   :outertype: OutgoingSegmentTask

   Execute the active task.

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.module.ActiveTask.execute()`

getMaxRetries
^^^^^^^^^^^^^

.. java:method:: public int getMaxRetries()
   :outertype: OutgoingSegmentTask

   :return: return the max retries allowed for this active task.

getRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public long getRetryInterval()
   :outertype: OutgoingSegmentTask

   :return: return the interval between each sending retry.

isRetryEnabled
^^^^^^^^^^^^^^

.. java:method:: public boolean isRetryEnabled()
   :outertype: OutgoingSegmentTask

   :return: return true if this task can be retried.

onFailure
^^^^^^^^^

.. java:method:: public void onFailure(Throwable e)
   :outertype: OutgoingSegmentTask

   The method is invoked upon the task fails to send. The message segment and message will treat as FAIL. with status DF (Delivery Failure). Also, if the outgoing segment is a RECEIPT, then the PAYLOAD segment corresponding to this RECEIPT is also treated as FAIL.

   :param e: The failure cause.

setRetried
^^^^^^^^^^

.. java:method:: public void setRetried(int retried)
   :outertype: OutgoingSegmentTask

   Set the retries of active task. The parameter \ ``retried``\  is useless here as we use the field "retried" in the database segment table for reference.

   :param retried: The number of times that has been tried.


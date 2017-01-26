.. java:import:: java.io IOException

.. java:import:: java.net MalformedURLException

.. java:import:: java.sql Timestamp

.. java:import:: java.util Calendar

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProperties

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.edi.sfrm.util StopWatch

.. java:import:: hk.hku.cecid.edi.sfrm.activation FileRegionDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler OutgoingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageFactory

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

OutgoingPayloadsTask
====================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class OutgoingPayloadsTask extends ActiveTaskAdaptor

   \ **What the task does**\

   ..

   * Update the status of message to segmentating (status: ST).
   * Analyze the payload and save the segment record to the database.
   * Update the status of message to processing (status: PR).

   Creation Date: 24/10/2006.

   :author: Twinsen Tsang

Constructors
------------
OutgoingPayloadsTask
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public OutgoingPayloadsTask(PackagedPayloads payload, SFRMPartnershipDVO pDVO, String status) throws DAOException, IOException
   :outertype: OutgoingPayloadsTask

   Explicit Constructor.

   :param payload: The packaged payload file.
   :param pDVO: TODO
   :param status: The status of the for process
   :throws NullPointerException: if the input payload is null.
   :throws DAOException: if fail to retreve the partnership.
   :throws IOException:

Methods
-------
execute
^^^^^^^

.. java:method:: public void execute() throws Exception
   :outertype: OutgoingPayloadsTask

   Execute the active task.

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.module.ActiveTask.execute()`

getMaxRetries
^^^^^^^^^^^^^

.. java:method:: public int getMaxRetries()
   :outertype: OutgoingPayloadsTask

getRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public long getRetryInterval()
   :outertype: OutgoingPayloadsTask

isRetryEnabled
^^^^^^^^^^^^^^

.. java:method:: public boolean isRetryEnabled()
   :outertype: OutgoingPayloadsTask

onFailure
^^^^^^^^^

.. java:method:: public void onFailure(Throwable e)
   :outertype: OutgoingPayloadsTask

   Invoke when failure.

setRetried
^^^^^^^^^^

.. java:method:: public void setRetried(int retried)
   :outertype: OutgoingPayloadsTask


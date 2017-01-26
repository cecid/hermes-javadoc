.. java:import:: java.sql Timestamp

.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageSegmentHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

StatusQuery
===========

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class StatusQuery

   :author: Patrick Yip

Constructors
------------
StatusQuery
^^^^^^^^^^^

.. java:constructor:: public StatusQuery(String messageId, SFRMMessageSegmentDAO dao)
   :outertype: StatusQuery

Methods
-------
getCurrentSpeed
^^^^^^^^^^^^^^^

.. java:method:: public double getCurrentSpeed()
   :outertype: StatusQuery

getEstimatedTime
^^^^^^^^^^^^^^^^

.. java:method:: public int getEstimatedTime()
   :outertype: StatusQuery

getLastUpdatedTime
^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getLastUpdatedTime()
   :outertype: StatusQuery

getMessageId
^^^^^^^^^^^^

.. java:method:: public String getMessageId()
   :outertype: StatusQuery

getNumOfProcessedSegments
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public int getNumOfProcessedSegments()
   :outertype: StatusQuery

getNumOfSegments
^^^^^^^^^^^^^^^^

.. java:method:: public int getNumOfSegments()
   :outertype: StatusQuery

getSegmentSize
^^^^^^^^^^^^^^

.. java:method:: public long getSegmentSize()
   :outertype: StatusQuery

getStatus
^^^^^^^^^

.. java:method:: public String getStatus()
   :outertype: StatusQuery

getStatusDesc
^^^^^^^^^^^^^

.. java:method:: public String getStatusDesc()
   :outertype: StatusQuery

init
^^^^

.. java:method:: public void init() throws Exception
   :outertype: StatusQuery

start
^^^^^

.. java:method:: public void start()
   :outertype: StatusQuery

stop
^^^^

.. java:method:: public void stop()
   :outertype: StatusQuery

tick
^^^^

.. java:method:: public void tick() throws DAOException
   :outertype: StatusQuery

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: StatusQuery

updateCurrentSpeed
^^^^^^^^^^^^^^^^^^

.. java:method:: public void updateCurrentSpeed()
   :outertype: StatusQuery

updateCurrentSpeedFromMsg
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void updateCurrentSpeedFromMsg()
   :outertype: StatusQuery

updateEstimatedTime
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void updateEstimatedTime()
   :outertype: StatusQuery

updateProgress
^^^^^^^^^^^^^^

.. java:method:: public void updateProgress() throws DAOException
   :outertype: StatusQuery


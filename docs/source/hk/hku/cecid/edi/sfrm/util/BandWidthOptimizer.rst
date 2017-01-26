.. java:import:: java.util ArrayList

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util Set

.. java:import:: java.util TreeMap

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskModule

BandWidthOptimizer
==================

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class BandWidthOptimizer

   :author: Patrick Yip To regulate the execution interval of the collector, to improve the performance and use as least resource as possible to reach the maximum speed

Constructors
------------
BandWidthOptimizer
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public BandWidthOptimizer(ActiveTaskModule collector)
   :outertype: BandWidthOptimizer

Methods
-------
adjustSpeed
^^^^^^^^^^^

.. java:method:: public long adjustSpeed(double currentSpeed, double expectedSpeed, long currentExecutionInterval)
   :outertype: BandWidthOptimizer

   Adjust the current speed to the specified speed

   :param currentSpeed: current speed
   :param expectedSpeed: expected speed
   :return: the adjusted execution interval

findMaxSpeed
^^^^^^^^^^^^

.. java:method:: public boolean findMaxSpeed()
   :outertype: BandWidthOptimizer

getCurrentEI
^^^^^^^^^^^^

.. java:method:: public long getCurrentEI()
   :outertype: BandWidthOptimizer

getOptimizedEI
^^^^^^^^^^^^^^

.. java:method:: public long getOptimizedEI()
   :outertype: BandWidthOptimizer

getOptimizedSpeed
^^^^^^^^^^^^^^^^^

.. java:method:: public double getOptimizedSpeed()
   :outertype: BandWidthOptimizer

isFoundOptimized
^^^^^^^^^^^^^^^^

.. java:method:: public boolean isFoundOptimized()
   :outertype: BandWidthOptimizer

printIntervalRetriedMap
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void printIntervalRetriedMap()
   :outertype: BandWidthOptimizer

printIntervalSpeedMap
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void printIntervalSpeedMap()
   :outertype: BandWidthOptimizer

reset
^^^^^

.. java:method:: public void reset()
   :outertype: BandWidthOptimizer

   Reset the bandwidth optimizer

setAdjustEIDelta
^^^^^^^^^^^^^^^^

.. java:method:: public void setAdjustEIDelta(long delta)
   :outertype: BandWidthOptimizer

setAdjustEIMin
^^^^^^^^^^^^^^

.. java:method:: public void setAdjustEIMin(long min)
   :outertype: BandWidthOptimizer

setAdjustSpeedTolerance
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setAdjustSpeedTolerance(double tolerance)
   :outertype: BandWidthOptimizer

setEIIncrement
^^^^^^^^^^^^^^

.. java:method:: public void setEIIncrement(long increment)
   :outertype: BandWidthOptimizer

setEISpeedGradientTolerance
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setEISpeedGradientTolerance(double tolerance)
   :outertype: BandWidthOptimizer

setMaxExecutionInterval
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setMaxExecutionInterval(long maxEI)
   :outertype: BandWidthOptimizer

setMaxRound
^^^^^^^^^^^

.. java:method:: public void setMaxRound(int maxRound)
   :outertype: BandWidthOptimizer

setMinExecutionInterval
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setMinExecutionInterval(long minEI)
   :outertype: BandWidthOptimizer

setSpeedGradientTolerance
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setSpeedGradientTolerance(double tolerance)
   :outertype: BandWidthOptimizer


.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

SFRMLogUtil
===========

.. java:package:: hk.hku.cecid.edi.sfrm.spa
   :noindex:

.. java:type:: public class SFRMLogUtil

   The \ ``SFRMLogUtil``\  Creation Date: 03/07/2007

   :author: Twinsen Tsang

Fields
------
DEFAULT_BUFFER_LENGTH
^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final int DEFAULT_BUFFER_LENGTH
   :outertype: SFRMLogUtil

Methods
-------
debug
^^^^^

.. java:method:: public static void debug(String caller, String action, String segmentType)
   :outertype: SFRMLogUtil

log
^^^

.. java:method:: public static void log(String caller, String action, String messageId, int segmentNumber)
   :outertype: SFRMLogUtil

   :param caller:
   :param action:
   :param messageId:
   :param segmentNumber:

log
^^^

.. java:method:: public static void log(String caller, String action, int segmentNumber)
   :outertype: SFRMLogUtil

   :param caller:
   :param action:
   :param segmentNumber:

logInfo
^^^^^^^

.. java:method:: public static String logInfo(String caller, String action, SFRMMessage message)
   :outertype: SFRMLogUtil

   :param caller:
   :param action:
   :param message:


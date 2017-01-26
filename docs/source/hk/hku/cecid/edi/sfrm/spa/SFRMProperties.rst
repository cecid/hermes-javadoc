.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SFRMProperties
==============

.. java:package:: hk.hku.cecid.edi.sfrm.spa
   :noindex:

.. java:type:: public class SFRMProperties

   Provide fast access of constant field defined in the properties files. It is originally come from POC1. Creation Date: 3/10/2006 V1.0.2 - Added \ ``Mailcaps``\  properties.

   :author: Twinsen

Fields
------
XPATH_MAILCAPS
^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_MAILCAPS
   :outertype: SFRMProperties

   The XML Path for the data content handler (DCH) for the activiation framework.

XPATH_MAX_PAYLOAD_SIZE
^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_MAX_PAYLOAD_SIZE
   :outertype: SFRMProperties

   The XML Path for the maximum payload size that can be sent. The typical value is 5GB.

XPATH_SEGMENT_SIZE
^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_SEGMENT_SIZE
   :outertype: SFRMProperties

   The XML Path for the sfrm segment size. The typical size is 1 mb.

XPATH_SEPARATOR
^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_SEPARATOR
   :outertype: SFRMProperties

   The constant field for default XML separator.

XPATH_SFRM
^^^^^^^^^^

.. java:field:: public static final String XPATH_SFRM
   :outertype: SFRMProperties

   The sfrm XML namespace name.

XPATH_SPEED_MAXIMUM
^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_SPEED_MAXIMUM
   :outertype: SFRMProperties

   The XML Path for the maximum speed that user specified (Bandwidth Optimizer)

XPATH_SPEED_TICK_INTERVAL
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_SPEED_TICK_INTERVAL
   :outertype: SFRMProperties

   The XML Path for the interval for ticking the speed of the sending message

XPATH_TRUSTED_CERTS
^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String XPATH_TRUSTED_CERTS
   :outertype: SFRMProperties

   The XML Path for the trusted certificates location.

Methods
-------
getAvailableMailCaps
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static String[] getAvailableMailCaps()
   :outertype: SFRMProperties

   :return: the available mail caps for the activiation framework available in the SFRM plugin.

getMaxPayloadSize
^^^^^^^^^^^^^^^^^

.. java:method:: public static long getMaxPayloadSize()
   :outertype: SFRMProperties

   :return: the max payload size allowed.

getPayloadSegmentSize
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static int getPayloadSegmentSize()
   :outertype: SFRMProperties

   Get the fixed size of each payload segment.

   :return: the size of each segment.

getSpeedTickInterval
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public static long getSpeedTickInterval()
   :outertype: SFRMProperties

getTrustedCertStore
^^^^^^^^^^^^^^^^^^^

.. java:method:: public static String getTrustedCertStore()
   :outertype: SFRMProperties

   Get the location of trusted certificate store.

   :return: a absolute path storing the trusted certificate store.

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: SFRMProperties

   toString method.


SFRMHeader
==========

.. java:package:: hk.hku.cecid.edi.sfrm.pkg
   :noindex:

.. java:type:: public class SFRMHeader

   SFRMHeader represents a set of SFRM message headers. Version 1.0.2 -  Added Converation Id. Version 1.0.1 -  Header schema updated for the impl of on-the-fly sending and recv mode. Remove deprecated fields. Version 2.0.0 -  Add Is-Packed header field Add Filename header field

   :author: Twinsen Tsang

Fields
------
MESSAGE_ID
^^^^^^^^^^

.. java:field:: public static final String MESSAGE_ID
   :outertype: SFRMHeader

   The SFRM message id field.

SFRM_CONVERATION
^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_CONVERATION
   :outertype: SFRMHeader

   The SFRM converation id field. This field is RESERVED.

SFRM_FILENAME
^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_FILENAME
   :outertype: SFRMHeader

   The SFRM field to represent the file name of the payload. This field is significance when the Is-Packed file is set to No.

SFRM_META_TOTAL_SEGMENT
^^^^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_META_TOTAL_SEGMENT
   :outertype: SFRMHeader

   The SFRM total segment field for meta message.

SFRM_PARTNERSHIP
^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_PARTNERSHIP
   :outertype: SFRMHeader

   The SFRM partnership id field.

SFRM_RECEIPT_LAST
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_RECEIPT_LAST
   :outertype: SFRMHeader

   The SFRM flag for representing it is a the last receipt / ack of the message.

SFRM_SEGMENT_LENGTH
^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_SEGMENT_LENGTH
   :outertype: SFRMHeader

   The SFRM segment length field.

SFRM_SEGMENT_NO
^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_SEGMENT_NO
   :outertype: SFRMHeader

   The SFRM segment no field.

SFRM_SEGMENT_OFFSET
^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_SEGMENT_OFFSET
   :outertype: SFRMHeader

   The SFRM segment offset field.

SFRM_SEGMENT_TYPE
^^^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_SEGMENT_TYPE
   :outertype: SFRMHeader

   The SFRM segment type field.

SFRM_TOTAL_SIZE
^^^^^^^^^^^^^^^

.. java:field:: public static final String SFRM_TOTAL_SIZE
   :outertype: SFRMHeader

   The SFRM total size field for message.

SFRM_VERSION
^^^^^^^^^^^^

.. java:field:: public static final String SFRM_VERSION
   :outertype: SFRMHeader

   The SFRM version field. The current value of this field is 1.0.2.


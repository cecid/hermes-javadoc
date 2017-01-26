SFRMLog
=======

.. java:package:: hk.hku.cecid.edi.sfrm.spa
   :noindex:

.. java:type:: public interface SFRMLog

   The \ ``SFRMLog``\  is the log code for the logging statement in the sfrm.log files. For detail, please read "doc/logcode.txt".

   :author: Twinsen Tsang

Fields
------
ATC_CALLER
^^^^^^^^^^

.. java:field:: public static final String ATC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``AcknowledgementCollector``\  log.

AT_CALLER
^^^^^^^^^

.. java:field:: public static final String AT_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``AcknowledgementTask``\  log.

CREATE_SGT
^^^^^^^^^^

.. java:field:: public static final String CREATE_SGT
   :outertype: SFRMLog

   The constant field for indicating creating segment in the log.

DECRYPT_SGT
^^^^^^^^^^^

.. java:field:: public static final String DECRYPT_SGT
   :outertype: SFRMLog

   The constant field for indicating the de-crypting segment in the log.

ENCRYPT_SGT
^^^^^^^^^^^

.. java:field:: public static final String ENCRYPT_SGT
   :outertype: SFRMLog

   The constant field for indicating the encrypting segment in the log.

FAIL_CRC
^^^^^^^^

.. java:field:: public static final String FAIL_CRC
   :outertype: SFRMLog

   The constant field for indicating CRC fail in the log.

FAIL_HDSK
^^^^^^^^^

.. java:field:: public static final String FAIL_HDSK
   :outertype: SFRMLog

   The constant field for indicating failure in processing handshaking request in the log.

FIRST_LOAD
^^^^^^^^^^

.. java:field:: public static final String FIRST_LOAD
   :outertype: SFRMLog

   The constant field for indicating the first load in the collector.

ILLEGAL_SGT
^^^^^^^^^^^

.. java:field:: public static final String ILLEGAL_SGT
   :outertype: SFRMLog

   The constant field for receiving a illegal segment.

IMH_CALLER
^^^^^^^^^^

.. java:field:: public static final String IMH_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the \ ``Incoming Message Handler``\  log.

INSERT_SGTS
^^^^^^^^^^^

.. java:field:: public static final String INSERT_SGTS
   :outertype: SFRMLog

   The constant field for indicating insertion segments in the log.

IPTC_CALLER
^^^^^^^^^^^

.. java:field:: public static final String IPTC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``IncomingPayloadCollector``\  log.

IPT_CALLER
^^^^^^^^^^

.. java:field:: public static final String IPT_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the \ ``Incoming Payloads Task``\  log.

MSC_CALLER
^^^^^^^^^^

.. java:field:: public static final String MSC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``MessageStatusCollecotr``\  log.

MSGID_PREFIX
^^^^^^^^^^^^

.. java:field:: public static final String MSGID_PREFIX
   :outertype: SFRMLog

   The constant field for logging message id prefix.

MSHDAO_CALLER
^^^^^^^^^^^^^

.. java:field:: public static final String MSHDAO_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``SFRMMessageSegmentHandler``\  log.

NOTIFY_REPT
^^^^^^^^^^^

.. java:field:: public static final String NOTIFY_REPT
   :outertype: SFRMLog

   The constant field for indicating the last receipt has been sent and notify to all thread waiting in the global lock.

OMH_CALLER
^^^^^^^^^^

.. java:field:: public static final String OMH_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the \ ``Outgoing Message Handler``\  log.

OPPTC_CALLER
^^^^^^^^^^^^

.. java:field:: public static final String OPPTC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``OutgoingPackagedPayloadCollector``\  log.

OPPT_CALLER
^^^^^^^^^^^

.. java:field:: public static final String OPPT_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the log. \ ``Outgoing Packaged Payload Task``\  log.

OPTC_CALLER
^^^^^^^^^^^

.. java:field:: public static final String OPTC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``OutgoingPayloadCollector``\  log.

OPT_CALLER
^^^^^^^^^^

.. java:field:: public static final String OPT_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the log. \ ``Outgoing Payload Task``\  log.

OSPTC_CALLER
^^^^^^^^^^^^

.. java:field:: public static final String OSPTC_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``OutgoingSegmentPayloadsCollector``\  log.

OSPT_CALLER
^^^^^^^^^^^

.. java:field:: public static final String OSPT_CALLER
   :outertype: SFRMLog

   The constant field for the prefix of the log. \ ``Outgoing Segment Payload Task``\  log.

OUTG_TASK
^^^^^^^^^

.. java:field:: public static final String OUTG_TASK
   :outertype: SFRMLog

   The constant field for indicating a new outgoing task is executing in the log.

PACK_MSG
^^^^^^^^

.. java:field:: public static final String PACK_MSG
   :outertype: SFRMLog

   The constant field for indicating packing message in the log.

QUERY_STATUS
^^^^^^^^^^^^

.. java:field:: public static final String QUERY_STATUS
   :outertype: SFRMLog

   The constant field for indicating there is web services client query the status of particular SFRM message.

RECEIVE_ALL
^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_ALL
   :outertype: SFRMLog

   The constant field for receiving all in the log.

RECEIVE_DUP
^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_DUP
   :outertype: SFRMLog

   The constant field for receiving duplication in the log.

RECEIVE_FAIL
^^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_FAIL
   :outertype: SFRMLog

   The constant field for indicating fail to receive in incoming message handler.

RECEIVE_HDSK
^^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_HDSK
   :outertype: SFRMLog

   The constant field for receiving handshaking request in the log.

RECEIVE_META
^^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_META
   :outertype: SFRMLog

   The constant field for indicating received meta in the log.

RECEIVE_SGT
^^^^^^^^^^^

.. java:field:: public static final String RECEIVE_SGT
   :outertype: SFRMLog

   The constant field for receiving msg in the log.

RESOLVE_FAIL
^^^^^^^^^^^^

.. java:field:: public static final String RESOLVE_FAIL
   :outertype: SFRMLog

   The constant field for failure to resolve the segment barrier.

ROLL_BACK
^^^^^^^^^

.. java:field:: public static final String ROLL_BACK
   :outertype: SFRMLog

   The constant field for indicating the roll back action in outgoing payload task.

SEND_ALL
^^^^^^^^

.. java:field:: public static final String SEND_ALL
   :outertype: SFRMLog

   The constant field for indicating sending all segment with reliable receipt.

SEND_HDSK
^^^^^^^^^

.. java:field:: public static final String SEND_HDSK
   :outertype: SFRMLog

   The constant field for indicating sending handshaking message in the log.

SEND_SGT
^^^^^^^^

.. java:field:: public static final String SEND_SGT
   :outertype: SFRMLog

   The constant field for indicating sending outgoing message in the log.

SGTNO_PREFIX
^^^^^^^^^^^^

.. java:field:: public static final String SGTNO_PREFIX
   :outertype: SFRMLog

   The constant field for logging segment number prefix.

SIGNING_SGT
^^^^^^^^^^^

.. java:field:: public static final String SIGNING_SGT
   :outertype: SFRMLog

   The constant field for indicating the signing segment in the log.

SPANNED_THRD
^^^^^^^^^^^^

.. java:field:: public static final String SPANNED_THRD
   :outertype: SFRMLog

   The constant field for indicating a new thread is spanning in the \ ``Incoming Message Handler``\  for handling the segment request.

SQS_CALLER
^^^^^^^^^^

.. java:field:: public static final String SQS_CALLER
   :outertype: SFRMLog

   The constant field for indicating the log prefix for \ ``SFRMMessageStatusQueryService``\  log.

SUCCESS_CRC
^^^^^^^^^^^

.. java:field:: public static final String SUCCESS_CRC
   :outertype: SFRMLog

   The constant field for indicating CRC successfully in the log.

UNPACK_MSG
^^^^^^^^^^

.. java:field:: public static final String UNPACK_MSG
   :outertype: SFRMLog

   The constant field for indicating the un-packing message in the log.

UNPACK_SGT
^^^^^^^^^^

.. java:field:: public static final String UNPACK_SGT
   :outertype: SFRMLog

   The constant field for indicating the un-packing segment in the log.

VERIFY_SGT
^^^^^^^^^^

.. java:field:: public static final String VERIFY_SGT
   :outertype: SFRMLog

   The constant field for indicating the verifiying segment in the log.

WAIT_REPT
^^^^^^^^^

.. java:field:: public static final String WAIT_REPT
   :outertype: SFRMLog

   The constant field for indicating the need to wait for all receipt to be done.


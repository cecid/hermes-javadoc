.. java:import:: java.io File

.. java:import:: java.io RandomAccessFile

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.nio MappedByteBuffer

.. java:import:: java.nio.channels Channels

.. java:import:: java.nio.channels ReadableByteChannel

.. java:import:: java.nio.channels FileChannel

.. java:import:: java.util Properties

.. java:import:: java.util List

.. java:import:: java.sql Timestamp

.. java:import:: java.net MalformedURLException

.. java:import:: java.security NoSuchAlgorithmException

.. java:import:: java.security UnrecoverableKeyException

.. java:import:: javax.mail MessagingException

.. java:import:: org.apache.commons.io FileUtils

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMComponent

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLogUtil

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProperties

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementBuilder

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageClassifier

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementParser

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageSegmentHandler

.. java:import:: hk.hku.cecid.edi.sfrm.io ChecksumException

.. java:import:: hk.hku.cecid.edi.sfrm.com FoldersPayload

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadException

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsRepository

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadsState

.. java:import:: hk.hku.cecid.edi.sfrm.com PackagedPayloads

.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveMonitor

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveThread

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.os OSManager

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

IncomingMessageHandler
======================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class IncomingMessageHandler extends SFRMComponent

   The incoming message handler is the core class for handling all incoming SFRM segment. It also handles:

   ..

   #. Allocation of disk space for HANDSHAKING segment.
   #. Insertion of data content to specified file for PAYLOAD segment.
   #. RECEIPT Response handling
   #. RECOVERY when data integrity check fails.
   #. Error Definition and handling

   For details, read \ :java:ref:`processIncomingMessage(SFRMMessage,Object[])`\  as the entry point for knowing how this class work. Creation Date: 11/10/2006

   :author: Twinsen Tsang

Methods
-------
extractPartnership
^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO extractPartnership(SFRMMessage incomingMessage) throws MalformedURLException
   :outertype: IncomingMessageHandler

   Validate whether the partnership for the incoming message is exist and return that partnership as return value. [SINGLE-THREADED].

   :param incomingMessage: The incoming SFRM message.
   :throws MalformedURLException: throw if the partnership does not found or any other database error.
   :return: A SFRM partnership record.

getInstance
^^^^^^^^^^^

.. java:method:: public static IncomingMessageHandler getInstance()
   :outertype: IncomingMessageHandler

   :return: an instnace of IncomingMessageHandler.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: IncomingMessageHandler

   Invoked for initialization. The IMH has serval properties :

   ..

   #. maxActive: The number of parallel threads for handling incoming segments. The default value is 10. [Integer]

initGuardForSegment
^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean initGuardForSegment(SFRMMessage incomingMessage)
   :outertype: IncomingMessageHandler

   initalize the \ **Guard**\  so that there is \ **ONLY ONE THREAD**\  working per the \ ``incomingMessage``\ .

   :param incomgMessage: The incoming SFRM Message.

isDuplicateSegment
^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isDuplicateSegment(SFRMMessage incomingMessage) throws DAOException
   :outertype: IncomingMessageHandler

   Validate whether the incoming segment message has been received once.

   :param incomingMessage: The incoming SFRM message.
   :throws DAOException: throw if there is any kind of database error.
   :return: true if it is a duplicated (received already).

isNotEnoughRoom
^^^^^^^^^^^^^^^

.. java:method:: public boolean isNotEnoughRoom(SFRMMessage incomingMessage, long threshold) throws Exception
   :outertype: IncomingMessageHandler

   Validate whether the harddisk has enough space for this message. The validation formula is liked this:

   .. parsed-literal::

       pS  : total payload size
       T   : threshold (the minimum hard disk space)
       HDDS: the remaining hard disk space

      true iff (HDDS >= pS + T)
      false iff (HDDS < ps + T)

   :param incomingMessage: The incoming SFRM message.
   :param threshold: The remaining disk space threshold. if the remaining disk space is lower than (this value + the payload size), in this case, it always return false.
   :return: true if there is enough hard disk space or the associated payloads is created already in the harddisk. vice versa.

isProcessingMessage
^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isProcessingMessage(SFRMMessage incomingMessage) throws DAOException, SFRMMessageException
   :outertype: IncomingMessageHandler

   Validate whether the associated message of this incoming segment is processing. Any state except \ :java:ref:`SFRMConstant.MSGS_PROCESSING`\  return false for this method invocation. If the message record does not exist in receiver, we treat this as failure because every segment should has handshaking steps before sending.

   :param incomingMessage: The incoming SFRM message.
   :throws DAOException: throw if there is any kind of database error.
   :throws SFRMMesageException:
   :return: true if it is processing.

logMessage
^^^^^^^^^^

.. java:method:: protected void logMessage(SFRMMessage incomingMessage)
   :outertype: IncomingMessageHandler

   Log the whole message for debug purpose.

   :param incomingMessage: The incoming sfrm message.

logMessageType
^^^^^^^^^^^^^^

.. java:method:: protected void logMessageType(String type)
   :outertype: IncomingMessageHandler

   Log the message type for debug purpose.  The message type currently support for this version is META, PAYLOAD ,RECEIPT and RECOVERY.

   :param type: The message type.

processAcknowledgement
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage processAcknowledgement(SFRMMessage msg, SFRMPartnershipDVO pDVO) throws Exception
   :outertype: IncomingMessageHandler

processHandshakingMessage
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage processHandshakingMessage(SFRMMessage rawMessage, Object[] params) throws Exception
   :outertype: IncomingMessageHandler

   Process handshaking for a new message. [SINGLE-THREADED]. The message segment is also \ **META**\  type. In the handshaking steps, it create the message record and check whether it has enough space for receiving the message. This method does not block and return immediately to let the sender know does the receiver is available to receive this message.

   :param rawMessage: The incoming SFRM Message.
   :param params: RESERVED.
   :throws DAOException: any kind of DB I/O Errors.
   :throws Exception: thrown when pre-allocate the payload.
   :return: RESERVED.

processIncomingMessage
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage processIncomingMessage(SFRMMessage incomingMessage, Object[] params) throws Exception
   :outertype: IncomingMessageHandler

   \ **Process all kind of incoming SFRM message.**\ . This method is invoked when the received HTTP request is transformed to SFRM Message from the SFRM inbound listener.

   :param incomingMessage: The incoming SFRM Message.
   :param params: RESERVED
   :throws Exception:
   :return: A SFRM message for response message.

processMetaMessage
^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage processMetaMessage(SFRMMessage inputMessage, SFRMPartnershipDVO partnershipDVO, Object[] params)
   :outertype: IncomingMessageHandler

   Process all meta-typed message segment. [MULTI-THREADED]. This method pre-allocates the payload and it blocks until the file has been created.

   :param inputMessage: The incoming SFRM Message. (unsigned and decrypted)
   :param partnershipDVO: The partnership DVO for this incoming message.
   :param params: RESERVED.
   :throws DAOException: any kind of DB I/O Errors.
   :throws Exception: thrown when pre-allocate the payload.
   :return: RESERVED.

processPDFAck
^^^^^^^^^^^^^

.. java:method:: public String processPDFAck(SFRMMessageDVO mDVO) throws DAOException
   :outertype: IncomingMessageHandler

   Process the acknowledgement with PDF status

   :param messageId: message ID
   :throws DAOException: if anything fail on database operation
   :return: the acknowledgement response content

processPPSAck
^^^^^^^^^^^^^

.. java:method:: public String processPPSAck(SFRMMessageDVO mDVO) throws DAOException
   :outertype: IncomingMessageHandler

   Process the acknowledgement with PPS status

   :param messageId: message ID
   :throws DAOException: if anything fail on database operation
   :return: the acknowledgement response content

processPRAck
^^^^^^^^^^^^

.. java:method:: public String processPRAck(SFRMMessageDVO mDVO, SFRMAcknowledgementParser parser) throws DAOException
   :outertype: IncomingMessageHandler

   Process the acknowledgement request with PR status

   :param messageId: message id
   :param parser: parser that content the acknowledgement request parsing
   :throws DAOException: if anything fail on database operation
   :return: the acknowledgement response content

processPRSAck
^^^^^^^^^^^^^

.. java:method:: public String processPRSAck(SFRMMessageDVO mDVO) throws DAOException
   :outertype: IncomingMessageHandler

   Process the acknowledgement with PRS status

   :param messageId: message ID
   :throws DAOException: if anything fail on database operation
   :return: the acknowledgement response content

processPSDAck
^^^^^^^^^^^^^

.. java:method:: public String processPSDAck(SFRMMessageDVO mDVO) throws DAOException
   :outertype: IncomingMessageHandler

   Process the acknowledgement with PSD status

   :param messageId: message ID
   :throws DAOException: if anything fail on database operation
   :return: the acknowledgement response content

processSegmentMessage
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage processSegmentMessage(SFRMMessage rawMessage, Object[] params) throws IOException, DAOException, SFRMMessageException, Exception
   :outertype: IncomingMessageHandler

   Process payload-typed segment message. What the method has done:

   ..

   * Create a segment file in the incoming segment repository.
   * Create a inbox message segment record for the incoming message.

   :param inputMessage: The packed SFRMMessage.
   :param rawMessage: The unpacked SFRM Message. (i.e. no sign and encrypt here)
   :param params: RESERVED
   :return: A SFRM message for response message.

releaseGuardForSegment
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean releaseGuardForSegment(SFRMMessage incomingMessage)
   :outertype: IncomingMessageHandler

   \ **Release**\  the ONE THREAD working GUARD for \ ``incomingMessage``\

   :param incomingMessage: The incoming SFRM Message.

resolveGuardOwnerForSegment
^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean resolveGuardOwnerForSegment(SFRMMessage incomingMessage)
   :outertype: IncomingMessageHandler

   \ **Resolve**\  the guard for the \ ``incomingMessage``\  to the new owner (another thread that process the \ ``incomingMessage``\ .

   :param incomingMesasge: The incoming SFRM Message.

unpackIncomingMessage
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void unpackIncomingMessage(SFRMMessage message, SFRMPartnershipDVO partnershipDVO) throws SFRMException
   :outertype: IncomingMessageHandler

   Unpack the SMIME (secure MIME) message to become raw SFRM Message.

   :param incomingMessage: The incoming SFRM Message.
   :param partnershipDVO: The partnership to valid against to.
   :throws Exception: any kind of exceptions.
   :return: The raw SFRM Message.


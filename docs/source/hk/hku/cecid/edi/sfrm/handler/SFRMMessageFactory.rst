.. java:import:: java.io File

.. java:import:: java.security NoSuchAlgorithmException

.. java:import:: java.security UnrecoverableKeyException

.. java:import:: hk.hku.cecid.edi.sfrm.activation EmptyDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.activation FileRegionDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.module Component

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

SFRMMessageFactory
==================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMMessageFactory extends Component

   It is the [FACTORY] of the SFRM Message. It provides API for creating all kinds of SFRM Message in the version 1.0.3 specification. Creation Date: 5/12/2006

   :author: Twinsen Tsang

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.pkg.SFRMMessage`

Methods
-------
createAcknowledgement
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage createAcknowledgement(SFRMMessageDVO mDVO, SFRMPartnershipDVO pDVO, String segType, String ackContent) throws SFRMException, NoSuchAlgorithmException, UnrecoverableKeyException, SFRMMessageException
   :outertype: SFRMMessageFactory

createHandshakingRequest
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage createHandshakingRequest(String messageId, String partnershipId, int totalSegment, long totalSize, String filename) throws SFRMMessageException
   :outertype: SFRMMessageFactory

   Create a handshaking request which is used for communicate to the receiver for delivery confirmation. This kind of SFRMMessage segment has the type called "META".

   :param messageId: The message Id of segment.
   :param partnershipId: The partnership Id of segment.
   :param totalSegment: The total segment of message.
   :param totalSize: The total size of message.
   :throws SFRMMessageException:
   :return: A new handshaking SFRM Message.

createPayloadRequest
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMMessage createPayloadRequest(String messageId, String partnershipId, int segmentNo, long segmentOffset, long segmentLength, long totalSize, File payload, String contentType) throws SFRMMessageException
   :outertype: SFRMMessageFactory

   :param messageId:
   :param partnershipId:
   :param segmentNo:
   :param segmentOffset:
   :param segmentLength:
   :param totalSize:
   :param payload:
   :param contentType:
   :throws SFRMMessageException:

getInstance
^^^^^^^^^^^

.. java:method:: public static SFRMMessageFactory getInstance()
   :outertype: SFRMMessageFactory

   :return: an instnace of SFRMMessageFactory.

setupMessage
^^^^^^^^^^^^

.. java:method:: protected void setupMessage(SFRMMessage ret, String messageId, String partnershipId, String segmentType, String convId, int segmentNo, File payload, String contentType) throws SFRMMessageException
   :outertype: SFRMMessageFactory

   Setup the message field according to the specified parameters.

   :param ret:
   :param messageId:
   :param partnershipId:
   :param segmentType:
   :param convId:
   :param segmentNo:


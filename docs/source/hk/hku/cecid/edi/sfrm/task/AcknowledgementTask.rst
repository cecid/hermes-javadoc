.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.security KeyStoreManager

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler AcknowledgementHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler OutgoingMessageHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageFactory

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMAcknowledgementBuilder

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: java.io BufferedReader

.. java:import:: java.io InputStreamReader

.. java:import:: java.security NoSuchAlgorithmException

.. java:import:: java.security UnrecoverableKeyException

.. java:import:: java.util List

.. java:import:: javax.mail MessagingException

AcknowledgementTask
===================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class AcknowledgementTask extends ActiveTaskAdaptor

   Active task responsible for handling the action of sending the acknowledgement request to receiver

   :author: Patrick Yip

Constructors
------------
AcknowledgementTask
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public AcknowledgementTask(SFRMMessageDVO messageDVO, SFRMPartnershipDVO partenershipDVO)
   :outertype: AcknowledgementTask

Methods
-------
execute
^^^^^^^

.. java:method:: public void execute() throws Exception
   :outertype: AcknowledgementTask

onFaulure
^^^^^^^^^

.. java:method:: public void onFaulure(Throwable e)
   :outertype: AcknowledgementTask

   Invoke when failure occur

   :param e:

unpackIncomingMessage
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void unpackIncomingMessage(SFRMMessage message, SFRMPartnershipDVO partnershipDVO) throws SFRMException
   :outertype: AcknowledgementTask


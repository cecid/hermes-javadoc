SFRMMessageClassifier
=====================

.. java:package:: hk.hku.cecid.edi.sfrm.pkg
   :noindex:

.. java:type:: public class SFRMMessageClassifier

   The \ ``SFRMMessageClassifier``\  is a classifier for SFRM segments. It provide very fast and efficient access to crtiical information for it's corresponding segment. Creation Date: 10/11/2006

   :author: Twinsen Tsang

Constructors
------------
SFRMMessageClassifier
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMMessageClassifier(SFRMMessage message)
   :outertype: SFRMMessageClassifier

   Explicit Constructor.

   :param message: The sfrm message need to be classify.
   :throws NullPointerException: if the message is null.
   :throws SFRMMessageException:
   :throws Exception:

Methods
-------
getMagicNumber
^^^^^^^^^^^^^^

.. java:method:: public byte getMagicNumber()
   :outertype: SFRMMessageClassifier

   :return: Get the internal presentation of the message structure.

isAcknowledgementRequest
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isAcknowledgementRequest()
   :outertype: SFRMMessageClassifier

isEncrypted
^^^^^^^^^^^

.. java:method:: public boolean isEncrypted()
   :outertype: SFRMMessageClassifier

   :return: true if the message is encrypted.

isError
^^^^^^^

.. java:method:: public boolean isError()
   :outertype: SFRMMessageClassifier

   :return: true if it is a error message.

isMeta
^^^^^^

.. java:method:: public boolean isMeta()
   :outertype: SFRMMessageClassifier

   :return: true if it is a meta message.

isPayload
^^^^^^^^^

.. java:method:: public boolean isPayload()
   :outertype: SFRMMessageClassifier

   :return: true if it is a payload message.

isSigned
^^^^^^^^

.. java:method:: public boolean isSigned()
   :outertype: SFRMMessageClassifier

   :return: true if the message is signed.

setEncrypted
^^^^^^^^^^^^

.. java:method:: protected void setEncrypted(boolean isEncrypt)
   :outertype: SFRMMessageClassifier

   [Protected]

   :param isEncrypt: the flag indicate whether the messags is encrypted or not.

setSigned
^^^^^^^^^

.. java:method:: protected void setSigned(boolean isSign)
   :outertype: SFRMMessageClassifier

   [Protected]

   :param isSign: the flag indicate whether the message is signed or not.


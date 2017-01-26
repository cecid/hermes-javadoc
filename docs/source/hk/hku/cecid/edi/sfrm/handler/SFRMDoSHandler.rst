.. java:import:: hk.hku.cecid.piazza.commons.module Component

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessageClassifier

.. java:import:: hk.hku.cecid.edi.sfrm.util TimedOutHashTable

SFRMDoSHandler
==============

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMDoSHandler extends Component

   The \ ``SFRMDoSHandler``\  is a simple barrier to ensure there is ONLY one-thread working per segment. When an incoming message is received and prepare to process, the \ **IMH**\  invoke \ :java:ref:`enter(SFRMMessage)`\  asking the DoSHandler to insert the working record for this segment. Then if there is a duplicate message received, the DosHandler reject it due to the working record has already exist. Thus it guarantees ONE THREAD WORKING per segment semantics.  \ **CAUTION**\ : When the thread in the working record is not alive, the DoSHandler considers the working record is redundant and \ **ALLOW**\  message with same composite key owning a barrier for that message. Creation Date: 28/6/2007

   :author: Twinsen Tsang

Methods
-------
enter
^^^^^

.. java:method:: public boolean enter(SFRMMessage message)
   :outertype: SFRMDoSHandler

   Invoke for requesting a barrier for \ ``message``\ .  For this case, the requested barrier does not expire.

   :param message: The incoming SFRM Message.
   :return: if the message has been entered by other thread before, it return false. otherwise, the barrier for this \ ``message``\  is created and the owner is the invocation thread.

enter
^^^^^

.. java:method:: public boolean enter(SFRMMessage message, long lifetime)
   :outertype: SFRMDoSHandler

   Invoke for requesting a barrier for \ ``message``\ .

   :param message: The incoming SFRM Message.
   :param lifetime: How long is the barrier expire in millisecond. The common use for this is managing timeout/retry for a message.
   :return: if the message has been entered by other thread before, it return false. otherwise, the barrier for this \ ``message``\  is created and the owner is the invocation thread.

exit
^^^^

.. java:method:: public boolean exit(SFRMMessage message)
   :outertype: SFRMDoSHandler

   Invoke for removing the barrier for a \ ``message``\ .  The internal barrier for this \ ``message``\  is removed and therefore invocating \ :java:ref:`enter(SFRMMessage)`\  for this \ ``mesasge``\  return true again.

   :param message: The incoming SFRM Message.
   :return: it returns true iff the working record exists and remove successfully.

getResolvedKey
^^^^^^^^^^^^^^

.. java:method:: public String getResolvedKey(SFRMMessage message)
   :outertype: SFRMDoSHandler

   Get the composite key from the \ ``message``\ .  What it does is generating one string indentifying the message.  For example:

   .. parsed-literal::

      Input message id: test@message-id
      Input segment type: PAYLOAD
      Input segment number: 999

      Then the resolved key is test@message-id_INBOX_PAYLOAD_999

   :param message: The incoming SFRM Message.
   :return: the composite key of thie SFRM Message.


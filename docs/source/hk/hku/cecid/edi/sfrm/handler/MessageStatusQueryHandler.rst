.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMComponent

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: java.util Hashtable

.. java:import:: java.util Iterator

MessageStatusQueryHandler
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class MessageStatusQueryHandler extends SFRMComponent

   Handler to hold all the speed measurement class for active transferring SFRM Message. Active transferring message mean the message status is in PS processing

   :author: Patrick Yip

Methods
-------
addMessageSpeedQuery
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public StatusQuery addMessageSpeedQuery(String messageId) throws DAOException
   :outertype: MessageStatusQueryHandler

   Add a message for monitoring the message status

   :param messageId: SFRM Message ID
   :return: newly created StatusQuery

getInstance
^^^^^^^^^^^

.. java:method:: public static MessageStatusQueryHandler getInstance()
   :outertype: MessageStatusQueryHandler

getMessageList
^^^^^^^^^^^^^^

.. java:method:: public Iterator<String> getMessageList()
   :outertype: MessageStatusQueryHandler

   Get the list of message ID which is monitoring by this handler

   :return: iterator of message ID

getMessageSpeedQuery
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public StatusQuery getMessageSpeedQuery(String messageId)
   :outertype: MessageStatusQueryHandler

   Get the StatusQuery for a particular message

   :param messageId:
   :return: StatusQuery for a given message, null if is non-exist

getTotalSpeed
^^^^^^^^^^^^^

.. java:method:: public double getTotalSpeed()
   :outertype: MessageStatusQueryHandler

   Get the total speed for the currently transfering message

   :return: total speed

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: MessageStatusQueryHandler

removeMessageSpeedQuery
^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public StatusQuery removeMessageSpeedQuery(String messageId)
   :outertype: MessageStatusQueryHandler

   Remove the status query for particular message

   :param messageId: SFRM Message ID
   :return: removed SpeedQuery


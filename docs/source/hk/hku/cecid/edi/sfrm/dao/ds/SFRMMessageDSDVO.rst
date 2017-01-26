.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.security.cert CertificateFactory

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.sql Timestamp

.. java:import:: java.util Hashtable

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDVO

SFRMMessageDSDVO
================

.. java:package:: hk.hku.cecid.edi.sfrm.dao.ds
   :noindex:

.. java:type:: public class SFRMMessageDSDVO extends DataSourceDVO implements SFRMMessageDVO

   The \ ``SFRMMessageDSDVO``\  is a data value object that represent a tabular row in \ *sfrm_message*\  at the persistence layer. It possesses caching automatically for most frequently fields shown below:

   ..

   #. message id
   #. message box
   #. partnership id
   #. partnership endpoint
   #. requires signing / encryption
   #. status

   So developers do not need to worry the issue of thread contention and can freely call the \ *get*\  and \ *set*\  with no performance impact. Creation Date: 29/9/2006 Version 1.0.3 -

   ..

   * Added cache for hot access field, it requires extra \ *22*\  bytes per \ ``SFRMMessageDSDVO``\  object.

   Version 1.0.2 -

   ..

   * Added conversation id

   Version 2.0.0 -

   ..

   * Added sign algorithm
   * Removed is signed
   * Added encrypt algorithm
   * Removed is encrypted

   :author: Twinsen Tsang

Methods
-------
getCompletedTimestamp
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCompletedTimestamp()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the timstamp that the message has been processed completely.

getCreatedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCreatedTimestamp()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the creation timestamp of this message.

getEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptAlgorithm()
   :outertype: SFRMMessageDSDVO

   :return: the encrypt algorithm of this message, return null if message not need to encrypt

getFilename
^^^^^^^^^^^

.. java:method:: public String getFilename()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: filename field that represent the filename of the original file, if the message payload is not packed in tar format

getIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean getIsHostnameVerified()
   :outertype: SFRMMessageDSDVO

getMessageBox
^^^^^^^^^^^^^

.. java:method:: public String getMessageBox()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY, CACHABLE]

   :return: the message box from the message DVO.

getMessageId
^^^^^^^^^^^^

.. java:method:: public String getMessageId()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY, CACHABLE] Get the message id from the message DVO.

getPartnerCertContent
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerCertContent()
   :outertype: SFRMMessageDSDVO

getPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerEndpoint()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY, CACHABLE]

   :return: the partnership endpoint from the message DVO.

getPartnerX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getPartnerX509Certificate() throws SFRMException
   :outertype: SFRMMessageDSDVO

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY, CACHABLE]

   :return: the partnership id from the message DVO.

getProceedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getProceedTimestamp()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the timestamp that message is proceeding.

getSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public String getSignAlgorithm()
   :outertype: SFRMMessageDSDVO

   :return: the sign algorithm of this message, return null if message not need to sign

getStatus
^^^^^^^^^

.. java:method:: public String getStatus()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY, CACHABLE]

   :return: get the status of the message DVO.

getStatusDescription
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getStatusDescription()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the brief description about the message status.

getTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public int getTotalSegment()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the total segment of this message DVO.

getTotalSize
^^^^^^^^^^^^

.. java:method:: public long getTotalSize()
   :outertype: SFRMMessageDSDVO

   [@GET, THREAD-SAFETY]

   :return: the total size of this message DVO.

setCompletedTimestamp
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCompletedTimestamp(Timestamp completedTimestamp)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY]

   :param the: timestamp that the message has been processed completely.

setCreatedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCreatedTimestamp(Timestamp createdTimestamp)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY]

   :param createdTimestamp: set the creation timestamp of this message.

setData
^^^^^^^

.. java:method:: public void setData(Hashtable hs)
   :outertype: SFRMMessageDSDVO

   [@OVERRIDE] set the DVO interval dataset and update some \ ``boolean cached values.``\

setEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setEncryptAlgorithm(String eAlgorithm)
   :outertype: SFRMMessageDSDVO

   Set the encrypt algorithm of this message

   :param eAlgorithm: encrypt algorithm, null if message didn't require encryption

setFilename
^^^^^^^^^^^

.. java:method:: public void setFilename(String filename)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY]

   :param filename: filename field that represent the filename of the original file, if the message payload is not packed in tar format

setIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setIsHostnameVerified(boolean isHostnameVerified)
   :outertype: SFRMMessageDSDVO

setMessageBox
^^^^^^^^^^^^^

.. java:method:: public void setMessageBox(String messageBox)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY, CACHABLE] Set the message box to the message DVO.

   :param message: box either \ **INBOX**\  OR \ **OUTBOX**\

setMessageId
^^^^^^^^^^^^

.. java:method:: public void setMessageId(String messageId)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY, CACHABLE] Set the message id from the message DVO.

   :param messageId: the new message id.

setPartnerCertContent
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerCertContent(String partnerCertContent)
   :outertype: SFRMMessageDSDVO

setPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerEndpoint(String partnerEndpoint)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY, CACHABLE] Set the partnership endpoint to the message DVO.

   :param partnershipId: the partnership endpoint of this message DVO.

setPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipId(String partnershipId)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY, CACHABLE] Set the partnership id to the message DVO.

   :param partnershipId: the partnership id of this message DVO.

setProceedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setProceedTimestamp(Timestamp proceedTimestamp)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY]

   :param proceedTimestamp: set the timestamp that message is proceeding.

setSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public void setSignAlgorithm(String sAlgorithm)
   :outertype: SFRMMessageDSDVO

   Set the signing algorithm of this message

   :param sAlgorithm: sign algorithm, null if message didn't require signing

setStatus
^^^^^^^^^

.. java:method:: public void setStatus(String status)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY, CACHABLE]

   :param status: The new status of message DVO.

setStatusDescription
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setStatusDescription(String statusDescription)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY] Set the brief description about the message status.

   :param statusDescription: the brief description about the message status.

setTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public void setTotalSegment(int totalSegment)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY] Set the total segment of this message DVO.

   :param totalSegment: the total segment of this message DVO.

setTotalSize
^^^^^^^^^^^^

.. java:method:: public void setTotalSize(long totalSize)
   :outertype: SFRMMessageDSDVO

   [@SET, THREAD-SAFETY] Set the total size of this message DVO.

   :param totalSegment: the total size of this message DVO.


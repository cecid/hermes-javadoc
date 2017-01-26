.. java:import:: java.security.cert X509Certificate

.. java:import:: java.sql Timestamp

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

SFRMMessageDVO
==============

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public interface SFRMMessageDVO extends DVO

   This is the object that represents a record of SFRMMessage in the database. Creation Date: 29/9/2006

   :author: Twinsen Tsang

Methods
-------
getCompletedTimestamp
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCompletedTimestamp()
   :outertype: SFRMMessageDVO

getCreatedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCreatedTimestamp()
   :outertype: SFRMMessageDVO

getEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptAlgorithm()
   :outertype: SFRMMessageDVO

getFilename
^^^^^^^^^^^

.. java:method:: public String getFilename()
   :outertype: SFRMMessageDVO

getIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean getIsHostnameVerified()
   :outertype: SFRMMessageDVO

getMessageBox
^^^^^^^^^^^^^

.. java:method:: public String getMessageBox()
   :outertype: SFRMMessageDVO

   :return: the message box of the Message DVO.

getMessageId
^^^^^^^^^^^^

.. java:method:: public String getMessageId()
   :outertype: SFRMMessageDVO

   :return: the message id of the Message DVO.

getPartnerCertContent
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerCertContent()
   :outertype: SFRMMessageDVO

getPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerEndpoint()
   :outertype: SFRMMessageDVO

   :return: the partnership endpoint of the Message DVO.

getPartnerX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getPartnerX509Certificate() throws SFRMException
   :outertype: SFRMMessageDVO

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: SFRMMessageDVO

   :return: the partnership id of the Message DVO.

getProceedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getProceedTimestamp()
   :outertype: SFRMMessageDVO

getSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public String getSignAlgorithm()
   :outertype: SFRMMessageDVO

getStatus
^^^^^^^^^

.. java:method:: public String getStatus()
   :outertype: SFRMMessageDVO

getStatusDescription
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getStatusDescription()
   :outertype: SFRMMessageDVO

getTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public int getTotalSegment()
   :outertype: SFRMMessageDVO

getTotalSize
^^^^^^^^^^^^

.. java:method:: public long getTotalSize()
   :outertype: SFRMMessageDVO

setCompletedTimestamp
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCompletedTimestamp(Timestamp completedTimestamp)
   :outertype: SFRMMessageDVO

setCreatedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCreatedTimestamp(Timestamp createdTimestamp)
   :outertype: SFRMMessageDVO

setEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setEncryptAlgorithm(String encryptAlgorithm)
   :outertype: SFRMMessageDVO

setFilename
^^^^^^^^^^^

.. java:method:: public void setFilename(String filename)
   :outertype: SFRMMessageDVO

setIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setIsHostnameVerified(boolean isVerified)
   :outertype: SFRMMessageDVO

setMessageBox
^^^^^^^^^^^^^

.. java:method:: public void setMessageBox(String messageBox)
   :outertype: SFRMMessageDVO

   :param messageBox: the message box of the Message DVO.

setMessageId
^^^^^^^^^^^^

.. java:method:: public void setMessageId(String messageId)
   :outertype: SFRMMessageDVO

   :param messageId: the message id of the Message DVO.

setPartnerCertContent
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerCertContent(String certContent)
   :outertype: SFRMMessageDVO

setPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerEndpoint(String partnerEndpoint)
   :outertype: SFRMMessageDVO

   :param partnerEndpoint: the partnership endpoint of the Message DVO.

setPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipId(String partnershipId)
   :outertype: SFRMMessageDVO

   :param partnershipId: the partnership id of the Message DVO.

setProceedTimestamp
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setProceedTimestamp(Timestamp proceedTimestamp)
   :outertype: SFRMMessageDVO

setSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public void setSignAlgorithm(String aignAlgorithm)
   :outertype: SFRMMessageDVO

setStatus
^^^^^^^^^

.. java:method:: public void setStatus(String status)
   :outertype: SFRMMessageDVO

setStatusDescription
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setStatusDescription(String statusDescription)
   :outertype: SFRMMessageDVO

setTotalSegment
^^^^^^^^^^^^^^^

.. java:method:: public void setTotalSegment(int totalSegment)
   :outertype: SFRMMessageDVO

setTotalSize
^^^^^^^^^^^^

.. java:method:: public void setTotalSize(long totalSize)
   :outertype: SFRMMessageDVO


.. java:import:: java.io FileNotFoundException

.. java:import:: java.sql Timestamp

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.io IOException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

SFRMPartnershipDVO
==================

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public interface SFRMPartnershipDVO extends DVO

   Creation Date: 27/9/2006

   :author: Twinsen

Fields
------
ALG_ENCRYPT_3DES
^^^^^^^^^^^^^^^^

.. java:field:: public static final String ALG_ENCRYPT_3DES
   :outertype: SFRMPartnershipDVO

ALG_ENCRYPT_RC2
^^^^^^^^^^^^^^^

.. java:field:: public static final String ALG_ENCRYPT_RC2
   :outertype: SFRMPartnershipDVO

ALG_SIGN_MD5
^^^^^^^^^^^^

.. java:field:: public static final String ALG_SIGN_MD5
   :outertype: SFRMPartnershipDVO

ALG_SIGN_SHA1
^^^^^^^^^^^^^

.. java:field:: public static final String ALG_SIGN_SHA1
   :outertype: SFRMPartnershipDVO

CONTEXT_PATH
^^^^^^^^^^^^

.. java:field:: public static final String CONTEXT_PATH
   :outertype: SFRMPartnershipDVO

   The context path for sfrm inbound.

PARTNERSHIPID_REGEXP
^^^^^^^^^^^^^^^^^^^^

.. java:field:: public static final String PARTNERSHIPID_REGEXP
   :outertype: SFRMPartnershipDVO

Methods
-------
getCreationTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCreationTimestamp()
   :outertype: SFRMPartnershipDVO

getDescription
^^^^^^^^^^^^^^

.. java:method:: public String getDescription()
   :outertype: SFRMPartnershipDVO

getEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptAlgorithm()
   :outertype: SFRMPartnershipDVO

getEncryptX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getEncryptX509Certificate() throws SFRMException
   :outertype: SFRMPartnershipDVO

getEncryptX509CertificateBase64
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptX509CertificateBase64() throws FileNotFoundException, IOException
   :outertype: SFRMPartnershipDVO

getModifiedTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getModifiedTimestamp()
   :outertype: SFRMPartnershipDVO

getOrgPartnerEndpoint
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getOrgPartnerEndpoint()
   :outertype: SFRMPartnershipDVO

getPartnerCertFingerprint
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerCertFingerprint()
   :outertype: SFRMPartnershipDVO

getPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerEndpoint()
   :outertype: SFRMPartnershipDVO

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: SFRMPartnershipDVO

getPartnershipSeq
^^^^^^^^^^^^^^^^^

.. java:method:: public int getPartnershipSeq()
   :outertype: SFRMPartnershipDVO

getRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public int getRetryInterval()
   :outertype: SFRMPartnershipDVO

getRetryMax
^^^^^^^^^^^

.. java:method:: public int getRetryMax()
   :outertype: SFRMPartnershipDVO

getSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public String getSignAlgorithm()
   :outertype: SFRMPartnershipDVO

getVerifyX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getVerifyX509Certificate() throws SFRMException
   :outertype: SFRMPartnershipDVO

isDisabled
^^^^^^^^^^

.. java:method:: public boolean isDisabled()
   :outertype: SFRMPartnershipDVO

isHostnameVerified
^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isHostnameVerified()
   :outertype: SFRMPartnershipDVO

setCreationTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCreationTimestamp(Timestamp creationTimestamp)
   :outertype: SFRMPartnershipDVO

setDescription
^^^^^^^^^^^^^^

.. java:method:: public void setDescription(String description)
   :outertype: SFRMPartnershipDVO

setEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setEncryptAlgorithm(String encryptAlgorithm)
   :outertype: SFRMPartnershipDVO

setIsDisabled
^^^^^^^^^^^^^

.. java:method:: public void setIsDisabled(boolean isDisabled)
   :outertype: SFRMPartnershipDVO

setIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setIsHostnameVerified(boolean isHostnameVerified)
   :outertype: SFRMPartnershipDVO

setModifiedTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setModifiedTimestamp(Timestamp modifiedTimestamp)
   :outertype: SFRMPartnershipDVO

setPartnerCertFingerprint
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerCertFingerprint(String partnerCertFingerprint)
   :outertype: SFRMPartnershipDVO

setPartnerEndPoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerEndPoint(String endpoint)
   :outertype: SFRMPartnershipDVO

setPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipId(String partnershipId)
   :outertype: SFRMPartnershipDVO

setPartnershipSeq
^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipSeq(int partnershipSeq)
   :outertype: SFRMPartnershipDVO

setRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public void setRetryInterval(int retryInterval)
   :outertype: SFRMPartnershipDVO

setRetryMax
^^^^^^^^^^^

.. java:method:: public void setRetryMax(int retryMax)
   :outertype: SFRMPartnershipDVO

setSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public void setSignAlgorithm(String signAlgorithm)
   :outertype: SFRMPartnershipDVO


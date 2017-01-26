.. java:import:: java.io File

.. java:import:: java.io FileNotFoundException

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io FileInputStream

.. java:import:: java.io BufferedInputStream

.. java:import:: java.io ByteArrayInputStream

.. java:import:: java.io InputStreamReader

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.security.cert CertificateFactory

.. java:import:: java.sql Timestamp

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProperties

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDVO

SFRMPartnershipDSDVO
====================

.. java:package:: hk.hku.cecid.edi.sfrm.dao.ds
   :noindex:

.. java:type:: public class SFRMPartnershipDSDVO extends DataSourceDVO implements SFRMPartnershipDVO

   The \ ``SFRMPartnershipDSDVO``\  is a data value object representing a tabular row in the \ *sfrm_partnership*\  in the persistence layer. Creation Date: 27/9/2006 It possesses caching automatically for most frequently fields shown below:

   ..

   #. partnership Id
   #. partnership endpoint
   #. maximum retry allowed
   #. retry interval
   #. X509 verfication / encryption cerfiticates

   So developers do not need to worry the issue of thread contention and can freely call the \ *get*\  and \ *set*\  with no performance impact. Version 1.0.1 -

   ..

   #. Added cache for hot access field, it requires extra \ *17*\  bytes + 1 soft reference per \ ``SFRMPartnershipDSDVO``\  object.

   :author: Twinsen Tsang

Constructors
------------
SFRMPartnershipDSDVO
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMPartnershipDSDVO()
   :outertype: SFRMPartnershipDSDVO

   Constructor.

Methods
-------
getCreationTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getCreationTimestamp()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY]

   :param get: the creation timestamp of this partnership record.

getDescription
^^^^^^^^^^^^^^

.. java:method:: public String getDescription()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Get the description of the partnership DVO.

getEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptAlgorithm()
   :outertype: SFRMPartnershipDSDVO

getEncryptX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getEncryptX509Certificate() throws SFRMException
   :outertype: SFRMPartnershipDSDVO

   Get X509 certificate from trusted certificate store specified in SFRM properties

   :throws SFRMException:
   :return: X509 certificate

getEncryptX509CertificateBase64
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getEncryptX509CertificateBase64() throws FileNotFoundException, IOException
   :outertype: SFRMPartnershipDSDVO

getModifiedTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Timestamp getModifiedTimestamp()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY]

   :return: Get the last modified timestamp

getOrgPartnerEndpoint
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getOrgPartnerEndpoint()
   :outertype: SFRMPartnershipDSDVO

   Get the sending endpoint of the partnership without appended the context path

getPartnerCertFingerprint
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerCertFingerprint()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Get the partnership endpoint of this partnership DVO.

getPartnerEndpoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnerEndpoint()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Get the sending endpoint of the partnership. The endpoint in the database stores only the address of receiver. For example, like \ **http://127.0.0.1:8080/**\  or \ **http://sfrm.partnership.com:8080/**\  But the endpoint returned here will concat a designated conext path = "corvus/httpd/sfrm/inbound".

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY, CACHABLE] Get the partnership from this partnership DVO.

getPartnershipSeq
^^^^^^^^^^^^^^^^^

.. java:method:: public int getPartnershipSeq()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Get the partnership sequence no from this partnership DVO.

getRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public int getRetryInterval()
   :outertype: SFRMPartnershipDSDVO

   [@GET, NON-THREAD-SAFETY] Get the retry interval of this partnership DVO.

getRetryMax
^^^^^^^^^^^

.. java:method:: public int getRetryMax()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Get the maximum retry allowed for this partnership DVO.

getSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public String getSignAlgorithm()
   :outertype: SFRMPartnershipDSDVO

getVerifyX509Certificate
^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public X509Certificate getVerifyX509Certificate() throws SFRMException
   :outertype: SFRMPartnershipDSDVO

   Get X509 certificate from trusted certificate store specified in SFRM properties

   :throws SFRMException:
   :return: X509 certificate

isDisabled
^^^^^^^^^^

.. java:method:: public boolean isDisabled()
   :outertype: SFRMPartnershipDSDVO

isHostnameVerified
^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean isHostnameVerified()
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] whether the partnership requires SSL hostname verified.

setCreationTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setCreationTimestamp(Timestamp creationTimestamp)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the creation timestamp.

   :param creationTimestamp: the new value of the creation time stamp for this partnership DVO.

setDescription
^^^^^^^^^^^^^^

.. java:method:: public void setDescription(String description)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the new description to this partnership DVO.

   :param description: The new description.

setEncryptAlgorithm
^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setEncryptAlgorithm(String encryptAlgorithm)
   :outertype: SFRMPartnershipDSDVO

setIsDisabled
^^^^^^^^^^^^^

.. java:method:: public void setIsDisabled(boolean isDisabled)
   :outertype: SFRMPartnershipDSDVO

setIsHostnameVerified
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setIsHostnameVerified(boolean isHostnameVerified)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] set whether the partnership requires SSL hostname verified.

setModifiedTimestamp
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setModifiedTimestamp(Timestamp modifiedTimestamp)
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Set the last modified timestamp

   :param modifiedTimestamp: the last modified timestamp.

setPartnerCertFingerprint
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerCertFingerprint(String partnerCertFingerprint)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the partnership endpoint of this partnership DVO.

setPartnerEndPoint
^^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnerEndPoint(String endpoint)
   :outertype: SFRMPartnershipDSDVO

   [@GET, THREAD-SAFETY] Set the partnership endpoint of the partnership DVO.

   :param endpoint: The new partnership endpoint.

setPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipId(String partnershipId)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the new partnership id to this partnership DVO.

   :param partnershipId: The new partnership Id.

setPartnershipSeq
^^^^^^^^^^^^^^^^^

.. java:method:: public void setPartnershipSeq(int partnershipSeq)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the partnership sequence

setRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public void setRetryInterval(int retryInterval)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the retry interval of this partnership DVO.

setRetryMax
^^^^^^^^^^^

.. java:method:: public void setRetryMax(int retryMax)
   :outertype: SFRMPartnershipDSDVO

   [@SET, THREAD-SAFETY] Set the maximum retry allowed for this partnership DVO.

setSignAlgorithm
^^^^^^^^^^^^^^^^

.. java:method:: public void setSignAlgorithm(String signAlgorithm)
   :outertype: SFRMPartnershipDSDVO


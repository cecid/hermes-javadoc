.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io FileOutputStream

.. java:import:: java.io File

.. java:import:: java.security.cert CertificateFactory

.. java:import:: java.util Hashtable

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.security.cert X509Certificate

.. java:import:: java.security MessageDigest

.. java:import:: java.io BufferedInputStream

.. java:import:: java.net URL

.. java:import:: java.util Enumeration

.. java:import:: hk.hku.cecid.piazza.commons.io IOHandler

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

.. java:import:: hk.hku.cecid.piazza.corvus.admin.listener AdminPageletAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.util PropertyTree

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMException

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProperties

.. java:import:: javax.servlet.http HttpServletRequest

.. java:import:: javax.xml.transform Source

.. java:import:: org.apache.commons.fileupload DiskFileUpload

.. java:import:: org.apache.commons.fileupload FileItem

.. java:import:: org.apache.commons.fileupload FileUpload

.. java:import:: org.apache.commons.fileupload FileUploadException

PartnershipPageletAdaptor
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.admin.listener
   :noindex:

.. java:type:: public class PartnershipPageletAdaptor extends AdminPageletAdaptor

   :author: Patrick Yip

Methods
-------
getCenterSource
^^^^^^^^^^^^^^^

.. java:method:: protected Source getCenterSource(HttpServletRequest request)
   :outertype: PartnershipPageletAdaptor

getHashtable
^^^^^^^^^^^^

.. java:method:: public Hashtable getHashtable(HttpServletRequest request) throws FileUploadException, IOException
   :outertype: PartnershipPageletAdaptor


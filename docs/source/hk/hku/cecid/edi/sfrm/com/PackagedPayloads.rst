.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.com PayloadException

PackagedPayloads
================

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public class PackagedPayloads extends NamedPayloads

   A packaged payloads represent a archive file typed payloads. Creation Date: 6/10/2006

   :author: Twinsen Tsang

Constructors
------------
PackagedPayloads
^^^^^^^^^^^^^^^^

.. java:constructor:: protected PackagedPayloads(String payloadsName, int initialState, PayloadsRepository owner) throws Exception
   :outertype: PackagedPayloads

   Protected Explicit Constructor. This constructor is mainly used for creating a new payload proxy including the physical file and the proxy object. \ **NOTE:**\  The physical file is not created until it is necessary.

   :param payloadsName: The name of the newly created payload.
   :param initialState: The initialState of the payloads, see \ :java:ref:`PayloadsState`\  for details.
   :param owner: The owner of the payloads.
   :throws Exception: Any kind of exceptions.

PackagedPayloads
^^^^^^^^^^^^^^^^

.. java:constructor:: protected PackagedPayloads(File payload, PayloadsRepository owner) throws IOException
   :outertype: PackagedPayloads

   Protected Explicit Constructor.

   :param payloads: The payloads directory.
   :param owner: The owner of this payload.
   :throws IOException: If the payload is not directory.

Methods
-------
decode
^^^^^^

.. java:method:: protected void decode()
   :outertype: PackagedPayloads

   Decode the payload root to become some useful information.

encode
^^^^^^

.. java:method:: protected void encode()
   :outertype: PackagedPayloads

getFilename
^^^^^^^^^^^

.. java:method:: public String getFilename()
   :outertype: PackagedPayloads

   Get the filename of the payload, if it is not packed in tar format

   :return: filename of the payload

getFoldersPayload
^^^^^^^^^^^^^^^^^

.. java:method:: public FoldersPayload getFoldersPayload(PayloadsRepository repo, int state, boolean isCreateFolder) throws IOException, PayloadException
   :outertype: PackagedPayloads

   To create a FoldersPayload object for this payload, create the folder in the file system when needed

   :param repo: owner repository of this folder payload
   :param state: state of the payload folder @see PayloadsState
   :param isCreateFolder: whether to create the specific folder in the file system
   :throws IOException: if isCreateFolder is true and cannot create folder successfully
   :throws PayloadException: if isCreateFolder is true and the folder already existing
   :return: FoldersPayload object

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: PackagedPayloads

   :return: the partnership id.

getRefMessageId
^^^^^^^^^^^^^^^

.. java:method:: public String getRefMessageId()
   :outertype: PackagedPayloads

   :return: the reference to message id.

isPacked
^^^^^^^^

.. java:method:: public boolean isPacked()
   :outertype: PackagedPayloads

   Get whether the payload is packed in tar format

   :return: true for packed, false otherwise

save
^^^^

.. java:method:: public void save(InputStream content, boolean append) throws IOException
   :outertype: PackagedPayloads

   Save the content from the input stream to this payloads. If the content stream is null, it save the file with empty content. This method is rarely used in this class because it's semantics here is to copy the bytes from the inputstream to the package payload.

   :param content: The input content stream.
   :param append: true if the new content is added to the existing content, false if the new content overwrite the existing.

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: PackagedPayloads

   toString method


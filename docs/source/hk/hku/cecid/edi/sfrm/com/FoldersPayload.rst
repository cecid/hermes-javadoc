.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io FileInputStream

.. java:import:: java.nio.channels FileChannel

.. java:import:: java.nio.channels ReadableByteChannel

.. java:import:: java.util Iterator

.. java:import:: java.util Collection

.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

FoldersPayload
==============

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public class FoldersPayload extends NamedPayloads

   A folders payload represent a folder hierarchical with the set of payloads. Creation Date: 5/10/2006

   :author: Twinsen Tsang

Constructors
------------
FoldersPayload
^^^^^^^^^^^^^^

.. java:constructor:: protected FoldersPayload(String payloadsName, int initialState, PayloadsRepository owner) throws IOException
   :outertype: FoldersPayload

   Protected Explicit Constructor. This constructor is mainly used for creating a new payload proxy including the physical file and the proxy object.

   :param payloadsName: The name of the newly created payload.
   :param initialState: The initialState of the payloads, see \ :java:ref:`PayloadsState`\  for details.
   :param owner: The owner of the payloads.
   :throws Exception: Any kind of exceptions.

FoldersPayload
^^^^^^^^^^^^^^

.. java:constructor:: protected FoldersPayload(File payloads, PayloadsRepository owner) throws IOException
   :outertype: FoldersPayload

   Protected Explicit Constructor.

   :param payloads: The payloads directory.
   :param owner: The owner of this payload.
   :throws IOException: If the payload is not directory.

Methods
-------
clearPayloadCache
^^^^^^^^^^^^^^^^^

.. java:method:: public void clearPayloadCache()
   :outertype: FoldersPayload

   Clear all the content and the folder for this payload.

decode
^^^^^^

.. java:method:: protected void decode() throws ArrayIndexOutOfBoundsException
   :outertype: FoldersPayload

   Decode the payload root to become some useful information. Only the partnershipId (the first token) is assigned.

   :throws ArrayIndexOutOfBoundsException: if the decoding fails due to the filename is in wrong format.

encode
^^^^^^

.. java:method:: protected void encode()
   :outertype: FoldersPayload

getMessageId
^^^^^^^^^^^^

.. java:method:: public String getMessageId()
   :outertype: FoldersPayload

   :return: the message of the payloads.

getNumOfFiles
^^^^^^^^^^^^^

.. java:method:: public int getNumOfFiles()
   :outertype: FoldersPayload

   :return: the number of files within the folders.

getPartnershipId
^^^^^^^^^^^^^^^^

.. java:method:: public String getPartnershipId()
   :outertype: FoldersPayload

   :return: the partnership id of the payloads.

getSize
^^^^^^^

.. java:method:: public long getSize()
   :outertype: FoldersPayload

   :return: the total size within the folders.

load
^^^^

.. java:method:: public InputStream load() throws IOException
   :outertype: FoldersPayload

   The outgoing payload does not support \ ``load``\  method.

loadChannel
^^^^^^^^^^^

.. java:method:: public ReadableByteChannel loadChannel() throws IOException
   :outertype: FoldersPayload

   The outgoing payload does not support \ ``loadChannel``\  method.

save
^^^^

.. java:method:: public void save(InputStream content, boolean append) throws IOException
   :outertype: FoldersPayload

   The outgoing payload does not support \ ``save``\  method.

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: FoldersPayload

   toString method


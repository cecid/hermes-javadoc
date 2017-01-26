.. java:import:: java.io File

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.io FileInputStream

.. java:import:: java.io FileOutputStream

.. java:import:: java.io BufferedInputStream

.. java:import:: java.io BufferedOutputStream

.. java:import:: java.io IOException

.. java:import:: java.nio.channels ReadableByteChannel

.. java:import:: java.util StringTokenizer

.. java:import:: java.util List

.. java:import:: java.util Vector

.. java:import:: hk.hku.cecid.edi.sfrm.util PathHelper

.. java:import:: hk.hku.cecid.piazza.commons.io NIOHandler

NamedPayloads
=============

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public abstract class NamedPayloads

   A Named payloads is a kind of payload (file attachment) that use it's filename to provide some informations for the system. It is a proxy design pattern that control the behavior of the actual files. In SFRM plugin, the default style of named payload is shown on the below:

   ..

   * Outgoing Payload Repository - <service>$<message_id>$timestamp>
   * Packaged Payload Repository - <service>$<message_id>
   * Incoming Payload Repository - <service>$<message_id>

   Creation Date: 6/10/2006.

   :author: Twinsen Tsang

Fields
------
decodeDelimiters
^^^^^^^^^^^^^^^^

.. java:field:: protected static final String decodeDelimiters
   :outertype: NamedPayloads

   The delimitier used for decoding.

filenameEndBracket
^^^^^^^^^^^^^^^^^^

.. java:field:: protected static final String filenameEndBracket
   :outertype: NamedPayloads

   The end bracket to enclose the filename of the single file, not packed payload

filenameStartBracket
^^^^^^^^^^^^^^^^^^^^

.. java:field:: protected static final String filenameStartBracket
   :outertype: NamedPayloads

   The start bracket to enclose the filename of the single file, not packed payload

processedPrefix
^^^^^^^^^^^^^^^

.. java:field:: protected static final String processedPrefix
   :outertype: NamedPayloads

   The prefix of uploading payload.

processingPrefix
^^^^^^^^^^^^^^^^

.. java:field:: protected static final String processingPrefix
   :outertype: NamedPayloads

   The prefix of processing payload.

uploadingPrefix
^^^^^^^^^^^^^^^

.. java:field:: protected static final String uploadingPrefix
   :outertype: NamedPayloads

   The prefix of uploading payload.

Constructors
------------
NamedPayloads
^^^^^^^^^^^^^

.. java:constructor:: public NamedPayloads(String payloadsName, int initialState, PayloadsRepository owner) throws IOException
   :outertype: NamedPayloads

   Explicit Constructor. This constructor is mainly used for creating a new payload proxy including the physical file and the proxy object. \ **NOTE:**\  The physical file is not created until it is necessary.

   :param payloadsName: The name of the newly created payload.
   :param initialState: The initialState of the payloads, see \ :java:ref:`PayloadsState`\  for details.
   :param owner: The owner of the payloads.
   :throws NullPointerException: if the \ ``owner``\  is null
   :throws IllegalArgumentException: if the \ ``payloadsName``\  is null or the \ ``initialState``\  is not invalid.

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.com.PayloadsRepostory`, :java:ref:`hk.hku.cecid.edi.sfrm.com.PayloadsState`

NamedPayloads
^^^^^^^^^^^^^

.. java:constructor:: public NamedPayloads(File payloads, PayloadsRepository owner)
   :outertype: NamedPayloads

   Explicit Constructor. The constructor is mainly used for creating the new payload proxy object only.

   :param payloads: The file payload object.
   :param owner: The owner of the payloads.

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.PayloadsRepostory`

Methods
-------
clearPayloadCache
^^^^^^^^^^^^^^^^^

.. java:method:: public void clearPayloadCache()
   :outertype: NamedPayloads

   Clear / Delete the payload cache to free some space.

clearTokens
^^^^^^^^^^^

.. java:method:: public void clearTokens()
   :outertype: NamedPayloads

   Clear the tokens to free some memory.

decode
^^^^^^

.. java:method:: protected abstract void decode() throws ArrayIndexOutOfBoundsException
   :outertype: NamedPayloads

   Decode the payload root to become some useful information.

   :throws ArrayIndexOutOfBoundsException: if the decoding fails due to the filename is in wrong format.

encode
^^^^^^

.. java:method:: protected abstract void encode()
   :outertype: NamedPayloads

   Encode the payload root back to a filename.

getContentType
^^^^^^^^^^^^^^

.. java:method:: public String getContentType()
   :outertype: NamedPayloads

   :return: the contentType

getExtension
^^^^^^^^^^^^

.. java:method:: public String getExtension()
   :outertype: NamedPayloads

   :return: the extension

getOriginalRootname
^^^^^^^^^^^^^^^^^^^

.. java:method:: public String getOriginalRootname()
   :outertype: NamedPayloads

   :return: the original file name of the payload root.

getOwner
^^^^^^^^

.. java:method:: public PayloadsRepository getOwner()
   :outertype: NamedPayloads

   :return: get the owner of this payload.

getRoot
^^^^^^^

.. java:method:: public File getRoot()
   :outertype: NamedPayloads

   :return: the directory of this payload set.

getSize
^^^^^^^

.. java:method:: public long getSize()
   :outertype: NamedPayloads

   :return: get the size of the payload, return 0 if the payload does not exist.

getStateForm
^^^^^^^^^^^^

.. java:method:: public static String getStateForm(int state)
   :outertype: NamedPayloads

   Get the state form string according to the specified state.

   :param state: The state you want to retrieve.
   :throws IllegalArgumentException: if the state is invalid. For all state see PayloadsState.

getTokens
^^^^^^^^^

.. java:method:: protected List getTokens()
   :outertype: NamedPayloads

   :return: a list of token under the decode delimiters.

isProcessed
^^^^^^^^^^^

.. java:method:: public boolean isProcessed()
   :outertype: NamedPayloads

   :return: true if the payload's name is starting with processed prefix.

isProcessing
^^^^^^^^^^^^

.. java:method:: public boolean isProcessing()
   :outertype: NamedPayloads

   :return: true if the payload's name is startting with processing prefix.

isUploading
^^^^^^^^^^^

.. java:method:: public boolean isUploading()
   :outertype: NamedPayloads

   :return: true if the payload's name is startting with processing prefix.

load
^^^^

.. java:method:: public InputStream load() throws IOException
   :outertype: NamedPayloads

   Load the payload content from the input stream. NOTE: This method returns a new instance of input stream.

   :throws IOException: Throws if the payload file does not exist.
   :return: the content input stream.

loadChannel
^^^^^^^^^^^

.. java:method:: public ReadableByteChannel loadChannel() throws IOException
   :outertype: NamedPayloads

   Load the payload content from the input stream channel.

   :throws IOException: Throws if the payload file does not exist.
   :return: the content input channel.

moveRoot
^^^^^^^^

.. java:method:: public boolean moveRoot(String newPath, boolean force)
   :outertype: NamedPayloads

   Move the root to the specified path.

   :param newPath: The absolute new path
   :param force: force to move the file to specified path if there is a file with same name already exist in that path.
   :return: true if the moving operation successfully.

moveToRepository
^^^^^^^^^^^^^^^^

.. java:method:: public boolean moveToRepository(PayloadsRepository newOwner)
   :outertype: NamedPayloads

   Move the root to another payloads repository. The owner of this payloads will changes to \ ``newOwner``\  after invocation of this method.

   :param newOwner: The new owner of the payload repository.
   :return: true if the moving operation successfully, false if the \ ``newOwner``\  is null or moving operation fail.

moveToRepositoryForce
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public boolean moveToRepositoryForce(PayloadsRepository newOwner)
   :outertype: NamedPayloads

   Move the root to another payloads repository force. The owner of this payloads will changes to \ ``newOwner``\  after invocation of this method.

   :param newOwner: The new owner of the payload repository.
   :return: true if the moving operation successfully, false if the \ ``newOwner``\  is null or moving operation fail.

renameRoot
^^^^^^^^^^

.. java:method:: public boolean renameRoot(String newName) throws IOException
   :outertype: NamedPayloads

   Rename the root to the specified name. (The file path has not been changed after each invocation.

   :param newName: The name of the root.
   :throws IOException: if any kinds of I/O Exception.
   :return: true if the operation run successfully.

save
^^^^

.. java:method:: public void save(InputStream content, boolean append) throws IOException
   :outertype: NamedPayloads

   Save the content from the input stream to this payloads. If the content stream is null, it save the file with empty content.

   :param content: The input content stream.
   :param append: true if the new content is added to the existing content, false if the new content overwrite the existing.

setToPending
^^^^^^^^^^^^

.. java:method:: public boolean setToPending() throws IOException
   :outertype: NamedPayloads

   Set the status of payload to pending.

   :return: true if the operation run sucessfully.

setToProcessed
^^^^^^^^^^^^^^

.. java:method:: public boolean setToProcessed() throws IOException
   :outertype: NamedPayloads

   Set the status of payload to processed.

   :return: true if the operation run sucessfully.

setToProcessing
^^^^^^^^^^^^^^^

.. java:method:: public boolean setToProcessing() throws IOException
   :outertype: NamedPayloads

   Set the status of payload to processing.

   :return: true if the operation run sucessfully.

setToUploading
^^^^^^^^^^^^^^

.. java:method:: public boolean setToUploading() throws IOException
   :outertype: NamedPayloads

   Set the status of payload to uploading.

   :return: true if the operation run sucessfully.

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: NamedPayloads

   toString method


.. java:import:: hk.hku.cecid.edi.sfrm.util PathHelper

.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

.. java:import:: java.io BufferedInputStream

.. java:import:: java.io File

.. java:import:: java.io FileInputStream

.. java:import:: java.io FileOutputStream

.. java:import:: java.io IOException

.. java:import:: java.io RandomAccessFile

.. java:import:: java.nio.channels Channels

.. java:import:: java.nio.channels FileChannel

.. java:import:: java.nio.channels WritableByteChannel

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: java.util ArrayList

.. java:import:: org.apache.tools.tar TarOutputStream

.. java:import:: org.apache.tools.tar TarEntry

.. java:import:: org.apache.tools.tar TarInputStream

ArchiverTar
===========

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class ArchiverTar extends ArchiverNULL

   :author: Patrick Yip

Fields
------
TAR_ENTRY_SIZE
^^^^^^^^^^^^^^

.. java:field:: public static int TAR_ENTRY_SIZE
   :outertype: ArchiverTar

Methods
-------
compress
^^^^^^^^

.. java:method:: public boolean compress(List<File> src, File dest, boolean includeItself) throws IOException
   :outertype: ArchiverTar

compress
^^^^^^^^

.. java:method:: public boolean compress(File src, File dest, boolean includeItself) throws IOException
   :outertype: ArchiverTar

   Compress the \ ``src``\  to \ ``dest``\  in the archive form. If the \ ``src``\  is a file, then the resulting archive contains only that file. If the \ ``src``\  is a directory, then the resulting archive contains all files (recursively) in the
   src. The \ ``src``\  file sets will be archived to TAR format which is comes from Apache Ant Tools Tar. For more details, read \ `Apache Ant Tool Tar <http://www.jajakarta.org/ant/ant-1.6.1/docs/mix/manual/api/>`_\

   :param src: The source of the file(s) to be archive.
   :param dest: The destination of the arhived file.
   :param includeItself: the source directory includes in the archive if it is true, vice versa.
   :throws IOException: if any kind of I/O Erros
   :return: true if the operations run successfully.

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.archive.Archiver.compress(File,File,boolean)`

compress
^^^^^^^^

.. java:method:: public boolean compress(FileSystem src, File dest) throws IOException
   :outertype: ArchiverTar

extract
^^^^^^^

.. java:method:: public boolean extract(File archive, File dest) throws IOException
   :outertype: ArchiverTar

   Extract the \ ``archive``\  to the \ ``dest``\  directory.

   :param archive: The archive to be extract.
   :param dest: The destination directory extract to.
   :throws IOException: Any kind of I/O Errors.
   :throws IllegalArgumentException: If the \ ``dest``\  is not a directory.
   :return: true if the operations run successfully.

extract
^^^^^^^

.. java:method:: public boolean extract(File archive, FileSystem dest) throws IOException
   :outertype: ArchiverTar

   Extract the \ ``archive``\  to the \ ``dest``\  directory.

   :param archive: The archive to be extract.
   :param dest: The destination directory extract to.
   :throws IOException: Any kind of I/O Errors.
   :return: true if the operations run successfully.

guessCompressedSize
^^^^^^^^^^^^^^^^^^^

.. java:method:: public long guessCompressedSize(File src) throws IOException
   :outertype: ArchiverTar

   Guess how big is the compressed file without compressing actually. The algorithm of guessing the tar size as follow: For each of file Each header size is TAR_ENTRY_SIZE bytes, and for the data content block. It use TAR_ENTRY_SIZE as a block of data. If for last block of data is not TAR_ENTRY_SIZE, then the rest will padding with the empty bytes. Such that the final guessed size is ceil((file_length/TAR_ENTRY_SIZE)+1)*TAR_ENTRY_SIZE. More details of tar file format can found from \ `this <http://en.wikipedia.org/wiki/Tarball>`_\ .

   :param src: The source of the file(s) to be archive.
   :throws NullPointerException: if the \ ``src``\  is null.
   :throws IOException: if one of the file in the folders does not exist in some reason.
   :return: guessed file size in byte

guessCompressedSize
^^^^^^^^^^^^^^^^^^^

.. java:method:: public long guessCompressedSize(FileSystem src) throws IOException
   :outertype: ArchiverTar

isSupportArchive
^^^^^^^^^^^^^^^^

.. java:method:: public boolean isSupportArchive(File archive)
   :outertype: ArchiverTar

listAsFile
^^^^^^^^^^

.. java:method:: public List listAsFile(File archive) throws IOException
   :outertype: ArchiverTar

   List the files inside the \ ``archive``\ . This operation is quite slow and pending to optimize.

   :param archive: The archive to be listed.
   :return: A list of java.io.File object that represents each entry in the archive.

listAsFilename
^^^^^^^^^^^^^^

.. java:method:: public List listAsFilename(File archive) throws IOException
   :outertype: ArchiverTar

   List the files inside the \ ``archive``\ .

   :param archive: The archive to be listed.
   :return: A list of String objects that represents the filename of each entry in the archive.


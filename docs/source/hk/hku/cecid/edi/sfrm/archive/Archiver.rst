.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.util List

Archiver
========

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public interface Archiver

   An Archiver is the interface that provide the basic archive operations like:

   ..

   * Compress operations
   * Extract operations
   * List operations
   *
   *

   Creation Date: 13/11/2006

   :author: Twinsen Tsang

Methods
-------
compress
^^^^^^^^

.. java:method:: public boolean compress(File src, File dest, boolean includeItself) throws IOException
   :outertype: Archiver

   Compress the \ ``src``\  to \ ``dest``\  in the archive form. If the \ ``src``\  is a file, then the resulting archive contains only that file. If the \ ``src``\  is a directory, then the resulting archive contains all files (recursively) in the
   src. If the flag \ ``includeItself``\  is true , then the \ ``src``\  will also include in the archive as the root.

   :param src: The source of the file(s) to be archive.
   :param dest: The destination of the arhived file.
   :param includeItself: the source directory includes in the archive if it is true, vice versa.
   :throws IOException: if any kind of I/O Erros
   :return: true if the operations run successfully.

compress
^^^^^^^^

.. java:method:: public boolean compress(FileSystem src, File dest) throws IOException
   :outertype: Archiver

   Compress the \ ``src``\  to \ ``dest``\  in the archive form.

   :param src: The source of the file(s) to be archive.
   :param dest: The destination of the arhived file.
   :param includeItself: the source directory includes in the archive if it is true, vice versa.
   :throws IOException: if any kind of I/O Errors.
   :return: true if the operations run successfully.

extract
^^^^^^^

.. java:method:: public boolean extract(File archive, File dest) throws IOException
   :outertype: Archiver

   Extract the \ ``archive``\  to the \ ``dest``\  directory.

   :param archive: The archive to be extract.
   :param dest: The destination directory extract to.
   :throws IOException: Any kind of I/O Errors.
   :throws IllegalArgumentException: If the \ ``dest``\  is not a directory.
   :return: true if the operations run successfully.

extract
^^^^^^^

.. java:method:: public boolean extract(File archive, FileSystem dest) throws IOException
   :outertype: Archiver

   Extract the \ ``archive``\  to the \ ``dest``\  directory.

   :param archive: The archive to be extract.
   :param dest: The destination directory extract to.
   :throws IOException: Any kind of I/O Errors.
   :return: true if the operations run successfully.

guessCompressedSize
^^^^^^^^^^^^^^^^^^^

.. java:method:: public long guessCompressedSize(File src) throws IOException
   :outertype: Archiver

   Guess how big is the compressed file without compressing actually.

   :param src: The source of the file(s) to be archive.
   :throws NullPointerException: if the \ ``src``\  is null.
   :throws IOException: if one of the file in the folders does not exist in some reason.

guessCompressedSize
^^^^^^^^^^^^^^^^^^^

.. java:method:: public long guessCompressedSize(FileSystem src) throws IOException
   :outertype: Archiver

   Guess how big is the compressed file without compressing actually.

   :param src: The source of the file(s) to be archive.
   :throws NullPointerException: if the \ ``src``\  is null.
   :throws IOException: if one of the file in the folders does not exist in some reason.

isSupportArchive
^^^^^^^^^^^^^^^^

.. java:method:: public boolean isSupportArchive(File archive)
   :outertype: Archiver

   Check whether the \ ``archive``\  is supported by this type of archiver. The execution time of this method solely depends on how the archiver structure look like. For example, ArchiverZIP return immediately because it checks only with the extension of the archive file, without the actual content.

   :param archive: The archive to be tested.
   :return: true if the archiver support this \ ``archive``\ .

listAsFile
^^^^^^^^^^

.. java:method:: public List listAsFile(File archive) throws IOException
   :outertype: Archiver

   List the files inside the \ ``archive``\ .

   :param archive: The archive to be listed.
   :throws IOException: if any kind of I/O Errors.
   :return: A list of java.io.File object that represents each entry in the archive.

listAsFilename
^^^^^^^^^^^^^^

.. java:method:: public List listAsFilename(File archive) throws IOException
   :outertype: Archiver

   List the files inside the \ ``archive``\ .

   :param archive: The archive to be listed.
   :throws IOException: Any kind of I/O Errors.
   :return: A list of String objects that represents the filename of each entry in the archive.


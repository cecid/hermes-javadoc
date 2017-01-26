.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.util ArrayList

.. java:import:: java.util Collection

.. java:import:: java.util List

.. java:import:: java.util Iterator

ArchiverNULL
============

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public abstract class ArchiverNULL implements Archiver

   An \ **ArchiverNULL**\  is a null packaging device that provides some useful method for the sub-class which enhance code design and ease to read.

   ..

   * Pre-error Handling of compress,list and extract

   Creation Date: 13/11/2006

   :author: Twinsen Tsang

Methods
-------
compress
^^^^^^^^

.. java:method:: public boolean compress(File src, File dest, boolean includeItself) throws IOException
   :outertype: ArchiverNULL

   The NULL archiver validates all fields in the parameters and return false in the end.

   :param src: The source of the file(s) to be archive.
   :param dest: The destination of the arhived file.
   :param includeItself: the source directory includes in the archive if it is true, vice versa.
   :throws IOException: if any kind of I/O Erros
   :return: true if the operations run successfully.

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.archive.Archiver.compress(File,File,boolean)`

extract
^^^^^^^

.. java:method:: public boolean extract(File archive, File dest) throws IOException
   :outertype: ArchiverNULL

   The NULL archiver validates all fields in the parameters and return false in the end. If the destination directory does not exist, the NULL archiver will create one for you.

   :param archive: The archive to be extract.
   :param dest: The destination directory extract to.
   :throws IOException: Any kind of I/O Errors.
   :throws IllegalArgumentException: If the \ ``dest``\  is not a directory.
   :return: true if the operations run successfully.

getBaseArchivingDirectory
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: protected String getBaseArchivingDirectory(File src, boolean includeItself)
   :outertype: ArchiverNULL

   Get the base directory for archiving. The base directory is the path that all archive entry relative to it. \ **NOTE**\ : This method should only be used inside the \ ``compress``\  method.

   :return: the base directory.

listAllToArchive
^^^^^^^^^^^^^^^^

.. java:method:: protected Iterator listAllToArchive(File src)
   :outertype: ArchiverNULL

listAsFile
^^^^^^^^^^

.. java:method:: public List listAsFile(File archive) throws IOException
   :outertype: ArchiverNULL

   List the files inside the \ ``archive``\ .

   :param archive: The archive to be listed.
   :throws IOException: if any kind of I/O Errors.
   :return: A list of java.io.File object that represents each entry in the archive.

listAsFilename
^^^^^^^^^^^^^^

.. java:method:: public List listAsFilename(File archive) throws IOException
   :outertype: ArchiverNULL

   List the files inside the \ ``archive``\ .

   :param archive: The archive to be listed.
   :throws IOException: Any kind of I/O Errors.
   :return: A list of String objects that represents the filename of each entry in the archive.

listFilesToArchive
^^^^^^^^^^^^^^^^^^

.. java:method:: protected Iterator listFilesToArchive(File src)
   :outertype: ArchiverNULL

   List out all files that need to be archive in a \ :java:ref:`compress(File,File,boolean)`\  call. \ **NOTE**\ : This method should only be used inside the \ ``compress``\  method.

   :param src: The source of the file(s) to be archive.
   :return: An iterator whichs contains a list of files object to archive.


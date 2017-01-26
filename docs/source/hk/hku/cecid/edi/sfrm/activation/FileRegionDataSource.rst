.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io FileInputStream

.. java:import:: java.io OutputStream

.. java:import:: java.nio ByteBuffer

.. java:import:: java.nio.channels FileChannel

.. java:import:: javax.activation FileDataSource

.. java:import:: hk.hku.cecid.edi.sfrm.io ByteBufferInputStream

FileRegionDataSource
====================

.. java:package:: hk.hku.cecid.edi.sfrm.activation
   :noindex:

.. java:type:: public class FileRegionDataSource extends FileDataSource

   ByteBufferDataSource is an implementation of the javax.activation.DataSource that represents a data source of a region in the file. Creation Date: 2/11/2006

   :author: Twinsen Tsang

Constructors
------------
FileRegionDataSource
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public FileRegionDataSource(File file, long position, long size)
   :outertype: FileRegionDataSource

   Explicit Constructor.

   :param file: The file associated to this datasource.
   :param position: The start position of the region.
   :param size: The size of the region.

FileRegionDataSource
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public FileRegionDataSource(String filepath, long position, long size)
   :outertype: FileRegionDataSource

   Explicit Constructor.

   :param filepath: The file path associated to this datasource.
   :param position: The start position of the region.
   :param size: The size of the region

Methods
-------
finalize
^^^^^^^^

.. java:method:: protected void finalize()
   :outertype: FileRegionDataSource

getByteBuffer
^^^^^^^^^^^^^

.. java:method:: public ByteBuffer getByteBuffer() throws IOException
   :outertype: FileRegionDataSource

   This method will return an ByteBuffer representing the the data region and will throw an IOException if it can not do so or OutOfMemory error. For OutOfMemory error in direct memory usage, it's still an issue in Java. http://bugs.sun.com/view_bug.do?bug_id=5025281 Properly reuse of the memory and set runtime parameter may solve the problem.

   **See also:** :java:ref:`java.nio.channels.FileChannel`

getInputStream
^^^^^^^^^^^^^^

.. java:method:: public InputStream getInputStream() throws IOException
   :outertype: FileRegionDataSource

   This method will return an InputStream representing the the data and will throw an IOException if it can not do so. This method will return a new instance of ByteBufferInputStream with the direct byte buffer inside for each invocation.

   **See also:** :java:ref:`java.nio.channels.FileChannel`, :java:ref:`hk.hku.cecid.edi.sfrm.io.ByteBufferInputStream`

getOutputStream
^^^^^^^^^^^^^^^

.. java:method:: public OutputStream getOutputStream() throws IOException
   :outertype: FileRegionDataSource

   This method always throw IO exception.

   :throws IOException: as output stream is not supported by this data source.

   **See also:** :java:ref:`javax.activation.DataSource.getOutputStream()`


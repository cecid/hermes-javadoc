.. java:import:: java.io IOException

.. java:import:: java.io OutputStream

.. java:import:: org.apache.tools.tar TarConstants

.. java:import:: org.apache.tools.tar TarEntry

.. java:import:: org.apache.tools.tar TarOutputStream

SFRMTarOutputStream
===================

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class SFRMTarOutputStream extends TarOutputStream

   :author: Patrick Yip

Constructors
------------
SFRMTarOutputStream
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarOutputStream(OutputStream os)
   :outertype: SFRMTarOutputStream

SFRMTarOutputStream
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarOutputStream(OutputStream os, int blockSize)
   :outertype: SFRMTarOutputStream

SFRMTarOutputStream
^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarOutputStream(OutputStream os, int blockSize, int recordSize)
   :outertype: SFRMTarOutputStream

Methods
-------
putNextEntry
^^^^^^^^^^^^

.. java:method:: public void putNextEntry(TarEntry entry) throws IOException
   :outertype: SFRMTarOutputStream

   Put an entry on the output stream. This writes the entry's header record and positions the output stream for writing the contents of the entry. Once this method is called, the stream is ready for calls to write() to write the entry's contents. Once the contents are written, closeEntry() \ **MUST**\  be called to ensure that all buffered data is completely written to the output stream.

   :param entry: The TarEntry to be written to the archive.
   :throws IOException: on error


.. java:import:: java.io File

.. java:import:: org.apache.tools.tar TarEntry

.. java:import:: org.apache.tools.tar TarUtils

.. java:import:: java.lang.reflect Field

SFRMTarEntry
============

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class SFRMTarEntry extends TarEntry

   :author: Patrick

Constructors
------------
SFRMTarEntry
^^^^^^^^^^^^

.. java:constructor:: public SFRMTarEntry(String name)
   :outertype: SFRMTarEntry

   Construct an entry with only a name. This allows the programmer to construct the entry's header "by hand". File is set to null.

   :param name: the entry name

SFRMTarEntry
^^^^^^^^^^^^

.. java:constructor:: public SFRMTarEntry(String name, byte linkFlag)
   :outertype: SFRMTarEntry

   Construct an entry with a name an a link flag.

   :param name: the entry name
   :param linkFlag: the entry link flag.

SFRMTarEntry
^^^^^^^^^^^^

.. java:constructor:: public SFRMTarEntry(File file)
   :outertype: SFRMTarEntry

   Construct an entry for a file. File is set to file, and the header is constructed from information from the file.

   :param file: The file that the entry represents.

SFRMTarEntry
^^^^^^^^^^^^

.. java:constructor:: public SFRMTarEntry(byte[] headerBuf)
   :outertype: SFRMTarEntry

   Construct an entry from an archive's header bytes. File is set to null.

   :param headerBuf: The header bytes from a tar archive entry.

Methods
-------
parseTarHeader
^^^^^^^^^^^^^^

.. java:method:: public void parseTarHeader(byte[] header)
   :outertype: SFRMTarEntry

   Parse an entry's header information from a header buffer.

   :param header: The tar entry header buffer to get information from.

writeEntryHeader
^^^^^^^^^^^^^^^^

.. java:method:: public void writeEntryHeader(byte[] outbuf)
   :outertype: SFRMTarEntry

   Write an entry's header information to a header buffer.

   :param outbuf: The tar entry header buffer to fill in.


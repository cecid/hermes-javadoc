.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: org.apache.tools.tar TarEntry

.. java:import:: org.apache.tools.tar TarInputStream

SFRMTarInputStream
==================

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class SFRMTarInputStream extends TarInputStream

   :author: Patrick Yip

Constructors
------------
SFRMTarInputStream
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarInputStream(InputStream arg0)
   :outertype: SFRMTarInputStream

SFRMTarInputStream
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarInputStream(InputStream is, int blockSize)
   :outertype: SFRMTarInputStream

SFRMTarInputStream
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMTarInputStream(InputStream is, int blockSize, int recordSize)
   :outertype: SFRMTarInputStream

Methods
-------
getNextEntry
^^^^^^^^^^^^

.. java:method:: public TarEntry getNextEntry() throws IOException
   :outertype: SFRMTarInputStream

   Get the next entry in this tar archive. This will skip over any remaining data in the current entry, if there is one, and place the input stream at the header of the next entry, and read the header and instantiate a new TarEntry from the header bytes and return that entry. If there are no more entries in the archive, null will be returned to indicate that the end of the archive has been reached.

   :throws IOException: on error
   :return: The next TarEntry in the archive, or null.


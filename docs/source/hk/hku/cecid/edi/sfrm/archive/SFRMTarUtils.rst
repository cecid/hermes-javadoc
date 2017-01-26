.. java:import:: java.io UnsupportedEncodingException

.. java:import:: org.apache.tools.tar TarUtils

SFRMTarUtils
============

.. java:package:: hk.hku.cecid.edi.sfrm.archive
   :noindex:

.. java:type:: public class SFRMTarUtils

   :author: Patrick Yip

Fields
------
NAME_ENCODING
^^^^^^^^^^^^^

.. java:field:: public static final String NAME_ENCODING
   :outertype: SFRMTarUtils

Methods
-------
getNameBytes
^^^^^^^^^^^^

.. java:method:: public static int getNameBytes(StringBuffer name, byte[] buf, int offset, int length)
   :outertype: SFRMTarUtils

   Determine the number of bytes in an entry name.

   :param name: The header name from which to parse.
   :param buf: The buffer from which to parse.
   :param offset: The offset into the buffer from which to parse.
   :param length: The number of header bytes to parse.
   :return: The number of bytes in a header's entry name.

parseName
^^^^^^^^^

.. java:method:: public static String parseName(byte[] header, int offset, int length)
   :outertype: SFRMTarUtils

   Parse an entry name from a header buffer.

   :param header: The header buffer from which to parse.
   :param offset: The offset into the buffer from which to parse.
   :param length: The number of header bytes to parse.
   :return: The header's entry name.


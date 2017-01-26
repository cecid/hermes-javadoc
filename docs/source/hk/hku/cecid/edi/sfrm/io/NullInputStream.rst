.. java:import:: java.io IOException

.. java:import:: java.io InputStream

NullInputStream
===============

.. java:package:: hk.hku.cecid.edi.sfrm.io
   :noindex:

.. java:type:: public class NullInputStream extends InputStream

   A NullInputStream discards any bytes and always return negative one for \ ``read``\  operations. Creation Date: 7/11/2006

   :author: Twinsen

Methods
-------
available
^^^^^^^^^

.. java:method:: public int available() throws IOException
   :outertype: NullInputStream

   It returns -1.

markSupported
^^^^^^^^^^^^^

.. java:method:: public boolean markSupported()
   :outertype: NullInputStream

   It returns false.

read
^^^^

.. java:method:: public int read(byte[] b, int off, int len) throws IOException
   :outertype: NullInputStream

   It returns -1.

read
^^^^

.. java:method:: public int read(byte[] b) throws IOException
   :outertype: NullInputStream

   It returns -1.

read
^^^^

.. java:method:: public int read() throws IOException
   :outertype: NullInputStream

   It returns -1.

reset
^^^^^

.. java:method:: public synchronized void reset() throws IOException
   :outertype: NullInputStream

   DUMMY Methods.

skip
^^^^

.. java:method:: public long skip(long n) throws IOException
   :outertype: NullInputStream

   DUMMY Methods. It returns 0.


.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.nio ByteBuffer

.. java:import:: java.nio.channels ReadableByteChannel

.. java:import:: java.nio.channels.spi AbstractInterruptibleChannel

ByteBufferInputStream
=====================

.. java:package:: hk.hku.cecid.edi.sfrm.io
   :noindex:

.. java:type:: public class ByteBufferInputStream extends InputStream

   A ByteBufferInputStream contains an internal buffer that contains direct or non-direct byte buffer that may be read from the stream. Creation Date: 24/10/2006

   :author: Twinsen Tsang

Fields
------
buf
^^^

.. java:field:: protected ByteBuffer buf
   :outertype: ByteBufferInputStream

   The internal byte buffer.

Constructors
------------
ByteBufferInputStream
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public ByteBufferInputStream(ByteBuffer buffer)
   :outertype: ByteBufferInputStream

   Creates a \ ``ByteBufferInputStream``\  so that it uses \ ``buf``\  as its byte buffer. The buffer array is not copied.

   :param buf: the input buffer.

Methods
-------
available
^^^^^^^^^

.. java:method:: public int available() throws IOException
   :outertype: ByteBufferInputStream

   Returns the number of bytes that can be read from this input stream without blocking. The value returned is limit of byte buffer. which is the number of bytes remaining to be read from the input buffer.

   :return: the number of bytes that can be read from the input stream without blocking.

close
^^^^^

.. java:method:: public void close() throws IOException
   :outertype: ByteBufferInputStream

   Close the stream.

getChannel
^^^^^^^^^^

.. java:method:: public ReadableByteChannel getChannel()
   :outertype: ByteBufferInputStream

   Returns the readable byte channel object associated with this byte buffer input stream.

   :return: a readable byte channel for this byte buffer.

   **See also:** :java:ref:`java.nio.channels.Channels`

mark
^^^^

.. java:method:: public synchronized void mark(int readlimit)
   :outertype: ByteBufferInputStream

   Mark this stream.

markSupported
^^^^^^^^^^^^^

.. java:method:: public boolean markSupported()
   :outertype: ByteBufferInputStream

   Mark is support by this InputStream.

   :return: always true

read
^^^^

.. java:method:: public int read() throws IOException
   :outertype: ByteBufferInputStream

   Reads the next byte of data from this input stream. The value byte is returned as an int in the range 0 to 255. If no byte is available because the end of the stream has been reached, the value -1 is returned.

read
^^^^

.. java:method:: public int read(byte[] b) throws IOException
   :outertype: ByteBufferInputStream

read
^^^^

.. java:method:: public int read(byte[] b, int off, int len) throws IOException
   :outertype: ByteBufferInputStream

reset
^^^^^

.. java:method:: public synchronized void reset() throws IOException
   :outertype: ByteBufferInputStream

   Resets the buffer to the marked position. The marked position is 0 unless another position was marked or an offset was specified in the constructor.

skip
^^^^

.. java:method:: public long skip(long n) throws IOException
   :outertype: ByteBufferInputStream


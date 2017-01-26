.. java:import:: java.awt.datatransfer DataFlavor

.. java:import:: java.awt.datatransfer UnsupportedFlavorException

.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: java.nio.channels Channels

.. java:import:: java.nio.channels WritableByteChannel

.. java:import:: javax.activation ActivationDataFlavor

.. java:import:: javax.activation DataContentHandler

.. java:import:: javax.activation DataSource

SFRMDataContentHandler
======================

.. java:package:: hk.hku.cecid.edi.sfrm.activation
   :noindex:

.. java:type:: public class SFRMDataContentHandler implements DataContentHandler

Methods
-------
getContent
^^^^^^^^^^

.. java:method:: public Object getContent(DataSource ds) throws IOException
   :outertype: SFRMDataContentHandler

getTransferData
^^^^^^^^^^^^^^^

.. java:method:: public Object getTransferData(DataFlavor df, DataSource ds) throws UnsupportedFlavorException, IOException
   :outertype: SFRMDataContentHandler

getTransferDataFlavors
^^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public DataFlavor[] getTransferDataFlavors()
   :outertype: SFRMDataContentHandler

writeTo
^^^^^^^

.. java:method:: public void writeTo(Object obj, String mime, OutputStream os) throws IOException
   :outertype: SFRMDataContentHandler


.. java:import:: java.io IOException

.. java:import:: java.io InputStream

.. java:import:: java.io OutputStream

.. java:import:: javax.activation DataSource

.. java:import:: hk.hku.cecid.edi.sfrm.io NullInputStream

.. java:import:: hk.hku.cecid.edi.sfrm.io NullOutputStream

EmptyDataSource
===============

.. java:package:: hk.hku.cecid.edi.sfrm.activation
   :noindex:

.. java:type:: public class EmptyDataSource implements DataSource

   NullDataSource is an implementation of the javax.activation.DataSource that represents a empty, but not null. datasource Creation Date: 7/11/2006

   :author: Twinsen Tsang

Constructors
------------
EmptyDataSource
^^^^^^^^^^^^^^^

.. java:constructor:: public EmptyDataSource()
   :outertype: EmptyDataSource

   Default Constructor. The name is set to empty and the content type is set to \ ``application/octect-stream``\ .

EmptyDataSource
^^^^^^^^^^^^^^^

.. java:constructor:: public EmptyDataSource(String name, String contentType)
   :outertype: EmptyDataSource

   Explicit Constructor.

   :param name: The name of the datasource.
   :param contentType: The content type of the datasource.

Methods
-------
getContentType
^^^^^^^^^^^^^^

.. java:method:: public String getContentType()
   :outertype: EmptyDataSource

   Get the name of content type.

getInputStream
^^^^^^^^^^^^^^

.. java:method:: public InputStream getInputStream() throws IOException
   :outertype: EmptyDataSource

   This method will return an InputStream representing the the data and will throw an IOException if it can not do so. This method will return a new instance of NullInputStream with each invocation

   **See also:** :java:ref:`hk.hku.cecid.edi.sfrm.io.NullInputStream`

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: EmptyDataSource

   Get the name of the datasource.

getOutputStream
^^^^^^^^^^^^^^^

.. java:method:: public OutputStream getOutputStream() throws IOException
   :outertype: EmptyDataSource

   This method always throw IO exception.

   :throws IOException: as output stream is not supported by this data source.

   **See also:** :java:ref:`javax.activation.DataSource.getOutputStream()`


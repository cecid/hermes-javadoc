.. java:import:: java.io File

.. java:import:: java.io IOException

PathHelper
==========

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class PathHelper

   It provides some useful method for handling the file path issue. version 1.0.1 - Added \ :java:ref:`getRelativePath(String,String)`\ .

   :author: Twinsen

Methods
-------
createPath
^^^^^^^^^^

.. java:method:: public static void createPath(String path) throws IOException
   :outertype: PathHelper

   Create the path specified in parameter. This method will create any missing directory from the path.

   :throws IOException:

getCanonicalPath
^^^^^^^^^^^^^^^^

.. java:method:: public static String getCanonicalPath(String basePath, String path) throws IOException
   :outertype: PathHelper

   Get the canonical path from the basePath and relative path.

   :param basePath:
   :param path:
   :throws IOException:
   :return: the canonical path from the "path".

getExtension
^^^^^^^^^^^^

.. java:method:: public static String getExtension(String path)
   :outertype: PathHelper

   Get the file extension from the specified path.

   :param path: The filepath for getting it's extension.
   :return: return the extension of the path. It returns empty string if the path is not directory or file without extension.

getFilename
^^^^^^^^^^^

.. java:method:: public static String getFilename(String path) throws IOException
   :outertype: PathHelper

   Get the filename of the particular path. If the filename of the path does not exist, throws IOException.

   :param path:
   :throws IOException: if the file does not exist or it is a directory.

getRelativePath
^^^^^^^^^^^^^^^

.. java:method:: public static String getRelativePath(String basePath, String path) throws IOException
   :outertype: PathHelper

   Get the relative path from the canoical basepath and path.

   :param basePath:
   :param path:
   :throws IOException:

removeExtension
^^^^^^^^^^^^^^^

.. java:method:: public static String removeExtension(String path)
   :outertype: PathHelper

   Remove the file extension from the specified path.

   :param path:
   :return: return the path without extension.

renameTo
^^^^^^^^

.. java:method:: public static File renameTo(File source, String newName)
   :outertype: PathHelper

   Rename the file specified to the new name specified in parameters.

   :param source: The source file object.
   :param newName: The new name of the object.
   :return: The new file object for the new path.


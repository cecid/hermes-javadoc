.. java:import:: org.apache.commons.io FileUtils

.. java:import:: java.io File

ResSetter
=========

.. java:package:: hk.hku.cecid.piazza.commons.test.utils
   :noindex:

.. java:type:: public class ResSetter

   :author: Patrick Yip This class is to set the resource(fixture) for the test cases. Especially for the test case that need to simulate the action of file system. Such as test cases for doc processor need to simulate operation of file move. So, before the test cases run. Call the restore method to copy the needed resource to the tmp folder of fixture folder. After the test case finished, delete the temp folder by calling the clean method. The purpose of this restore and clean is to filter the .svn file create by subversion that is not needed for the test cases to run.

Fields
------
ORG_RES_FOLDER
^^^^^^^^^^^^^^

.. java:field:: public static String ORG_RES_FOLDER
   :outertype: ResSetter

RES_TMP_DIR
^^^^^^^^^^^

.. java:field:: public static final String RES_TMP_DIR
   :outertype: ResSetter

Constructors
------------
ResSetter
^^^^^^^^^

.. java:constructor:: public ResSetter(Class clazz)
   :outertype: ResSetter

Methods
-------
backupRes
^^^^^^^^^

.. java:method:: public void backupRes() throws Exception
   :outertype: ResSetter

   Restore all of the files in the res folder to the tmp By copying all of the file from fixture for test case to the tmp folder

   :throws Exception:

clean
^^^^^

.. java:method:: public void clean() throws Exception
   :outertype: ResSetter

   Clean up the directory that related to the test cases in the res folder

   :throws Exception:

restore
^^^^^^^

.. java:method:: public void restore() throws Exception
   :outertype: ResSetter

   Restore all of the files in the res folder to the res. By moving the file from the orgResBase to the resBase. The moving operation will not move the CVS related files

   :throws Exception:

storeRes
^^^^^^^^

.. java:method:: public void storeRes() throws Exception
   :outertype: ResSetter

   Delete all of the file in the fixture base except tmp folder itself and copy back the original fixture from tmp to fixture, then delete the tmp folder

   :throws Exception:


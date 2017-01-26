.. java:import:: java.io File

.. java:import:: java.io IOException

.. java:import:: java.util Collection

.. java:import:: java.util Iterator

.. java:import:: java.util ArrayList

PackagedPayloadsRepository
==========================

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public class PackagedPayloadsRepository extends PayloadsRepository

   The outgoing payloads repository retrieves the payload which is in the form of zip files. Creation Date: 5/10/2006

   :author: Twinsen Tsang

Fields
------
PACKAGE_EXT
^^^^^^^^^^^

.. java:field:: public static final String PACKAGE_EXT
   :outertype: PackagedPayloadsRepository

   The packaged payload extension.

Methods
-------
createPayloads
^^^^^^^^^^^^^^

.. java:method:: public NamedPayloads createPayloads(Object[] params, int initialState) throws Exception
   :outertype: PackagedPayloadsRepository

   Create a customizing payloads for the specified parameter. Since the packaged payloads is in the form of <partnership_id>$<message_id>, so the size of parameters size should have at least 2.

   :param params: An array object parameters set for creating the payload.
   :throws IllegalArgumentException: if the size of parameters is smaller than 2.

createPayloadsProxy
^^^^^^^^^^^^^^^^^^^

.. java:method:: protected NamedPayloads createPayloadsProxy(File proxyObj)
   :outertype: PackagedPayloadsRepository

   Create a customizing payloads for this repository.

   :param proxyObj: The file object for the payloads.
   :return: a customizing payloads.

getPayload
^^^^^^^^^^

.. java:method:: public NamedPayloads getPayload(Object[] params, int state)
   :outertype: PackagedPayloadsRepository

   Get a particular payload in the payload repository by the specified parameters. Since the outgoing payloads is in the form of <partnership_id>$<message_id>, so the size of parameters size should have at least 2.

   :param params: An array object parameters set for creating the payload.
   :param state: The current state of that payload.
   :return: the payload with the specified params or null if it does not exist.

getPayloads
^^^^^^^^^^^

.. java:method:: public Collection getPayloads()
   :outertype: PackagedPayloadsRepository

   :return: return a set of packaged payload.

getProcessingPayloads
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public Collection getProcessingPayloads()
   :outertype: PackagedPayloadsRepository

   :return: Get the list of processing payloads in the payload repositoy;

getReadyPayloads
^^^^^^^^^^^^^^^^

.. java:method:: public Collection getReadyPayloads()
   :outertype: PackagedPayloadsRepository

   :return: return a set of ready to sent payload

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: PackagedPayloadsRepository

   Invoke for component initialization.

main
^^^^

.. java:method:: public static void main(String[] args)
   :outertype: PackagedPayloadsRepository

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: PackagedPayloadsRepository

   toString method


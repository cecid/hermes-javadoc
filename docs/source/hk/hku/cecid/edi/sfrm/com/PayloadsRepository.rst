.. java:import:: java.io File

.. java:import:: java.util Collection

.. java:import:: java.util Properties

.. java:import:: hk.hku.cecid.piazza.commons.io FileSystem

.. java:import:: hk.hku.cecid.piazza.commons.module SystemComponent

PayloadsRepository
==================

.. java:package:: hk.hku.cecid.edi.sfrm.com
   :noindex:

.. java:type:: public abstract class PayloadsRepository extends SystemComponent

   A Generic repository for collect a set of payloads that satisfies some criteria. \ **SPA Component Guideline:**\

   ..

   #. Add a new parameter with the name is "location".
   #. The value of newly parameter should be the absolute repository path.

   \ **Example**\  If the location is C:\corvus\repository\test-repository,

   .. parsed-literal::

      <component id="test" name="Test Repository">
          <class>hk.hku.cecid.edi.sfrm.com.XXXXRepository</class>
          <parameter name="location" value="C:\corvus\repository\test-repository"/>
      </component>

   * Creation Date: 5/10/2006

   :author: Twinsen

Constructors
------------
PayloadsRepository
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PayloadsRepository()
   :outertype: PayloadsRepository

   Constructor.

PayloadsRepository
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public PayloadsRepository(String repoPath) throws Exception
   :outertype: PayloadsRepository

Methods
-------
createPayloads
^^^^^^^^^^^^^^

.. java:method:: public abstract NamedPayloads createPayloads(Object[] params, int initialState) throws Exception
   :outertype: PayloadsRepository

   Create a customizing payloads for the specified parameter.

   :param params: An array object parameters set for creating the payload.
   :param initialState: The initial state of the payloads, see \ :java:ref:`PayloadsState`\  for details
   :throws Exception: Any kind of exception.

createPayloadsProxy
^^^^^^^^^^^^^^^^^^^

.. java:method:: protected abstract NamedPayloads createPayloadsProxy(File proxyObj)
   :outertype: PayloadsRepository

   Create a customizing payloads for this repository.

   :param proxyObj: The file object for the payloads.
   :return: a customizing payloads.

getPayload
^^^^^^^^^^

.. java:method:: public NamedPayloads getPayload(String name)
   :outertype: PayloadsRepository

   Get a particular payload in the payload repository.

   :param name: The physical file name of the payload.
   :return: the payload with the specified name or null if it does not exist.

getPayload
^^^^^^^^^^

.. java:method:: public abstract NamedPayloads getPayload(Object[] params, int state)
   :outertype: PayloadsRepository

   Get a particular payload in the payload repository by the specified parameters.

   :param params: An array object parameters set for creating the payload.
   :param state: The current state of that payload.
   :return: the payload with the specified params or null if it does not exist.

getPayloads
^^^^^^^^^^^

.. java:method:: public abstract Collection getPayloads()
   :outertype: PayloadsRepository

   :return: Get the list of pending payloads in the payload repository.

getProcessingPayloads
^^^^^^^^^^^^^^^^^^^^^

.. java:method:: public abstract Collection getProcessingPayloads()
   :outertype: PayloadsRepository

   :return: Get the list of processing payloads in the payload repositoy;

getRepository
^^^^^^^^^^^^^

.. java:method:: public File getRepository()
   :outertype: PayloadsRepository

   Get the repository.

   :return: Return the repository.

getRepositoryPath
^^^^^^^^^^^^^^^^^

.. java:method:: public String getRepositoryPath()
   :outertype: PayloadsRepository

   :return: get the repository absolute path.

getRepositorySystem
^^^^^^^^^^^^^^^^^^^

.. java:method:: public FileSystem getRepositorySystem()
   :outertype: PayloadsRepository

   Get the repository system

   :return: Return the repository.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: PayloadsRepository

   Component Initialization.

   :throws Exception:

initRepository
^^^^^^^^^^^^^^

.. java:method:: protected void initRepository(String repository)
   :outertype: PayloadsRepository

   Initialize the repository. Create the repository if it does not exist.

   :param repository:

initRepository
^^^^^^^^^^^^^^

.. java:method:: protected void initRepository(File repository)
   :outertype: PayloadsRepository

   Initialize the repository. Create the repository if it does not exist.

   :param repository:

toString
^^^^^^^^

.. java:method:: public String toString()
   :outertype: PayloadsRepository

   toString method.


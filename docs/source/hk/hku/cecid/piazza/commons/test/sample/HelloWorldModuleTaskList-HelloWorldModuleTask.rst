.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTask

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskList

HelloWorldModuleTaskList.HelloWorldModuleTask
=============================================

.. java:package:: hk.hku.cecid.piazza.commons.test.sample
   :noindex:

.. java:type:: public class HelloWorldModuleTask implements ActiveTask
   :outertype: HelloWorldModuleTaskList

Methods
-------
execute
^^^^^^^

.. java:method:: public void execute() throws Exception
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

getMaxRetries
^^^^^^^^^^^^^

.. java:method:: public int getMaxRetries()
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

getRetryInterval
^^^^^^^^^^^^^^^^

.. java:method:: public long getRetryInterval()
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

isRetryEnabled
^^^^^^^^^^^^^^

.. java:method:: public boolean isRetryEnabled()
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

isSucceedFast
^^^^^^^^^^^^^

.. java:method:: public boolean isSucceedFast()
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

onAwake
^^^^^^^

.. java:method:: public void onAwake()
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

onFailure
^^^^^^^^^

.. java:method:: public void onFailure(Throwable e)
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask

setRetried
^^^^^^^^^^

.. java:method:: public void setRetried(int retried)
   :outertype: HelloWorldModuleTaskList.HelloWorldModuleTask


.. java:import:: java.util ArrayList

.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.piazza.commons.module ActiveTaskModule

.. java:import:: hk.hku.cecid.piazza.commons.module LimitedActiveTaskList

MessageStatusCollector
======================

.. java:package:: hk.hku.cecid.edi.sfrm.task
   :noindex:

.. java:type:: public class MessageStatusCollector extends LimitedActiveTaskList

   :author: Patrick Yip Collector to query the status of active message periodically. The status of message includes

   ..

   * status code
   * status description
   * number of processed segment
   * message speed (KB/s)

Methods
-------
getTaskList
^^^^^^^^^^^

.. java:method:: @Override public List getTaskList()
   :outertype: MessageStatusCollector


TimedOutEntryListener
=====================

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public interface TimedOutEntryListener

   The \ ``TimedOutEntryListener``\  is the callback listener for \ ``TimedOutHashTable``\ . It is invoked when a hash key-value pair is considered timed-out and prepare to delete the entry. Creation Date: 26/6/2007

   :author: Twinsen Tsang

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.util.TimedOutHashTable.`

Methods
-------
timeOut
^^^^^^^

.. java:method:: public void timeOut(Object key, Object value)
   :outertype: TimedOutEntryListener

   :param key: The key of the entry that prepare to delete in the hashtable.
   :param value: The value of the entry that prepare to delete in the hashtable.


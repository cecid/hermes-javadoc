.. java:import:: java.util Date

.. java:import:: java.util Hashtable

.. java:import:: java.util Timer

.. java:import:: java.util TimerTask

.. java:import:: java.util Enumeration

TimedOutHashTable
=================

.. java:package:: hk.hku.cecid.edi.sfrm.util
   :noindex:

.. java:type:: public class TimedOutHashTable extends Hashtable

   The \ ``TimedOutDHashTable``\  is the hashtable that provides time out features. All timed-out key and value will be cleared in the hashtable. The default interval for sweeping away all timed out record is 5 second. For the release of JDK5.0 , this class can inherit java.util.conncurrent.ConcurrentHashMap for better performance. Creation Date: 25/6/2007 17/7/2007 1. Bug Fixed that return false for invoking \ :java:ref:`containsValue(Object)`\  because of invalid implementation of \ :java:ref:`TimedOutEntry.equals(Object)`\ .  2. Bug Fixed that the memory leak issue when de-referecing timed-out hashtable due to there is one reference in the internal TimedOutTask. Now you are required to call \ :java:ref:`complete()`\  when you want to gc the hashtable.

   :author: Twinsen Tsang

Constructors
------------
TimedOutHashTable
^^^^^^^^^^^^^^^^^

.. java:constructor:: public TimedOutHashTable()
   :outertype: TimedOutHashTable

   Constructor.

TimedOutHashTable
^^^^^^^^^^^^^^^^^

.. java:constructor:: public TimedOutHashTable(long sweepInterval)
   :outertype: TimedOutHashTable

   Explicit Constructor.

   :param sweepInterval: The sweepInterval for sweeping away the timed-out hash-record.

Methods
-------
complete
^^^^^^^^

.. java:method:: public void complete()
   :outertype: TimedOutHashTable

   Invoke this method when you no longer want to use the hashtable anymore. (it will be gc soon).

contains
^^^^^^^^

.. java:method:: public boolean contains(Object value)
   :outertype: TimedOutHashTable

containsValue
^^^^^^^^^^^^^

.. java:method:: public boolean containsValue(Object value)
   :outertype: TimedOutHashTable

get
^^^

.. java:method:: public Object get(Object key)
   :outertype: TimedOutHashTable

getSweepInterval
^^^^^^^^^^^^^^^^

.. java:method:: public long getSweepInterval()
   :outertype: TimedOutHashTable

   :return: the sweeping interval for the hash table.

put
^^^

.. java:method:: public Object put(Object key, Object value)
   :outertype: TimedOutHashTable

put
^^^

.. java:method:: public Object put(Object key, Object value, long timeOutInMs)
   :outertype: TimedOutHashTable

   Maps the specified key to the specified value in this hashtable. Neither the key nor the value can be null. The value can be retrieved by calling the get method with a key that is equal to the original key.

   :param key: the hashtable key.
   :param value: the value
   :param timeOutInMS: how long does this record time out.
   :return: the previous value of the specified key in this hashtable, or null if it did not have one.

put
^^^

.. java:method:: public Object put(Object key, Object value, Date timeOutDate)
   :outertype: TimedOutHashTable

   Maps the specified key to the specified value in this hashtable. Neither the key nor the value can be null. The value can be retrieved by calling the get method with a key that is equal to the original key.

   :param key: the hashtable key.
   :param value: the value
   :param timeOutDate: how long does this record time out in date object.
   :return: the previous value of the specified key in this hashtable, or null if it did not have one.

setListener
^^^^^^^^^^^

.. java:method:: public void setListener(TimedOutEntryListener listener)
   :outertype: TimedOutHashTable

   :param listener: The listener for receiving removal event of timed-out entry.

   **See also:** :java:ref:`hk.hku.cecid.piazza.commons.util.TimedOutEntryListener.`


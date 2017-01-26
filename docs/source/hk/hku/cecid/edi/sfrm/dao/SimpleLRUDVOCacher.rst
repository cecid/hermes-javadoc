.. java:import:: java.util Map

.. java:import:: java.util LinkedHashMap

.. java:import:: java.util Properties

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

.. java:import:: hk.hku.cecid.piazza.commons.module Component

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SimpleLRUDVOCacher
==================

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public class SimpleLRUDVOCacher extends Component implements DVOCacher

   The \ ``SimpleLRUDVOCacher``\  is the simple DVO cacher which possess LRU, Least-Recently Used features. When there is not enough room to store the DVO as a cache. It tries to remove the oldest record (the one that has not retrieved for longest times). Creation Date: 12/2/2007

   :author: Twinsen Tsang

Constructors
------------
SimpleLRUDVOCacher
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleLRUDVOCacher()
   :outertype: SimpleLRUDVOCacher

   Constructor. Use \ :java:ref:`SimpleLRUDVOCacher(int)`\  instead of this constructor. This is reserved for Piazza Common component initialization only.

SimpleLRUDVOCacher
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SimpleLRUDVOCacher(int cacheSize)
   :outertype: SimpleLRUDVOCacher

   Explicit Constructor.

   :param cacheSize: The maximum size of the cache.

Methods
-------
activeSize
^^^^^^^^^^

.. java:method:: public int activeSize()
   :outertype: SimpleLRUDVOCacher

   The activs size is defined how many DVO are already stored in the cacher.

   :return: Get the active size of DVO cacher.

efficieny
^^^^^^^^^

.. java:method:: public double efficieny()
   :outertype: SimpleLRUDVOCacher

   This method is used to calculate the \ :java:ref:`getDVO(String)`\  efficieny (eff) of the cacher. It is formulated :

   .. parsed-literal::

                  cacheHit
      eff = (--------------------) * 100
             cacheHit + cacheMiss

   :return: the efficiency of the cacher.

getDVO
^^^^^^

.. java:method:: public DVO getDVO(String key)
   :outertype: SimpleLRUDVOCacher

   Get the DVO cache from the particular \ ``key``\ .

   :param key: The key field of the DVO.
   :return: Return null if the cache record does not exist.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: SimpleLRUDVOCacher

   Invoked for initialization.

maxSize
^^^^^^^

.. java:method:: public int maxSize()
   :outertype: SimpleLRUDVOCacher

   The maximum size is defined how many DVO are the cacher can store before swapping out happens.

   :return: Get the maximum size of DVO cacher.

putDVO
^^^^^^

.. java:method:: public void putDVO(String key, DVO cacheItem) throws CacheException
   :outertype: SimpleLRUDVOCacher

   Store the DVO \ ``cacheItem``\  into the cacher with the specified \ ``Key``\ . If the DVO in the \ ``key``\  is already exist, it throws CacheException indicating cache duplication.

   :param key: The key field of the DVO.
   :param cacheItem: The DVO item to be cached.
   :throws CacheException: when the record is already exist.

   **See also:** :java:ref:`.putOrUpdateDVO(String,DVO);`

putOrUpdateDVO
^^^^^^^^^^^^^^

.. java:method:: public void putOrUpdateDVO(String key, DVO cacheItem)
   :outertype: SimpleLRUDVOCacher

   Store or Update the DVO \ ``cacheItem``\  into the cacher with the specified \ ``Key``\ .

   :param key: The key field of the DVO.
   :param cacheItem: The DVO item to be cached.

removeAll
^^^^^^^^^

.. java:method:: public void removeAll()
   :outertype: SimpleLRUDVOCacher

   Remove all the cache record.

removeDVO
^^^^^^^^^

.. java:method:: public void removeDVO(String key)
   :outertype: SimpleLRUDVOCacher

   Remove the cache record with the key field equal to \ ``key``\ .

   :param key: The DVO's key field to remove.


.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

DVOCacher
=========

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public interface DVOCacher

   The \ ``DVOCacher``\  is a component that caches the DVO(s) into partiular format designated in the sub-class. To store DVO that have multiple key, it is \ **recommended**\  to combine the key as a string by a separator "_". For example, If the messageDVO has the key \ *message_id*\  and \ *message_box*\ , You should use combined key \ *message_id*\ _\ *message_box*\ .  Creation Date: 12/2/2007

   :author: Twinsen Tsang

Methods
-------
activeSize
^^^^^^^^^^

.. java:method::  int activeSize()
   :outertype: DVOCacher

   The activs size is defined how many DVO are already stored in the cacher.

   :return: Get the active size of DVO cacher.

efficieny
^^^^^^^^^

.. java:method::  double efficieny()
   :outertype: DVOCacher

   This method is used to calculate the \ :java:ref:`getDVO(String)`\  efficieny (eff) of the cacher. It is formulated :

   .. parsed-literal::

                  cacheHit
      eff = (--------------------) * 100
             cacheHit + cacheMiss

   :return: the efficiency of the cacher.

getDVO
^^^^^^

.. java:method::  DVO getDVO(String key)
   :outertype: DVOCacher

   Get the DVO cache from the particular \ ``key``\ .

   :param key: The key field of the DVO.
   :return: Return null if the cache record does not exist.

maxSize
^^^^^^^

.. java:method::  int maxSize()
   :outertype: DVOCacher

   The maximum size is defined how many DVO are the cacher can store before swapping out happens.

   :return: Get the maximum size of DVO cacher.

putDVO
^^^^^^

.. java:method::  void putDVO(String key, DVO cacheItem) throws CacheException
   :outertype: DVOCacher

   Store the DVO \ ``cacheItem``\  into the cacher with the specified \ ``Key``\ . If the DVO in the \ ``key``\  is already exist, it throws CacheException indicating cache duplication.

   :param key: The key field of the DVO.
   :param cacheItem: The DVO item to be cached.
   :throws CacheException: when the record is already exist.

   **See also:** :java:ref:`.putOrUpdateDVO(String,DVO);`

putOrUpdateDVO
^^^^^^^^^^^^^^

.. java:method::  void putOrUpdateDVO(String key, DVO cacheItem)
   :outertype: DVOCacher

   Store or Update the DVO \ ``cacheItem``\  into the cacher with the specified \ ``Key``\ .

   :param key: The key field of the DVO.
   :param cacheItem: The DVO item to be cached.

removeAll
^^^^^^^^^

.. java:method::  void removeAll()
   :outertype: DVOCacher

   Remove all the cache record.

removeDVO
^^^^^^^^^

.. java:method::  void removeDVO(String key)
   :outertype: DVOCacher

   Remove the cache record with the key field equal to \ ``key``\ .

   :param key: The DVO's key field to remove.


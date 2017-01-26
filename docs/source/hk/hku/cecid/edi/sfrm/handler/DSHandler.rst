.. java:import:: java.util Properties

.. java:import:: hk.hku.cecid.edi.sfrm.dao DVOCacher

.. java:import:: hk.hku.cecid.edi.sfrm.dao SimpleLRUDVOCacher

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.module SystemComponent

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

DSHandler
=========

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public abstract class DSHandler extends SystemComponent

   The class DSHandler provides abstract interface for getting the actual DAO from the implementation class. Creation Date: 3/10/2006. V1.0.2 - support DVO \ ``Caching``\

   :author: Twinsen Tsang

Fields
------
cacher
^^^^^^

.. java:field:: protected DVOCacher cacher
   :outertype: DSHandler

   The DVO cache.

dao
^^^

.. java:field:: protected DAO dao
   :outertype: DSHandler

   The singleton dao.

isCacheEnable
^^^^^^^^^^^^^

.. java:field:: protected boolean isCacheEnable
   :outertype: DSHandler

   The flag indicating whether the cache is enabled ?.

Methods
-------
clearCache
^^^^^^^^^^

.. java:method:: public abstract void clearCache(DVO dvo)
   :outertype: DSHandler

   Clear the cache ONLY by a particular dvo object;

getDAOInstance
^^^^^^^^^^^^^^

.. java:method:: public DAO getDAOInstance()
   :outertype: DSHandler

   The public interface used for other class to access DAO.

   :return: Get the DAO singleton instance.

getInstance
^^^^^^^^^^^

.. java:method:: protected abstract DAO getInstance() throws DAOException
   :outertype: DSHandler

   Create / Get the instance of DAO.

init
^^^^

.. java:method:: protected void init() throws Exception
   :outertype: DSHandler

   Invoked for initialization. There is following parameters that can be set in this component:

   ..

   #. cache-enable: The flag whether the cache should be enabled. [Boolean]
   #. cache-size : The size of cache that can hold without LRU swapping. [Integer]


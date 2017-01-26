.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.dao CacheException

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDAO

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

SFRMPartnershipHandler
======================

.. java:package:: hk.hku.cecid.edi.sfrm.handler
   :noindex:

.. java:type:: public class SFRMPartnershipHandler extends DSHandler

   Creation Date: 28/9/2006 V1.0.1 - supports DVO \ ``caching``\ .

   :author: Twinsen

Methods
-------
addPartnership
^^^^^^^^^^^^^^

.. java:method:: public boolean addPartnership(SFRMPartnershipDVO pDVO, String mID) throws DAOException
   :outertype: SFRMPartnershipHandler

   Add a SFRM Partnership by partnership object specified in the parmeter.

   :param pDVO: The SFRM Partnership to be added for.
   :param mID: The message id for the requesting partnership.
   :throws DAOException:
   :return: false if operation fails to execute, otherwise true.

clearCache
^^^^^^^^^^

.. java:method:: public void clearCache(DVO dvo)
   :outertype: SFRMPartnershipHandler

   [Overriden] Clear the cache ONLY by a particular dvo object. NOT YET IMPLEMENTED.

   :param dvo: The partnership object to be removed in the cache.

clearCache
^^^^^^^^^^

.. java:method:: public void clearCache(String pID, String mID)
   :outertype: SFRMPartnershipHandler

   Clear the cache ONLY by a particular partnership id.

   :param pID: The partnership object has \ ``pID to be removed in the cache.``\
   :param mID: The message id for the requesting partnership.

createPartnership
^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO createPartnership() throws DAOException
   :outertype: SFRMPartnershipHandler

   Create a SFRM Partnership object.

   :throws DAOException:
   :return: A new SFRM Partnership object.

getInstance
^^^^^^^^^^^

.. java:method:: protected DAO getInstance() throws DAOException
   :outertype: SFRMPartnershipHandler

   Create / Get the instance of DAO.

removePartnership
^^^^^^^^^^^^^^^^^

.. java:method:: public boolean removePartnership(SFRMPartnershipDVO pDVO) throws DAOException
   :outertype: SFRMPartnershipHandler

   Remove a SFRM Partnership by partnership object specified in the parameter.

   :param pDVO:
   :throws DAOException:
   :return: false if operation fails to execute, otherwise true.

retreivePartnership
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO retreivePartnership(String pID, String mID) throws DAOException
   :outertype: SFRMPartnershipHandler

   Select a SFRM Partnership by the service parameter.

   :param pID: The partnership id name of the partnership id to be search.
   :param mID: The message id for the requesting partnership.
   :throws DAOException:
   :return: null if not found, otherwise the SFRM Partnership.

retreivePartnership
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO retreivePartnership(SFRMPartnershipDVO pDVO, String mID) throws DAOException
   :outertype: SFRMPartnershipHandler

   Select a SFRM Partnership by the keys specified in the parameter.

   :param pDVO: The SFRM Partnership to be found for.
   :param mID: The message id for the requesting partnership.
   :throws DAOException:
   :return: null if not found, otherwise the SFRM Partnership.

retreivePartnership
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO retreivePartnership(SFRMMessage msg) throws DAOException
   :outertype: SFRMPartnershipHandler

   Select a SFRM Partnership by the SFRM message.

   :param msg: The SFRM Message record used for finding it's associate partnership.
   :throws DAOException:
   :return: null if not found, otherwise the SFRM Partnership.

updatePartnership
^^^^^^^^^^^^^^^^^

.. java:method:: public boolean updatePartnership(SFRMPartnershipDVO pDVO, String mID) throws DAOException
   :outertype: SFRMPartnershipHandler

   Update a SFRM Partnership by partnership object specified in the parameter.

   :param pDVO: The SFRM Partnership to be updated for.
   :param mID: The message id for the requesting partnership.
   :throws DAOException:
   :return: false if operation fails to execute, otherwise true.


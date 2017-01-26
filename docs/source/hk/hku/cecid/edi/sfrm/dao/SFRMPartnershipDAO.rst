.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

SFRMPartnershipDAO
==================

.. java:package:: hk.hku.cecid.edi.sfrm.dao
   :noindex:

.. java:type:: public interface SFRMPartnershipDAO extends DAO

   :author: Twinsen Tsang

Methods
-------
findAllPartnerships
^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findAllPartnerships() throws DAOException
   :outertype: SFRMPartnershipDAO

   Find all of the partnership existing in the database

   :return: return a list of partnership

findPartnershipById
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipById(SFRMPartnershipDVO partnershipDVO) throws DAOException
   :outertype: SFRMPartnershipDAO

   Find the partnership by the partnership object specified in the parameter object. The partnership id field will be retreived and used for the finder.

   :param partnershipDVO:
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipById
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipById(String partnershipId) throws DAOException
   :outertype: SFRMPartnershipDAO

   Find the partnership by the service string specified in the parameter.

   :param partnershipId: The partnership id to used for search partnership.
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipBySeq
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipBySeq(SFRMPartnershipDVO partnershipDVO) throws DAOException
   :outertype: SFRMPartnershipDAO

   Find the partnership by the partnership object specified in the parameter object. The partnership seq field will be retreived and used for the finder.

   :param partnershipDVO:
   :throws DAOException:
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipBySeq
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipBySeq(int partnershipId) throws DAOException
   :outertype: SFRMPartnershipDAO

   Find the partnership by it's seq id.

   :param partnershipId:
   :return: return null if no partnership found, otherwise the a sfrm partnership.


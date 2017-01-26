.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDAO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMPartnershipDVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DVO

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.dao.ds DataSourceDAO

SFRMPartnershipDSDAO
====================

.. java:package:: hk.hku.cecid.edi.sfrm.dao.ds
   :noindex:

.. java:type:: public class SFRMPartnershipDSDAO extends DataSourceDAO implements SFRMPartnershipDAO

   Creation Date: 27/9/2007

   :author: Twinsen

Constructors
------------
SFRMPartnershipDSDAO
^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SFRMPartnershipDSDAO()
   :outertype: SFRMPartnershipDSDAO

   Constructor.

Methods
-------
createDVO
^^^^^^^^^

.. java:method:: public DVO createDVO()
   :outertype: SFRMPartnershipDSDAO

   Create a new SFRM Partnership Object.

   :return: a new SFRM Partnership Object.

findAllPartnerships
^^^^^^^^^^^^^^^^^^^

.. java:method:: public List findAllPartnerships() throws DAOException
   :outertype: SFRMPartnershipDSDAO

   Find all partnership order by the partnership id

   :return: return a list of partnership existing in the database

findPartnershipById
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipById(SFRMPartnershipDVO partnershipDVO) throws DAOException
   :outertype: SFRMPartnershipDSDAO

   Find the partnership by the partnership object specified in the parameter object. The partnership id field will be retreived and used for the finder.

   :param partnershipDVO:
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipById
^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipById(String partnershipId) throws DAOException
   :outertype: SFRMPartnershipDSDAO

   Find the partnership by the service string specified in the parameter.

   :param partnershipId:
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipBySeq
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipBySeq(SFRMPartnershipDVO partnershipDVO) throws DAOException
   :outertype: SFRMPartnershipDSDAO

   Find the partnership by the partnership object specified in the parameter object. The partnership id field will be retreived and used for the finder.

   :param partnershipDVO:
   :throws DAOException:
   :return: return null if no partnership found, otherwise the a sfrm partnership.

findPartnershipBySeq
^^^^^^^^^^^^^^^^^^^^

.. java:method:: public SFRMPartnershipDVO findPartnershipBySeq(int partnershipId) throws DAOException
   :outertype: SFRMPartnershipDSDAO

   Find the partnership by it's id.

   :param partnershipId:
   :return: return null if no partnership found, otherwise the a sfrm partnership.


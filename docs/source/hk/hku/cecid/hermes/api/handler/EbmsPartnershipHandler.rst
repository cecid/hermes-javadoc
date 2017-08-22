.. java:import:: java.net MalformedURLException

.. java:import:: java.net URL

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util Map

.. java:import:: hk.hku.cecid.ebms.spa EbmsProcessor

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao PartnershipDVO

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: org.apache.commons.codec.binary Base64

EbmsPartnershipHandler
======================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class EbmsPartnershipHandler extends MessageHandler implements PartnershipHandler

Constructors
------------
EbmsPartnershipHandler
^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public EbmsPartnershipHandler(HermesAbstractApiListener listener)
   :outertype: EbmsPartnershipHandler

Methods
-------
addPartnership
^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> addPartnership(Map<String, Object> inputDict)
   :outertype: EbmsPartnershipHandler

getPartnerships
^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getPartnerships()
   :outertype: EbmsPartnershipHandler

removePartnership
^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> removePartnership(String id)
   :outertype: EbmsPartnershipHandler


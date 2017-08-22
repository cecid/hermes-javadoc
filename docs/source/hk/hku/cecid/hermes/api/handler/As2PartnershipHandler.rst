.. java:import:: java.net MalformedURLException

.. java:import:: java.net URL

.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Iterator

.. java:import:: java.util Map

.. java:import:: hk.hku.cecid.edi.as2 AS2Processor

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDAO

.. java:import:: hk.hku.cecid.edi.as2.dao PartnershipDVO

.. java:import:: hk.hku.cecid.hermes.api.listener HermesAbstractApiListener

.. java:import:: hk.hku.cecid.hermes.api Constants

.. java:import:: hk.hku.cecid.hermes.api ErrorCode

.. java:import:: hk.hku.cecid.hermes.api.spa ApiPlugin

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: org.apache.commons.codec.binary Base64

As2PartnershipHandler
=====================

.. java:package:: hk.hku.cecid.hermes.api.handler
   :noindex:

.. java:type:: public class As2PartnershipHandler extends MessageHandler implements PartnershipHandler

Constructors
------------
As2PartnershipHandler
^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public As2PartnershipHandler(HermesAbstractApiListener listener)
   :outertype: As2PartnershipHandler

Methods
-------
addPartnership
^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> addPartnership(Map<String, Object> inputDict)
   :outertype: As2PartnershipHandler

getPartnerships
^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> getPartnerships()
   :outertype: As2PartnershipHandler

removePartnership
^^^^^^^^^^^^^^^^^

.. java:method:: public Map<String, Object> removePartnership(String id)
   :outertype: As2PartnershipHandler


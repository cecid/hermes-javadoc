.. java:import:: java.util Iterator

.. java:import:: java.util List

.. java:import:: javax.xml.soap SOAPBodyElement

.. java:import:: javax.xml.soap SOAPElement

.. java:import:: hk.hku.cecid.ebms.spa EbmsProcessor

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDAO

.. java:import:: hk.hku.cecid.ebms.spa.dao MessageDVO

.. java:import:: hk.hku.cecid.ebms.spa.handler MessageClassifier

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.soap SOAPRequestException

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesRequest

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesResponse

EbmsMessageHistoryService
=========================

.. java:package:: hk.hku.cecid.ebms.spa.service
   :noindex:

.. java:type:: public class EbmsMessageHistoryService extends WebServicesAdaptor

Fields
------
MAX_NUMBER
^^^^^^^^^^

.. java:field:: public static int MAX_NUMBER
   :outertype: EbmsMessageHistoryService

NAMESPACE
^^^^^^^^^

.. java:field:: public static String NAMESPACE
   :outertype: EbmsMessageHistoryService

Methods
-------
serviceRequested
^^^^^^^^^^^^^^^^

.. java:method:: public void serviceRequested(WebServicesRequest request, WebServicesResponse response) throws SOAPRequestException, DAOException
   :outertype: EbmsMessageHistoryService


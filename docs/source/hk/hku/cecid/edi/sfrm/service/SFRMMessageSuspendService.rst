.. java:import:: javax.xml.soap SOAPElement

.. java:import:: javax.xml.soap SOAPException

.. java:import:: org.w3c.dom Element

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMExternalRequestHandler

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.piazza.commons.dao DAOException

.. java:import:: hk.hku.cecid.piazza.commons.soap SOAPRequestException

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesRequest

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesResponse

.. java:import:: hk.hku.cecid.piazza.commons.util StringUtilities

SFRMMessageSuspendService
=========================

.. java:package:: hk.hku.cecid.edi.sfrm.service
   :noindex:

.. java:type:: public class SFRMMessageSuspendService extends WebServicesAdaptor

Methods
-------
serviceRequested
^^^^^^^^^^^^^^^^

.. java:method:: public void serviceRequested(WebServicesRequest request, WebServicesResponse response) throws SOAPRequestException, DAOException, SOAPException
   :outertype: SFRMMessageSuspendService

   Process the web services call by the client.

   :param request: The SOAP-based Web services request.
   :param response: The SOAP-based Web services response.
   :throws SOAPRequestException: Unable to process the SOAP request.
   :throws DAOException: Error in database connectivity.
   :throws SOAPException:


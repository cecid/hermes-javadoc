.. java:import:: java.sql Timestamp

.. java:import:: javax.xml.soap SOAPElement

.. java:import:: org.w3c.dom Element

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMProcessor

.. java:import:: hk.hku.cecid.edi.sfrm.spa SFRMLog

.. java:import:: hk.hku.cecid.edi.sfrm.util StatusQuery

.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMConstant

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageDVO

.. java:import:: hk.hku.cecid.edi.sfrm.dao SFRMMessageSegmentDAO

.. java:import:: hk.hku.cecid.edi.sfrm.handler MessageStatusQueryHandler

.. java:import:: hk.hku.cecid.edi.sfrm.handler SFRMMessageHandler

.. java:import:: hk.hku.cecid.piazza.commons.soap SOAPRequestException

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesAdaptor

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesRequest

.. java:import:: hk.hku.cecid.piazza.commons.soap WebServicesResponse

SFRMMessageStatusQueryService
=============================

.. java:package:: hk.hku.cecid.edi.sfrm.service
   :noindex:

.. java:type:: public class SFRMMessageStatusQueryService extends WebServicesAdaptor

   The \ ``SFRMMessageStatusQueryService``\  is a SOAP-based Web services for querying the current status of particular SFRM message. The web services schema is defined here: Input XML tag:

   .. parsed-literal::

      <messageId> messageId</messageId>

   Output XML tag:

   .. parsed-literal::

      <messageInfo>
          <status> The current status of message </status>
          <statusDescription> The current status description of message </statusDescription>
          <numberOfSegments> Maximum number of segments </numberOfSegments>
          <numberOfProcessedSegments> Number of processed segments </numberOfProcessedSegments>
          <lastUpdatedTime>  The last updated timestamp  </lastUpdatedTime>
      </messageInfo>

   There are some situation that the returned value may differ than your expectation and they are listed below:

   ..

   #. When the SFRM message is in status of handshaking (HS), the number of segments is
              maximum integer. This is because the number of segments can not be determined at that moment.

   #. When the SFRM message can't be found by the web service parameter. The returned tuple is \ **["N/A","", "2147483647","0","current time]**\ .

   Creation Date: 26/4/2007

   :author: Twinsen Tsang

Methods
-------
isCacheEnabled
^^^^^^^^^^^^^^

.. java:method:: protected boolean isCacheEnabled()
   :outertype: SFRMMessageStatusQueryService

serviceRequested
^^^^^^^^^^^^^^^^

.. java:method:: public void serviceRequested(WebServicesRequest request, WebServicesResponse response) throws Exception
   :outertype: SFRMMessageStatusQueryService

   Process the web services call by the client.

   :param request: The SOAP-based Web services request.
   :param response: The SOAP-based Web services response.
   :throws Exception:


.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

SFRMResponse
============

.. java:package:: hk.hku.cecid.edi.sfrm.listener
   :noindex:

.. java:type:: public class SFRMResponse

   The SFRMResponse class represents a wrapper of HTTP response wrapping the SFRMMessage inside.

   :author: Twinsen Tsang

Constructors
------------
SFRMResponse
^^^^^^^^^^^^

.. java:constructor::  SFRMResponse()
   :outertype: SFRMResponse

   Creates a new instance of AS2Response.

SFRMResponse
^^^^^^^^^^^^

.. java:constructor::  SFRMResponse(Object target)
   :outertype: SFRMResponse

   Creates a new instance of AS2Response.

   :param target: the target that this response should be committed to.

Methods
-------
getMessage
^^^^^^^^^^

.. java:method:: public SFRMMessage getMessage()
   :outertype: SFRMResponse

   Gets the SOAP message of this response.

   :return: the SOAP message of this response.

getTarget
^^^^^^^^^

.. java:method:: public Object getTarget()
   :outertype: SFRMResponse

   Gets the target that this response should be committed to.

   :return: the target that this response should be committed to.

setMessage
^^^^^^^^^^

.. java:method:: public void setMessage(SFRMMessage message)
   :outertype: SFRMResponse

   Sets the SOAP message of this response.

   :param message: the SOAP message of this response.

setTarget
^^^^^^^^^

.. java:method::  void setTarget(Object target)
   :outertype: SFRMResponse

   Sets the target that this response should be committed to.

   :param target: the target that this response should be committed to.


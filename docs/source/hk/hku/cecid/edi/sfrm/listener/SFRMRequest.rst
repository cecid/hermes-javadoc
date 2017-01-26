.. java:import:: hk.hku.cecid.edi.sfrm.pkg SFRMMessage

SFRMRequest
===========

.. java:package:: hk.hku.cecid.edi.sfrm.listener
   :noindex:

.. java:type:: public class SFRMRequest

   The SFRMRequest class represents a wrapper of HTTP request wrapping the SFRMMessage inside.

   :author: Twinsen Tsang

Constructors
------------
SFRMRequest
^^^^^^^^^^^

.. java:constructor::  SFRMRequest()
   :outertype: SFRMRequest

   Creates a new instance of SFRM Request.

SFRMRequest
^^^^^^^^^^^

.. java:constructor::  SFRMRequest(Object source)
   :outertype: SFRMRequest

   Creates a new instance of SFRM Request.

   :param source: the source which initiated this request.

Methods
-------
getMessage
^^^^^^^^^^

.. java:method:: public SFRMMessage getMessage()
   :outertype: SFRMRequest

   Gets the SOAP message of this request.

   :return: the SOAP message of this request.

getSource
^^^^^^^^^

.. java:method:: public Object getSource()
   :outertype: SFRMRequest

   Gets the source which initiated this request.

   :return: the source which initiated this request.

setMessage
^^^^^^^^^^

.. java:method::  void setMessage(SFRMMessage message)
   :outertype: SFRMRequest

   Sets the SOAP message of this request.

   :param message: the SOAP message of this request.

setSource
^^^^^^^^^

.. java:method::  void setSource(Object source)
   :outertype: SFRMRequest

   Sets the source which initiated this request.

   :param source: the source which initiated this request.


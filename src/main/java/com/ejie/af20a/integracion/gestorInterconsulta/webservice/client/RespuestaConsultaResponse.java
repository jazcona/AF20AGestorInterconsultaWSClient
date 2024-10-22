
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaConsultaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaConsultaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuestaConsultaResponse" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}respuestaConsultaResponseWrapper" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaConsultaResponse", propOrder = {
    "respuestaConsultaResponse"
})
public class RespuestaConsultaResponse {

    @XmlElement(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice")
    protected RespuestaConsultaResponseWrapper respuestaConsultaResponse;

    /**
     * Obtiene el valor de la propiedad respuestaConsultaResponse.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultaResponseWrapper }
     *     
     */
    public RespuestaConsultaResponseWrapper getRespuestaConsultaResponse() {
        return respuestaConsultaResponse;
    }

    /**
     * Define el valor de la propiedad respuestaConsultaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaResponseWrapper }
     *     
     */
    public void setRespuestaConsultaResponse(RespuestaConsultaResponseWrapper value) {
        this.respuestaConsultaResponse = value;
    }

}

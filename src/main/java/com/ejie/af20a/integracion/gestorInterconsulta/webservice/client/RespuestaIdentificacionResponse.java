
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaIdentificacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaIdentificacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuestaIdentificacionResponse" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}respuestaIdentificacionResponseWrapper" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaIdentificacionResponse", propOrder = {
    "respuestaIdentificacionResponse"
})
public class RespuestaIdentificacionResponse {

    @XmlElement(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice")
    protected RespuestaIdentificacionResponseWrapper respuestaIdentificacionResponse;

    /**
     * Obtiene el valor de la propiedad respuestaIdentificacionResponse.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaIdentificacionResponseWrapper }
     *     
     */
    public RespuestaIdentificacionResponseWrapper getRespuestaIdentificacionResponse() {
        return respuestaIdentificacionResponse;
    }

    /**
     * Define el valor de la propiedad respuestaIdentificacionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaIdentificacionResponseWrapper }
     *     
     */
    public void setRespuestaIdentificacionResponse(RespuestaIdentificacionResponseWrapper value) {
        this.respuestaIdentificacionResponse = value;
    }

}

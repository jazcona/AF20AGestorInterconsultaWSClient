
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para realizarInterconsultaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="realizarInterconsultaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="realizarInterconsultaResponse" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}realizarInterconsultaResponseWrapper" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realizarInterconsultaResponse", propOrder = {
    "realizarInterconsultaResponse"
})
public class RealizarInterconsultaResponse {

    @XmlElement(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice")
    protected RealizarInterconsultaResponseWrapper realizarInterconsultaResponse;

    /**
     * Obtiene el valor de la propiedad realizarInterconsultaResponse.
     * 
     * @return
     *     possible object is
     *     {@link RealizarInterconsultaResponseWrapper }
     *     
     */
    public RealizarInterconsultaResponseWrapper getRealizarInterconsultaResponse() {
        return realizarInterconsultaResponse;
    }

    /**
     * Define el valor de la propiedad realizarInterconsultaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link RealizarInterconsultaResponseWrapper }
     *     
     */
    public void setRealizarInterconsultaResponse(RealizarInterconsultaResponseWrapper value) {
        this.realizarInterconsultaResponse = value;
    }

}

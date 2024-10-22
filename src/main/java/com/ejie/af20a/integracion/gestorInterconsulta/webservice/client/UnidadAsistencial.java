
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para unidadAsistencial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="unidadAsistencial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idUnidadAsistencial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descUnidadAsistencialCas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descUnidadAsistencialEus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unidadAsistencial", propOrder = {
    "idUnidadAsistencial",
    "descUnidadAsistencialCas",
    "descUnidadAsistencialEus"
})
public class UnidadAsistencial {

    @XmlElement(required = true)
    protected String idUnidadAsistencial;
    @XmlElement(required = true)
    protected String descUnidadAsistencialCas;
    @XmlElement(required = true)
    protected String descUnidadAsistencialEus;

    /**
     * Obtiene el valor de la propiedad idUnidadAsistencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidadAsistencial() {
        return idUnidadAsistencial;
    }

    /**
     * Define el valor de la propiedad idUnidadAsistencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidadAsistencial(String value) {
        this.idUnidadAsistencial = value;
    }

    /**
     * Obtiene el valor de la propiedad descUnidadAsistencialCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescUnidadAsistencialCas() {
        return descUnidadAsistencialCas;
    }

    /**
     * Define el valor de la propiedad descUnidadAsistencialCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescUnidadAsistencialCas(String value) {
        this.descUnidadAsistencialCas = value;
    }

    /**
     * Obtiene el valor de la propiedad descUnidadAsistencialEus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescUnidadAsistencialEus() {
        return descUnidadAsistencialEus;
    }

    /**
     * Define el valor de la propiedad descUnidadAsistencialEus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescUnidadAsistencialEus(String value) {
        this.descUnidadAsistencialEus = value;
    }

}

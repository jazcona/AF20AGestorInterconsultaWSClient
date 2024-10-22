
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para af20ADetallesError complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="af20ADetallesError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descCas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descEus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "af20ADetallesError", propOrder = {
    "codError",
    "descCas",
    "descEus"
})
public class Af20ADetallesError {

    protected String codError;
    protected String descCas;
    protected String descEus;

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad descCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCas() {
        return descCas;
    }

    /**
     * Define el valor de la propiedad descCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCas(String value) {
        this.descCas = value;
    }

    /**
     * Obtiene el valor de la propiedad descEus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEus() {
        return descEus;
    }

    /**
     * Define el valor de la propiedad descEus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEus(String value) {
        this.descEus = value;
    }

}

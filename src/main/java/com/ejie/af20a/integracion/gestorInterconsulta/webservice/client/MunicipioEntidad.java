
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para municipioEntidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="municipioEntidad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descMunicipio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipioEntidad", propOrder = {
    "idMunicipio",
    "descMunicipio"
})
public class MunicipioEntidad {

    @XmlElement(required = true)
    protected String idMunicipio;
    @XmlElement(required = true)
    protected String descMunicipio;

    /**
     * Obtiene el valor de la propiedad idMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMunicipio() {
        return idMunicipio;
    }

    /**
     * Define el valor de la propiedad idMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMunicipio(String value) {
        this.idMunicipio = value;
    }

    /**
     * Obtiene el valor de la propiedad descMunicipio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMunicipio() {
        return descMunicipio;
    }

    /**
     * Define el valor de la propiedad descMunicipio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMunicipio(String value) {
        this.descMunicipio = value;
    }

}

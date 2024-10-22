
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personaSanitaria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personaSanitaria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoIdentificacionPersonaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroIdentificacionPersonaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombrePersonaSanitaria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personaSanitaria", propOrder = {
    "tipoIdentificacionPersonaSanitaria",
    "numeroIdentificacionPersonaSanitaria",
    "nombrePersonaSanitaria"
})
public class PersonaSanitaria {

    @XmlElement(required = true)
    protected String tipoIdentificacionPersonaSanitaria;
    @XmlElement(required = true)
    protected String numeroIdentificacionPersonaSanitaria;
    @XmlElement(required = true)
    protected String nombrePersonaSanitaria;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionPersonaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionPersonaSanitaria() {
        return tipoIdentificacionPersonaSanitaria;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionPersonaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionPersonaSanitaria(String value) {
        this.tipoIdentificacionPersonaSanitaria = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionPersonaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionPersonaSanitaria() {
        return numeroIdentificacionPersonaSanitaria;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionPersonaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionPersonaSanitaria(String value) {
        this.numeroIdentificacionPersonaSanitaria = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePersonaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePersonaSanitaria() {
        return nombrePersonaSanitaria;
    }

    /**
     * Define el valor de la propiedad nombrePersonaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePersonaSanitaria(String value) {
        this.nombrePersonaSanitaria = value;
    }

}

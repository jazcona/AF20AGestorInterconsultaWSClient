
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para trabajadorSocial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="trabajadorSocial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoIdentificacionTrabajadorSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numeroIdentificacionTrabajadorSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombreTrabajadorSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trabajadorSocial", propOrder = {
    "tipoIdentificacionTrabajadorSocial",
    "numeroIdentificacionTrabajadorSocial",
    "nombreTrabajadorSocial"
})
public class TrabajadorSocial {

    @XmlElement(required = true)
    protected String tipoIdentificacionTrabajadorSocial;
    @XmlElement(required = true)
    protected String numeroIdentificacionTrabajadorSocial;
    @XmlElement(required = true)
    protected String nombreTrabajadorSocial;

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionTrabajadorSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionTrabajadorSocial() {
        return tipoIdentificacionTrabajadorSocial;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionTrabajadorSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionTrabajadorSocial(String value) {
        this.tipoIdentificacionTrabajadorSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacionTrabajadorSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentificacionTrabajadorSocial() {
        return numeroIdentificacionTrabajadorSocial;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacionTrabajadorSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentificacionTrabajadorSocial(String value) {
        this.numeroIdentificacionTrabajadorSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTrabajadorSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTrabajadorSocial() {
        return nombreTrabajadorSocial;
    }

    /**
     * Define el valor de la propiedad nombreTrabajadorSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTrabajadorSocial(String value) {
        this.nombreTrabajadorSocial = value;
    }

}

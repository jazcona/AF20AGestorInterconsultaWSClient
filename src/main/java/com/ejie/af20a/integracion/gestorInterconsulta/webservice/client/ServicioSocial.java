
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para servicioSocial complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="servicioSocial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idServicioSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descServicioSocialCas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descServicioSocialEus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicioSocial", propOrder = {
    "idServicioSocial",
    "descServicioSocialCas",
    "descServicioSocialEus"
})
public class ServicioSocial {

    @XmlElement(required = true)
    protected String idServicioSocial;
    @XmlElement(required = true)
    protected String descServicioSocialCas;
    @XmlElement(required = true)
    protected String descServicioSocialEus;

    /**
     * Obtiene el valor de la propiedad idServicioSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicioSocial() {
        return idServicioSocial;
    }

    /**
     * Define el valor de la propiedad idServicioSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicioSocial(String value) {
        this.idServicioSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad descServicioSocialCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescServicioSocialCas() {
        return descServicioSocialCas;
    }

    /**
     * Define el valor de la propiedad descServicioSocialCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescServicioSocialCas(String value) {
        this.descServicioSocialCas = value;
    }

    /**
     * Obtiene el valor de la propiedad descServicioSocialEus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescServicioSocialEus() {
        return descServicioSocialEus;
    }

    /**
     * Define el valor de la propiedad descServicioSocialEus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescServicioSocialEus(String value) {
        this.descServicioSocialEus = value;
    }

}


package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaIdentificacionRequestWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaIdentificacionRequestWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCaso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descEstadoCas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descEstadoEus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="servicioSocial" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}servicioSocial" minOccurs="0"/&gt;
 *         &lt;element name="trabajadorSocial" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}trabajadorSocial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaIdentificacionRequestWrapper", propOrder = {
    "idCaso",
    "idPeticion",
    "codEntidad",
    "estado",
    "descEstadoCas",
    "descEstadoEus",
    "servicioSocial",
    "trabajadorSocial"
})
public class RespuestaIdentificacionRequestWrapper {

    @XmlElement(required = true)
    protected String idCaso;
    @XmlElement(required = true)
    protected String idPeticion;
    @XmlElement(required = true)
    protected String codEntidad;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String descEstadoCas;
    @XmlElement(required = true)
    protected String descEstadoEus;
    protected ServicioSocial servicioSocial;
    protected TrabajadorSocial trabajadorSocial;

    /**
     * Obtiene el valor de la propiedad idCaso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCaso() {
        return idCaso;
    }

    /**
     * Define el valor de la propiedad idCaso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCaso(String value) {
        this.idCaso = value;
    }

    /**
     * Obtiene el valor de la propiedad idPeticion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPeticion() {
        return idPeticion;
    }

    /**
     * Define el valor de la propiedad idPeticion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPeticion(String value) {
        this.idPeticion = value;
    }

    /**
     * Obtiene el valor de la propiedad codEntidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEntidad() {
        return codEntidad;
    }

    /**
     * Define el valor de la propiedad codEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEntidad(String value) {
        this.codEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstadoCas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstadoCas() {
        return descEstadoCas;
    }

    /**
     * Define el valor de la propiedad descEstadoCas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstadoCas(String value) {
        this.descEstadoCas = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstadoEus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstadoEus() {
        return descEstadoEus;
    }

    /**
     * Define el valor de la propiedad descEstadoEus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstadoEus(String value) {
        this.descEstadoEus = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioSocial.
     * 
     * @return
     *     possible object is
     *     {@link ServicioSocial }
     *     
     */
    public ServicioSocial getServicioSocial() {
        return servicioSocial;
    }

    /**
     * Define el valor de la propiedad servicioSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicioSocial }
     *     
     */
    public void setServicioSocial(ServicioSocial value) {
        this.servicioSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad trabajadorSocial.
     * 
     * @return
     *     possible object is
     *     {@link TrabajadorSocial }
     *     
     */
    public TrabajadorSocial getTrabajadorSocial() {
        return trabajadorSocial;
    }

    /**
     * Define el valor de la propiedad trabajadorSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link TrabajadorSocial }
     *     
     */
    public void setTrabajadorSocial(TrabajadorSocial value) {
        this.trabajadorSocial = value;
    }

}

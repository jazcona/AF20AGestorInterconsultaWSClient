
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaConsultaResponseWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaConsultaResponseWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCaso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descEstadoCas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descEstadoEus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detallesError" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}af20ADetallesError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaConsultaResponseWrapper", propOrder = {
    "idCaso",
    "idPeticion",
    "estado",
    "descEstadoCas",
    "descEstadoEus",
    "detallesError"
})
public class RespuestaConsultaResponseWrapper {

    @XmlElement(required = true)
    protected String idCaso;
    @XmlElement(required = true)
    protected String idPeticion;
    @XmlElement(required = true)
    protected String estado;
    @XmlElement(required = true)
    protected String descEstadoCas;
    @XmlElement(required = true)
    protected String descEstadoEus;
    protected List<Af20ADetallesError> detallesError;

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
     * Gets the value of the detallesError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallesError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallesError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Af20ADetallesError }
     * 
     * 
     */
    public List<Af20ADetallesError> getDetallesError() {
        if (detallesError == null) {
            detallesError = new ArrayList<Af20ADetallesError>();
        }
        return this.detallesError;
    }

}


package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para respuestaConsultaRequestWrapper complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="respuestaConsultaRequestWrapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCaso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="categorizacionRespuesta" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}categoriaRespuesta" maxOccurs="unbounded"/&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trabajadorSocial" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}trabajadorSocial" minOccurs="0"/&gt;
 *         &lt;element name="personaSanitaria" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}personaSanitaria" minOccurs="0"/&gt;
 *         &lt;element name="unidadAsistencial" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}unidadAsistencial" minOccurs="0"/&gt;
 *         &lt;element name="municipioEntidad" type="{http://ejie.com/af20a.integracion.gestorInterconsulta.webservice}municipioEntidad"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaConsultaRequestWrapper", propOrder = {
    "idCaso",
    "codEntidad",
    "idPeticion",
    "categorizacionRespuesta",
    "respuesta",
    "trabajadorSocial",
    "personaSanitaria",
    "unidadAsistencial",
    "municipioEntidad"
})
public class RespuestaConsultaRequestWrapper {

    @XmlElement(required = true)
    protected String idCaso;
    @XmlElement(required = true)
    protected String codEntidad;
    @XmlElement(required = true)
    protected String idPeticion;
    @XmlElement(required = true)
    protected List<CategoriaRespuesta> categorizacionRespuesta;
    @XmlElement(required = true)
    protected String respuesta;
    protected TrabajadorSocial trabajadorSocial;
    protected PersonaSanitaria personaSanitaria;
    protected UnidadAsistencial unidadAsistencial;
    @XmlElement(required = true)
    protected MunicipioEntidad municipioEntidad;

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
     * Gets the value of the categorizacionRespuesta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorizacionRespuesta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorizacionRespuesta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriaRespuesta }
     * 
     * 
     */
    public List<CategoriaRespuesta> getCategorizacionRespuesta() {
        if (categorizacionRespuesta == null) {
            categorizacionRespuesta = new ArrayList<CategoriaRespuesta>();
        }
        return this.categorizacionRespuesta;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
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

    /**
     * Obtiene el valor de la propiedad personaSanitaria.
     * 
     * @return
     *     possible object is
     *     {@link PersonaSanitaria }
     *     
     */
    public PersonaSanitaria getPersonaSanitaria() {
        return personaSanitaria;
    }

    /**
     * Define el valor de la propiedad personaSanitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaSanitaria }
     *     
     */
    public void setPersonaSanitaria(PersonaSanitaria value) {
        this.personaSanitaria = value;
    }

    /**
     * Obtiene el valor de la propiedad unidadAsistencial.
     * 
     * @return
     *     possible object is
     *     {@link UnidadAsistencial }
     *     
     */
    public UnidadAsistencial getUnidadAsistencial() {
        return unidadAsistencial;
    }

    /**
     * Define el valor de la propiedad unidadAsistencial.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadAsistencial }
     *     
     */
    public void setUnidadAsistencial(UnidadAsistencial value) {
        this.unidadAsistencial = value;
    }

    /**
     * Obtiene el valor de la propiedad municipioEntidad.
     * 
     * @return
     *     possible object is
     *     {@link MunicipioEntidad }
     *     
     */
    public MunicipioEntidad getMunicipioEntidad() {
        return municipioEntidad;
    }

    /**
     * Define el valor de la propiedad municipioEntidad.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipioEntidad }
     *     
     */
    public void setMunicipioEntidad(MunicipioEntidad value) {
        this.municipioEntidad = value;
    }

}

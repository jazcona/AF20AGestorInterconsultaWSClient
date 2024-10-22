
package com.ejie.af20a.integracion.gestorInterconsulta.webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ejie.af20a.integracion.gestorInterconsulta.webservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RealizarInterconsultaRequest_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "realizarInterconsultaRequest");
    private final static QName _RealizarInterconsultaResponse_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "realizarInterconsultaResponse");
    private final static QName _RespuestaConsultaRequest_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "respuestaConsultaRequest");
    private final static QName _RespuestaConsultaResponse_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "respuestaConsultaResponse");
    private final static QName _RespuestaIdentificacionRequest_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "respuestaIdentificacionRequest");
    private final static QName _RespuestaIdentificacionResponse_QNAME = new QName("http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", "respuestaIdentificacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ejie.af20a.integracion.gestorInterconsulta.webservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RealizarInterconsultaRequest }
     * 
     */
    public RealizarInterconsultaRequest createRealizarInterconsultaRequest() {
        return new RealizarInterconsultaRequest();
    }

    /**
     * Create an instance of {@link RealizarInterconsultaResponse }
     * 
     */
    public RealizarInterconsultaResponse createRealizarInterconsultaResponse() {
        return new RealizarInterconsultaResponse();
    }

    /**
     * Create an instance of {@link RespuestaConsultaRequestWrapper }
     * 
     */
    public RespuestaConsultaRequestWrapper createRespuestaConsultaRequestWrapper() {
        return new RespuestaConsultaRequestWrapper();
    }

    /**
     * Create an instance of {@link RespuestaConsultaResponse }
     * 
     */
    public RespuestaConsultaResponse createRespuestaConsultaResponse() {
        return new RespuestaConsultaResponse();
    }

    /**
     * Create an instance of {@link RespuestaIdentificacionRequestWrapper }
     * 
     */
    public RespuestaIdentificacionRequestWrapper createRespuestaIdentificacionRequestWrapper() {
        return new RespuestaIdentificacionRequestWrapper();
    }

    /**
     * Create an instance of {@link RespuestaIdentificacionResponse }
     * 
     */
    public RespuestaIdentificacionResponse createRespuestaIdentificacionResponse() {
        return new RespuestaIdentificacionResponse();
    }

    /**
     * Create an instance of {@link ServicioSocial }
     * 
     */
    public ServicioSocial createServicioSocial() {
        return new ServicioSocial();
    }

    /**
     * Create an instance of {@link TrabajadorSocial }
     * 
     */
    public TrabajadorSocial createTrabajadorSocial() {
        return new TrabajadorSocial();
    }

    /**
     * Create an instance of {@link RespuestaIdentificacionResponseWrapper }
     * 
     */
    public RespuestaIdentificacionResponseWrapper createRespuestaIdentificacionResponseWrapper() {
        return new RespuestaIdentificacionResponseWrapper();
    }

    /**
     * Create an instance of {@link Af20ADetallesError }
     * 
     */
    public Af20ADetallesError createAf20ADetallesError() {
        return new Af20ADetallesError();
    }

    /**
     * Create an instance of {@link CategoriaConsulta }
     * 
     */
    public CategoriaConsulta createCategoriaConsulta() {
        return new CategoriaConsulta();
    }

    /**
     * Create an instance of {@link UnidadAsistencial }
     * 
     */
    public UnidadAsistencial createUnidadAsistencial() {
        return new UnidadAsistencial();
    }

    /**
     * Create an instance of {@link MunicipioEntidad }
     * 
     */
    public MunicipioEntidad createMunicipioEntidad() {
        return new MunicipioEntidad();
    }

    /**
     * Create an instance of {@link PersonaSanitaria }
     * 
     */
    public PersonaSanitaria createPersonaSanitaria() {
        return new PersonaSanitaria();
    }

    /**
     * Create an instance of {@link Ciudadano }
     * 
     */
    public Ciudadano createCiudadano() {
        return new Ciudadano();
    }

    /**
     * Create an instance of {@link RealizarInterconsultaResponseWrapper }
     * 
     */
    public RealizarInterconsultaResponseWrapper createRealizarInterconsultaResponseWrapper() {
        return new RealizarInterconsultaResponseWrapper();
    }

    /**
     * Create an instance of {@link CategoriaRespuesta }
     * 
     */
    public CategoriaRespuesta createCategoriaRespuesta() {
        return new CategoriaRespuesta();
    }

    /**
     * Create an instance of {@link RespuestaConsultaResponseWrapper }
     * 
     */
    public RespuestaConsultaResponseWrapper createRespuestaConsultaResponseWrapper() {
        return new RespuestaConsultaResponseWrapper();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarInterconsultaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealizarInterconsultaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "realizarInterconsultaRequest")
    public JAXBElement<RealizarInterconsultaRequest> createRealizarInterconsultaRequest(RealizarInterconsultaRequest value) {
        return new JAXBElement<RealizarInterconsultaRequest>(_RealizarInterconsultaRequest_QNAME, RealizarInterconsultaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealizarInterconsultaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealizarInterconsultaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "realizarInterconsultaResponse")
    public JAXBElement<RealizarInterconsultaResponse> createRealizarInterconsultaResponse(RealizarInterconsultaResponse value) {
        return new JAXBElement<RealizarInterconsultaResponse>(_RealizarInterconsultaResponse_QNAME, RealizarInterconsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaRequestWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaRequestWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "respuestaConsultaRequest")
    public JAXBElement<RespuestaConsultaRequestWrapper> createRespuestaConsultaRequest(RespuestaConsultaRequestWrapper value) {
        return new JAXBElement<RespuestaConsultaRequestWrapper>(_RespuestaConsultaRequest_QNAME, RespuestaConsultaRequestWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaConsultaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "respuestaConsultaResponse")
    public JAXBElement<RespuestaConsultaResponse> createRespuestaConsultaResponse(RespuestaConsultaResponse value) {
        return new JAXBElement<RespuestaConsultaResponse>(_RespuestaConsultaResponse_QNAME, RespuestaConsultaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaIdentificacionRequestWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaIdentificacionRequestWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "respuestaIdentificacionRequest")
    public JAXBElement<RespuestaIdentificacionRequestWrapper> createRespuestaIdentificacionRequest(RespuestaIdentificacionRequestWrapper value) {
        return new JAXBElement<RespuestaIdentificacionRequestWrapper>(_RespuestaIdentificacionRequest_QNAME, RespuestaIdentificacionRequestWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaIdentificacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaIdentificacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ejie.com/af20a.integracion.gestorInterconsulta.webservice", name = "respuestaIdentificacionResponse")
    public JAXBElement<RespuestaIdentificacionResponse> createRespuestaIdentificacionResponse(RespuestaIdentificacionResponse value) {
        return new JAXBElement<RespuestaIdentificacionResponse>(_RespuestaIdentificacionResponse_QNAME, RespuestaIdentificacionResponse.class, null, value);
    }

}

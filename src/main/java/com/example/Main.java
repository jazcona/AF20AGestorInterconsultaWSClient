package com.example;

import javax.xml.ws.BindingProvider;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import javax.xml.ws.handler.Handler;

import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.CategoriaConsulta;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.Ciudadano;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.GestorInterconsultaWebService;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.GestorInterconsultaWebServiceImpl;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.MunicipioEntidad;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.RealizarInterconsultaRequest;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.RealizarInterconsultaResponse;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.RealizarInterconsultaResponseWrapper;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.ServicioSocial;
import com.ejie.af20a.integracion.gestorInterconsulta.webservice.client.TrabajadorSocial;



public class Main {
    public static void main(String[] args) {
        System.out.println("Llamada a WS Gestor Interconsulta");
        
        //populate InterconsultaRequest
        RealizarInterconsultaRequest request = new RealizarInterconsultaRequest();
 
        CategoriaConsulta catConsulta = new CategoriaConsulta();
        catConsulta.setIdCategoria(1);
        request.getCategorizacionConsulta().add(catConsulta);
        MunicipioEntidad municipioEntidad = new MunicipioEntidad();
        municipioEntidad.setIdMunicipio("48020");
        municipioEntidad.setDescMunicipio("Bilbo");
        request.setMunicipioEntidad(municipioEntidad);
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setTipoIdentificacion("1");
        ciudadano.setNumIdentificacion("44678478N");
        ciudadano.setNombre("Geronima");
        ciudadano.setApellido1("Stilton");
        ciudadano.setApellido2("Robertson");
        ciudadano.setTelefono("696000000");
        ciudadano.setFechaNacimiento("20000202");
        ciudadano.setDomicilio("Calle de allí, 11");
        ciudadano.setTis("000000");
        ciudadano.setNss("123456");
        ciudadano.setEsMenor("N");
        request.setCiudadano(ciudadano);
        TrabajadorSocial trabajadorSocial = new TrabajadorSocial();
        trabajadorSocial.setTipoIdentificacionTrabajadorSocial("1");
        trabajadorSocial.setNumeroIdentificacionTrabajadorSocial("46789287L");
        trabajadorSocial.setNombreTrabajadorSocial("Apellido1_TS Apellido2_TS, Nombre_TS");
        request.setTrabajadorSocial(trabajadorSocial);
        ServicioSocial servicioSocial = new ServicioSocial();
        servicioSocial.setIdServicioSocial("7");
        servicioSocial.setDescServicioSocialCas("ES_Bermeo");
        servicioSocial.setDescServicioSocialEus("EU_Bermeo");
        request.setServicioSocial(servicioSocial);

        request.setCodEntidad("Servicios Sociales de Bermeo");
        request.setConsulta("Consulta de prueba SOCIAL");

        //call service
        Main main = new Main();
        main.callRealizarInterconsulta(request);
    }

    private void callRealizarInterconsulta(RealizarInterconsultaRequest request) {
        try {
        	System.out.println(this.getClass().getName()+":callRealizarInterconsulta: INICIO");
    		GestorInterconsultaWebService service = new GestorInterconsultaWebService();
            GestorInterconsultaWebServiceImpl port = service.getGestorInterconsultaWebServicePort();
             
            BindingProvider bindingProvider = (BindingProvider) port;
            
            Map<String, Object> requestContext = bindingProvider.getRequestContext();
            requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://svc.integracion.des.ejgv.jaso:443/ctxweb/secured_ssl/AF20AGestorInterconsulta");
            // requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080");
            //add WSSecurityHeaderSOAPHandler to the handler chain
            List<Handler> handlerChain = new ArrayList<Handler>();
            handlerChain.add(new WSSecurityHeaderSOAPHandler("XC219", "XC219"));
            bindingProvider.getBinding().setHandlerChain(handlerChain);
            
	        RealizarInterconsultaResponse response = port.realizarInterconsulta(request);
            RealizarInterconsultaResponseWrapper responseWrapper = response.getRealizarInterconsultaResponse();

            //print response data
            System.out.println("idCaso: " + responseWrapper.getIdCaso());
            System.out.println("idPeticion: " + responseWrapper.getIdPeticion());
            System.out.println("estado: " + responseWrapper.getEstado());
            System.out.println("descEstadoCas: " + responseWrapper.getDescEstadoCas());
            System.out.println("descEstadoEus: " + responseWrapper.getDescEstadoEus());
            System.out.println("DetallesError: " + responseWrapper.getDetallesError());
            
	        System.out.println(this.getClass().getName()+":callRealizarInterconsulta: FIN");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
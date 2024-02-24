package com.prueba.servicioSOAPGN.client;

import com.prueba.servicioSOAPGN.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class SOAPClient extends WebServiceGatewaySupport {

    private static final String url = "https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx";
    private static final String urlServicios = "http://www.banguat.gob.gt/variables/ws/";

    /**
     * @apiNote = "Metodo para obtener del servicio SOAP el tipo de cambio por rango de fechas"
     * @param fechaIni
     * @param fechaFin
     * @return
     * */
    public TipoCambioRangoResponse tipoCambioRangoResponse(String fechaIni, String fechaFin){
        TipoCambioRango tipoCambioRango = new TipoCambioRango();
        tipoCambioRango.setFechainit(fechaIni);
        tipoCambioRango.setFechafin(fechaFin);

        SoapActionCallback soapActionCallback = new SoapActionCallback(urlServicios.concat("TipoCambioRango"));

        TipoCambioRangoResponse tipoCambioRangoResponse = (TipoCambioRangoResponse) getWebServiceTemplate().marshalSendAndReceive(url, tipoCambioRango, soapActionCallback);

        return tipoCambioRangoResponse;
    }

    /**
     * @apiNote = "Metodo para obtener el tipo de cambio del día en String"
     * */
    public TipoCambioDiaStringResponse tipoCambioDiaStringResponse(){
        TipoCambioDiaString tipoCambioDiaString = new TipoCambioDiaString();
        tipoCambioDiaString.toString();

        SoapActionCallback soapActionCallback = new SoapActionCallback(urlServicios.concat("TipoCambioDiaString"));

        TipoCambioDiaStringResponse tipoCambioDiaStringResponse = (TipoCambioDiaStringResponse) getWebServiceTemplate().marshalSendAndReceive(url, tipoCambioDiaString, soapActionCallback);

        return tipoCambioDiaStringResponse;
    }

    /**
     * @apiNote = "Metodo para obtener el tipo de cambio del día"
     * */
    public TipoCambioDiaResponse tipoCambioDiaResponse(){
        TipoCambioDia tipoCambioDia = new TipoCambioDia();

        SoapActionCallback soapActionCallback = new SoapActionCallback(urlServicios.concat("TipoCambioDia"));

        TipoCambioDiaResponse tipoCambioDiaResponse = (TipoCambioDiaResponse) getWebServiceTemplate().marshalSendAndReceive(url, tipoCambioDia, soapActionCallback);

        return tipoCambioDiaResponse;

    }

    /**
     * @apiNote = "Metodo para obtener el tipo de cambio desde una fecha de inicio"
     * @param fecha
     * @return
     * */
    public TipoCambioFechaInicialResponse tipoCambioFechaInicialResponse(String fecha){

        TipoCambioFechaInicial tipoCambioFechaInicial = new TipoCambioFechaInicial();
        tipoCambioFechaInicial.setFechainit(fecha);

        SoapActionCallback soapActionCallback = new SoapActionCallback(urlServicios.concat("TipoCambioFechaInicial"));
        TipoCambioFechaInicialResponse tipoCambioFechaInicialResponse = (TipoCambioFechaInicialResponse) getWebServiceTemplate().marshalSendAndReceive(url, tipoCambioFechaInicial, soapActionCallback);

        return tipoCambioFechaInicialResponse;
    }


}

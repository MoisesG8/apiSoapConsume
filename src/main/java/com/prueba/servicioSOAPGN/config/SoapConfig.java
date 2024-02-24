package com.prueba.servicioSOAPGN.config;

import com.prueba.servicioSOAPGN.client.SOAPClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("com.prueba.servicioSOAPGN.wsdl");

        return  marshaller;
    }

    @Bean
    public SOAPClient obtenerClienteSoap(Jaxb2Marshaller marshaller){
        SOAPClient soapClient = new SOAPClient();

        soapClient.setDefaultUri("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx");
        soapClient.setMarshaller(marshaller);

        soapClient.setUnmarshaller(marshaller);

        return soapClient;
    }
}

package com.prueba.servicioSOAPGN;

import com.prueba.servicioSOAPGN.client.SOAPClient;
import com.prueba.servicioSOAPGN.services.TiposDeCambioService;
import com.prueba.servicioSOAPGN.wsdl.*;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ServicioSoapgnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServicioSoapgnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ServicioSoapgnApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SOAPClient soapClient) {

		return args -> {
			/*TipoCambioRangoResponse tipoCambioRangoResponse = soapClient.tipoCambioRangoResponse("01/02/2024", "05/02/2024");

			List <Var> datos = tipoCambioRangoResponse.getTipoCambioRangoResult().getVars().getVar();

			for (Var e : datos){

				LOGGER.info("Venta {}", e.getVenta());
				LOGGER.info("Compra {}", e.getCompra());
				LOGGER.info("Fecha {}", e.getFecha());
				LOGGER.info("MONEDA {}", e.getMoneda());
			}*/


			/*for(VarDolar var : valorDolares){
				LOGGER.info(var.getFecha());
				LOGGER.info(var.getReferencia()+"");
			}*/

			//LOGGER.info("El tipo de cambio del dia es: {}", tipoCambioDiaResponse.getTipoCambioDiaResult().getCambioDolar().getVarDolar().get(0).getReferencia());

			//LOGGER.info("El tipo de cambio del dia es: {}", tipoCambioDiaStringResponse.getTipoCambioDiaStringResult());

			//LOGGER.info("El resultado es {}", tipoCambioRangoResponse.getTipoCambioRangoResult().getVars().getVar().get(1).getCompra());
		};

	}

}
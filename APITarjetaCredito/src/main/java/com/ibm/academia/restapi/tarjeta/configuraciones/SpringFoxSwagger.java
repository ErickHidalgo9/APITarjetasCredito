package com.ibm.academia.restapi.tarjeta.configuraciones;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxSwagger {

	@Bean
	public Docket getDocket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.ibm.academia.restapi.tarjeta.controlador"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Tarjeta Credito Backend API", 
				"Api para el manejo de Tarjetas",
				"V1",
				"Terminos del servicio", 
				new Contact("Erick Hidalgo Sanchez", "Slack:@ErickHidalgoSanchez", "erick.hidalgos@hotmail.com"),
				"Licencia de API", "Api licencia url", Collections.emptyList()
				
				);
	}
}

package io.github.educarv.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.bannerMode(Banner.Mode.OFF); // Desativa o banner do Spring Boot
		builder.profiles("producao", "homologacao"); // Define o perfil de produção
		// builder.properties("spring.config.name=application,application-prod"); // Define os arquivos de configuração a serem usados	

		builder.run(args); //Para acessar o contexto da aplicação, é necessário chamar o método run() do SpringApplicationBuilder, que retorna um objeto ConfigurableApplicationContext.
		
		// contexto da aplicacao ja iniciada
		ConfigurableApplicationContext applicationContext = builder.context();		
		// var produtoRepository = context.getBean("produtoRepository"); //Acessa o bean do repositório de produtos


		ConfigurableEnvironment enviromentContext = applicationContext.getEnvironment();
		String applicationName = enviromentContext.getProperty("spring.application.name");
		System.out.println("Nome da aplicação: " + applicationName);
		
	}

}

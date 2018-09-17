package com.app.webapp;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.ComponentScan;
		import org.springframework.context.annotation.Configuration;
		import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories("com.app.webapp.Repositories")
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
}

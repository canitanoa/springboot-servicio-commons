package ar.com.springboot.ms.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootServicioCommonsApplication {

	// Se comenta ya que este proyecto funciona como libreria 
	//	public static void main(String[] args) {
	//		SpringApplication.run(SpringbootServicioCommonsApplication.class, args);
	//	}

}

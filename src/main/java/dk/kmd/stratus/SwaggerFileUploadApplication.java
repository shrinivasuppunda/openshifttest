package dk.kmd.stratus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties()
public class SwaggerFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerFileUploadApplication.class, args);
		
	}

}

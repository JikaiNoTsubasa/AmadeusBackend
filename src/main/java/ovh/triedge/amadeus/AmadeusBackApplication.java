package ovh.triedge.amadeus;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ovh.triedge.amadeus")
public class AmadeusBackApplication {

	// SL4j
	//private static final Logger log = LoggerFactory.getLogger(AmadeusBackApplication.class);
	
	// http://localhost:8080/swagger-ui/index.html
    public static void main(String[] args) {
    	if (args.length < 2) {
    		System.err.println("Please provide database password and port");
    		System.exit(-1);
    	}
    	SpringApplication app = new SpringApplication(AmadeusBackApplication.class);
    	Properties prop = new Properties();
    	prop.put("spring.datasource.url", "jdbc:mysql://triedge.ovh:3306/amadeusv2");
    	prop.put("spring.datasource.username", "amadeusv2");
    	prop.put("spring.datasource.password", args[0]);
    	prop.put("spring.jpa.hibernate.ddl-auto", "update");
    	prop.put("server.port", args[1]);
    	app.setDefaultProperties(prop);
        app.run(new String[] {});
    }
}

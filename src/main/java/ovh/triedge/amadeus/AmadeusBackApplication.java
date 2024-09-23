package ovh.triedge.amadeus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmadeusBackApplication {

	// SL4j
	//private static final Logger log = LoggerFactory.getLogger(AmadeusBackApplication.class);
	
	// http://localhost:8080/swagger-ui/index.html
    public static void main(String[] args) {
        SpringApplication.run(AmadeusBackApplication.class, args);
    }
}

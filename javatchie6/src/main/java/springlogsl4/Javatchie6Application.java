package springlogsl4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Javatchie6Application {
	
	Logger log = LoggerFactory.getLogger(Javatchie6Application.class);
	
	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name)
	{
		log.debug("Request{}"+name);
		if(name.equalsIgnoreCase("test")){
			throw new RuntimeException("Runtime Exception Raised");
		}
		String response = "Hi "+name +"Welcome ";
		log.debug("Request{}"+response);
		return response;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Javatchie6Application.class, args);
	}

}

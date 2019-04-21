package main.java.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.MeterRegistry;



@RestController
public class GreetingController {
	Logger logger = LoggerFactory.getLogger(GreetingController.class);
	GreetingController(MeterRegistry meterRegistry) {
	       meterRegistry.gauge("users.current", (int)(Math.random()));
	    }
	
	@GetMapping("/")
	public String returnContent() {
		logger.info("A TRACE Message");
		return "ZF signs definitive agreement to acquire WABCO\r\n" + 
				"ZF and WABCO to form a leading global integrated systems provider for commercial vehicle technology with combined sales of approximately €40 billion\r\n" + 
				"Complementary capabilities of both companies to create added value for ZF’s commercial vehicle customers\r\n" + 
				"ZF to acquire WABCO for $136.50 per share for a total equity value of approximately $7 billion\r\n" + 
				"Closing expected for early 2020\r\n" + 
				"Planned acquisition approved by ZF’s Management Board and Supervisory Board and WABCO’s Board of Directors\r\n" + 
				"Friedrichshafen. ZF Friedrichshafen AG, a leading global technology group and supplier of mobility systems for passenger cars, commercial vehicles and industrial technology, today announced that it has entered into a definitive agreement to acquire WABCO (NYSE: WBC) for $136.50 per share. The planned acquisition has been approved by ZF’s Management Board and Supervisory Board and WABCO’s Board of Directors. Together, ZF and WABCO will form a leading global integrated mobility systems provider for commercial vehicles, creating added value for ZF’s commercial vehicle customers. The combined company will have sales of approximately €40 billion.";
	}
}
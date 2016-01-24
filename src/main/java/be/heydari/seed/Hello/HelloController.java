package be.heydari.seed.Hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Emad Heydari Beni
 */

@RequestMapping("/hello")
@RestController
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		return "Greetings from HTTPS-secured Spring Boot!";
	}
}

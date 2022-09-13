package dk.kmd.stratus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SwaggerRestController {

	@GetMapping("/swagger/{id}")
	public String swaggerTest(@PathVariable String id) {
		
		return "Success "+id;
	}
	@GetMapping("/new")
	public String swaggerTest1() {
		
		return "Success ";
	}
}

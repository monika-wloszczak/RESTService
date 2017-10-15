package pl.nn.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import pl.nn.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/info")
	
	public String getUser() throws Exception {

		String jsonn1 = userService.getInfo();
		
		System.out.println(jsonn1);
		return jsonn1;

	}
}

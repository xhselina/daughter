package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class LoginController {
	@RequestMapping(value = "showLoginJsp", method = { RequestMethod.GET, RequestMethod.POST })
	public String showLoginJsp() {
		return "login";
	}
}

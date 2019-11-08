package vercauteren.laurens.eurder.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vercauteren.laurens.eurder.service.UserService;

@Controller
public class UserController {

	UserService userService;

	@Autowired
	public UserController(UserService userService){
		this.userService = userService;
	}
}

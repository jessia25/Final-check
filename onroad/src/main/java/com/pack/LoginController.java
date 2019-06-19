package com.pack;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.form.CustomerLogin;

@Controller
public class LoginController {
@RequestMapping(value="/index")
public String registration(Map<String,Object> map) {
	map.put("registration",new CustomerLogin());
	return "registration";
}
}

package com.shopme;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MianController {
@GetMapping("")
public  String viewHomePage() {
	return "index";
}
}

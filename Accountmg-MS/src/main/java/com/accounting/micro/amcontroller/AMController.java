package com.accounting.micro.amcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("acc")
public class AMController {
	@GetMapping("/check")
		public String check()
		{
			return "hello 2";
			
		}

}

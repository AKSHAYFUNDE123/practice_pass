package com.tka.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {

	@GetMapping("check")
	String checks() {
		return "Checked successfully ";
	}
}

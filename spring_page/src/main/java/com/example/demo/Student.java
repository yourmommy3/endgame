package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Student {
	@RequestMapping("courses")
	public String display() {
		// System.out.println("Courses opted successfully");
		return "course";
	}

}

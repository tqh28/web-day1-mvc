package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.model.Person;

@Controller
@RequestMapping("/people")
public class PersonController {

	@GetMapping
	public String person(Model model) {

		Person person = new Person();
		person.setName("Huy");
		person.setAge(27);

		model.addAttribute("person", person);

		return "common/person";
	}
}

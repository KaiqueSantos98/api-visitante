package com.soprodivino.visitante.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestaRest {

	@RequestMapping(method = RequestMethod.GET)
	public String lista() {
		return "REST está funcionando!";
	}
}

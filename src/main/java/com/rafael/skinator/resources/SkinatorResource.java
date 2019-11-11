package com.rafael.skinator.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/skins")
public class SkinatorResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Lista de Skins";
	}

}

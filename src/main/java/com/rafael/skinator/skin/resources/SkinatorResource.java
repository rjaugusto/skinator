package com.rafael.skinator.skin.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.skinator.skin.domain.Exterior;
import com.rafael.skinator.skin.domain.Type;
import com.rafael.skinator.skin.services.SkinService;

@RestController
public class SkinatorResource {
	
	@Autowired
	private SkinService skinService;
	
	@RequestMapping(value="/skins" , method = RequestMethod.GET)
	public ResponseEntity<?>  list() {
		return ResponseEntity.ok(skinService.list());
	}
	
	@RequestMapping(value="/skin/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?>  find(@PathVariable Integer id) {
		return ResponseEntity.ok(skinService.find(id));
	}
	
	@RequestMapping(value="/exteriores" , method = RequestMethod.GET)
	public Exterior[] exteriores() {
		return Exterior.values();
	}
	
	@RequestMapping(value="/types" , method = RequestMethod.GET)
	public Type[] types() {
		return Type.values();
	}

}

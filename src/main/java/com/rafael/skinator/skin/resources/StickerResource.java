package com.rafael.skinator.skin.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.skinator.skin.domain.Exterior;
import com.rafael.skinator.skin.domain.Type;
import com.rafael.skinator.skin.services.StickerService;

@RestController
public class StickerResource {
	
	@Autowired
	private StickerService stickerService;
	
	@RequestMapping(value="/stickers" , method = RequestMethod.GET)
	public ResponseEntity<?>  list() {
		return ResponseEntity.ok(stickerService.list());
	}
	
	@RequestMapping(value="/sticker/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?>  find(@PathVariable Integer id) {
		return ResponseEntity.ok(stickerService.find(id));
	}

}

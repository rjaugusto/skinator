package com.rafael.skinator.skin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.skinator.skin.domain.Sticker;
import com.rafael.skinator.skin.repositores.StickerRepository;
import com.rafael.skinator.skin.services.exceptions.ObjectNotFoundException;

@Service
public class StickerService {
	
	@Autowired
	private StickerRepository stickerRepository;
	
	public Optional<Sticker> find(Integer id) {
		
		Optional<Sticker> sticker = stickerRepository.findById(id);
		
		if(!sticker.isPresent()) {
			throw new ObjectNotFoundException("Sticker com o ID " + id + " Não foi encontrada" );
		}
		
		return sticker;
	}
	
	public List<Sticker> list(){
		return stickerRepository.findAll();
	}

}

package com.rafael.skinator.skin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.skinator.skin.domain.Skin;
import com.rafael.skinator.skin.repositores.SkinRepository;
import com.rafael.skinator.skin.services.exceptions.ObjectNotFoundException;

@Service
public class SkinService {
	
	@Autowired
	private SkinRepository skinRepository;
	
	public Optional<Skin> find(Integer id) {
		
		Optional<Skin> skin = skinRepository.findById(id);
		
		if(!skin.isPresent()) {
			throw new ObjectNotFoundException("Skin com o ID " + id + " Não foi encontrada" );
		}
		
		return skin;
	}
	
	public List<Skin> list(){
		return skinRepository.findAll();
	}

}

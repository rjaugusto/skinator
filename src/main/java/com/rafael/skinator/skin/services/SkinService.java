package com.rafael.skinator.skin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.skinator.skin.domain.Skin;
import com.rafael.skinator.skin.repositores.SkinRepository;

@Service
public class SkinService {
	
	@Autowired
	private SkinRepository skinRepository;
	
	public Optional<Skin> find(Integer id) {
		return skinRepository.findById(id);
	}
	
	public List<Skin> list(){
		return skinRepository.findAll();
	}

}

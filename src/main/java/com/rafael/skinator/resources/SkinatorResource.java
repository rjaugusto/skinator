package com.rafael.skinator.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.skinator.domain.Exterior;
import com.rafael.skinator.domain.Skin;
import com.rafael.skinator.domain.StatTrack;
import com.rafael.skinator.domain.Type;

@RestController
public class SkinatorResource {
	
	@RequestMapping(value="/skins" , method = RequestMethod.GET)
	public List<Skin> list() {
		
		Skin skin = new Skin(1, "faquinha especial", Exterior.BATTLE_SCARRED, Type.KNIVE, StatTrack.S, 10.60, 0.1);
		Skin skin2 = new Skin(2, "Ak do Mal", Exterior.BATTLE_SCARRED, Type.KNIVE, StatTrack.S, 10.60, 0.1);
		
		List<Skin> skins = new ArrayList<Skin>();
		
		skins.add(skin);
		skins.add(skin2);
		
		return skins;
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

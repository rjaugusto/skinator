package com.rafael.skinator;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rafael.skinator.skin.domain.Skin;
import com.rafael.skinator.skin.domain.Sticker;
import com.rafael.skinator.skin.repositores.SkinRepository;
import com.rafael.skinator.skin.repositores.StickerRepository;

@SpringBootApplication
public class SkinatorApplication implements CommandLineRunner {
	
	@Autowired
	private SkinRepository skinRepository;
	
	@Autowired
	private StickerRepository stickerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SkinatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Skin skin1 = new Skin(null, "Ak 47 grade de Safari", 0.01);
		Skin skin2 = new Skin(null, "AWP Atheris", 10.01);
		
		Sticker sticker1 = new Sticker(null, "Major 2019", 20.00, skin1);
		Sticker sticker2 = new Sticker(null, "ESL one", 5.00, skin2);
		Sticker sticker3 = new Sticker(null, "Dream Hack 2014", 3.00, skin1);
		Sticker sticker4 = new Sticker(null, "CSGO Asia", 2.00, skin2);
		Sticker sticker5 = new Sticker(null, "Faze Clan", 1.00, skin1);
		Sticker sticker6 = new Sticker(null, "MIBR", 3.00, skin2);
		
		skinRepository.saveAll(Arrays.asList(skin1,skin2));
		
		
		stickerRepository.saveAll(Arrays.asList(sticker1,sticker2,sticker3,sticker4,sticker5,sticker6));
		
		
	}

}

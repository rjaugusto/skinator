package com.rafael.skinator;

import static com.rafael.skinator.skin.domain.Exterior.BATTLE_SCARRED;
import static com.rafael.skinator.skin.domain.Exterior.WELL_WORN;
import static com.rafael.skinator.skin.domain.StatTrack.N;
import static com.rafael.skinator.skin.domain.StatTrack.S;
import static com.rafael.skinator.skin.domain.Type.ASSAUT_RIFFLE;
import static com.rafael.skinator.skin.domain.Type.SNIPER_RIFLE;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rafael.skinator.skin.domain.Skin;
import com.rafael.skinator.skin.repositores.SkinRepository;

@SpringBootApplication
public class SkinatorApplication implements CommandLineRunner {
	
	@Autowired
	private SkinRepository skinRepository;

	public static void main(String[] args) {
		SpringApplication.run(SkinatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Skin skin1 = new Skin(null, "Ak 47 grade de Safari", BATTLE_SCARRED, ASSAUT_RIFFLE, S, 10.60, 0.01);
		Skin skin2 = new Skin(null, "AWP ATHERIS", WELL_WORN, SNIPER_RIFLE, N, 150.60, 0.02);
		
		skinRepository.saveAll(Arrays.asList(skin1,skin2));
		
	}

}

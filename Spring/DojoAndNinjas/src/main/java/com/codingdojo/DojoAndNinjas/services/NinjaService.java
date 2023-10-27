package com.codingdojo.DojoAndNinjas.services;

import org.springframework.stereotype.Service;

import com.codingdojo.DojoAndNinjas.models.Ninja;
import com.codingdojo.DojoAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	private final NinjaRepo ninjaRepo;
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
}

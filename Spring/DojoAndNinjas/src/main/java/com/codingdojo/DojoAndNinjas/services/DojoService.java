package com.codingdojo.DojoAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.DojoAndNinjas.models.Dojo;
import com.codingdojo.DojoAndNinjas.repositories.DojoRepo;

@Service
public class DojoService {

	private final DojoRepo dojoRepo;
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	public List<Dojo> findAllDojo(){
		return dojoRepo.findAll();
	}
	
	public Dojo findOneDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if (dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
}

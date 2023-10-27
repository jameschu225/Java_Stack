package com.codingdojo.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.SaveTravels.models.Travel;
import com.codingdojo.SaveTravels.repositories.TravelRepository;

@Service
public class TravelService {
	
	private final TravelRepository travelRepository;
	
	public TravelService (TravelRepository travelRepository) {
		this.travelRepository = travelRepository;
	}

	public List<Travel> allTravels(){
		return travelRepository.findAll();
	}
	
	public Travel findTravel(Long id) {
		Optional<Travel> travel = travelRepository.findById(id);
		if (travel.isPresent()) {
			return travel.get();
		} else {
			return null;
		}
	}
	
	public Travel createTravel(Travel travel) {
		return travelRepository.save(travel);
	}
	
	public Travel updateTravel(Travel travel) {
		return travelRepository.save(travel);
	}
	
	public void deleteTravel(Long id) {
		travelRepository.deleteById(id);;
	}
}

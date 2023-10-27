package com.codingdojo.BurgerTracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.BurgerTracker.models.Burgers;
import com.codingdojo.BurgerTracker.repository.BurgerRepository;

@Service
public class BurgerService {
		private final BurgerRepository burgerRepository;
		
		public BurgerService(BurgerRepository burgerRepository) {
			this.burgerRepository = burgerRepository;
		}
		
		public List<Burgers> allBurgers(){
			return burgerRepository.findAll();
		}
		
		public Burgers createBurger(Burgers burger) {
			return burgerRepository.save(burger);
		}
		
		public Burgers findBurger(Long id) {
			Optional<Burgers> burger = burgerRepository.findById(id);
			if (burger.isPresent()) {
				return burger.get();
			} else {
				return null;
			}
		}
		
		public Burgers updateBurger(Burgers burger) {
			return burgerRepository.save(burger);
		}
}

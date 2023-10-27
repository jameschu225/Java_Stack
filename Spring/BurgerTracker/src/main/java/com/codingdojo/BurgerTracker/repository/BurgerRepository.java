package com.codingdojo.BurgerTracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.BurgerTracker.models.Burgers;

public interface BurgerRepository extends CrudRepository<Burgers, Long> {

	List<Burgers> findAll();
}

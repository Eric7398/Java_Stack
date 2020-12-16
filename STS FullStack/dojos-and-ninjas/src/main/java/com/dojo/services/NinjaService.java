package com.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.models.Ninja;
import com.dojo.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
	
	//Find All
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	
	//Find By ID
	public Ninja findById(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		
		if(ninja.isPresent()) {
			return ninja.get();
		} else {
			return null;
		}
	}
	
	
	//Create and Update
	public Ninja save(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	
	//Delete
	public void delete(Long id) {
		ninjaRepo.deleteById(id);
	}

	
}
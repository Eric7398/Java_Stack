package com.dojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.models.Dojo;
import com.dojo.repositories.DojoRepo;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepo dojoRepo;
	
	
	//Find All
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	
	//Find By ID
	public Dojo findById(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
	
	//Create and Update
	public Dojo save(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	
	//Delete
	public void delete(Long id) {
		dojoRepo.deleteById(id);
	}

	
}

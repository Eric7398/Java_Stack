package com.beltexam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beltexam.models.TVShow;
import com.beltexam.repositories.TVShowRepository;

@Service
public class TVShowService {
	
	@Autowired
	private TVShowRepository tvRepo;
	
	//find all
	public List<TVShow> allTVShows(){
		return tvRepo.findAll();
	}
	
	//find by id
	public TVShow findById(Long id) {
		Optional<TVShow> tvshow = tvRepo.findById(id);
		
		if(tvshow.isPresent()) {
			return tvshow.get();
		} else {
			return null;
		}
	}
	
	
	
	//delete
	public void delete(Long id) {
		tvRepo.deleteById(id);
	}
}

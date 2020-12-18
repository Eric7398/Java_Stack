package com.beltexam.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.beltexam.models.TVShow;

@Repository
public interface TVShowRepository extends CrudRepository<TVShow, Long>{
	List<TVShow> findAll();

}

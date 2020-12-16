package com.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lookify.models.Song;
import com.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	private final SongRepository repo;
	
	public SongService(SongRepository repo) {
		this.repo = repo;
		
	}
	
	public List<Song> allSongs(){
		return repo.findAll();
	}
	
	
	public Song createSong(Song song) {
		return repo.save(song);
	}
	
	
	public Song findSong(Long id) {
		Optional<Song> song = repo.findById(id);
		if(song.isPresent()) {
			return song.get();
		}
		return null;
	}
	
	
	public Song updateSong(Song song) {
		return repo.save(song);
	}
	
	
	public void deleteSong(Long id) {
		Optional<Song> optionalSong = repo.findById(id);
		if (optionalSong.isPresent()) {
			repo.deleteById(id);
		}
	}
	
	
	public List<Song> findAllByRatings(){
		return repo.findTop10ByOrderByRatingDesc();
	}
	
	public List<Song> findArtist(String search){
		return repo.findByArtistContaining(search);
	}
}

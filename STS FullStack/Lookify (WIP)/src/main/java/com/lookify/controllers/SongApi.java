package com.lookify.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lookify.models.Song;
import com.lookify.services.SongService;

@RestController
public class SongApi {
	private final SongService service;
	
	public SongApi(SongService service) {
		this.service = service;
	}
	
	@RequestMapping("/dashboard")
	public List<Song> dashboard(){
		return service.allSongs();
	}
	
}

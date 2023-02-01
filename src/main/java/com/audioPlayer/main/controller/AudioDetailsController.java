package com.audioPlayer.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audioPlayer.main.model.AudioDetails;
import com.audioPlayer.main.repository.AudioDetailsRepo;

@RestController
@RequestMapping("api/")
public class AudioDetailsController {
	
	@Autowired
	private AudioDetailsRepo audioRepo;
	
	@GetMapping("audios/")
	public List<AudioDetails> getAudios() {
		return this.audioRepo.findAll();
	}	
	
	@PostMapping("audios/{id}/")
	public String deleteAudio(@PathVariable int id) {
		this.audioRepo.deleteById(id);
		return "redirect:/audios";
	}
	
	
	@PostMapping("audios/add/")
	public List<AudioDetails> addAudio(@RequestBody List<AudioDetails> audios) {
		return this.audioRepo.saveAll(audios);
	}
}

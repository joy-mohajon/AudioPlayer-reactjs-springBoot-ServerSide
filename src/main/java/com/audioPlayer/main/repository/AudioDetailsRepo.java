package com.audioPlayer.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.audioPlayer.main.model.AudioDetails;

@Repository
public interface AudioDetailsRepo extends JpaRepository<AudioDetails, Integer>{

	@Query("from AudioDetails where language = ?1")
	List<AudioDetails> getAudiosByLang(String lang);

}

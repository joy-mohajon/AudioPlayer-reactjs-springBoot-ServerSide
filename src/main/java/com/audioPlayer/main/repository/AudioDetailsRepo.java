package com.audioPlayer.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audioPlayer.main.model.AudioDetails;

@Repository
public interface AudioDetailsRepo extends JpaRepository<AudioDetails, Integer>{

}

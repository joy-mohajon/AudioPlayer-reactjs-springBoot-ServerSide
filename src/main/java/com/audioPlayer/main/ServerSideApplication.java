package com.audioPlayer.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.audioPlayer.main.model.AudioDetails;
import com.audioPlayer.main.repository.AudioDetailsRepo;

@SpringBootApplication
public class ServerSideApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ServerSideApplication.class, args);
	}
	
	@Autowired
	AudioDetailsRepo audioRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		this.audioRepo.save(new AudioDetails("Never Enough (BCR Extended Disco Mix)", "Mrs. Blue", "New Generation Italo Disco - The Lost Files, Vol. 4", "English", 463.20326530612243, "01 - Mrs. Blue - Never Enough (BCR Extended Disco Mix).mp3"));
		
	}

}

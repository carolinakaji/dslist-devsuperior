package com.example.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;

@Service
public class GameService {

	//Injetar o GameRepository
	@Autowired
	private GameRepository gameRepository;
	
	// Busca a lista de todos os games
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}
}

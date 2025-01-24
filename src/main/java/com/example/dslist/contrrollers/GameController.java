package com.example.dslist.contrrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.dto.GameMinDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.service.GameService;

@RestController
@RequestMapping(value ="/games") //configura o caminho que vai ser respondido pela api, no caso '/games'
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<Game> result = gameService.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();

	}
}

package com.example.dslist.dto;

import com.example.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private int year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(){}
	
	// No construtor recebe a entidade Game ao invés de cada valor
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	// Para o DTO é necessário somente os getters
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	

}

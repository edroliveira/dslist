package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository repository;

	public List<GameMinDTO> findAll() {
		return repository.findAll()
				.stream().map(x -> new GameMinDTO()).toList();
	}
}

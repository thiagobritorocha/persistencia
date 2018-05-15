package br.com.assai.persistencia.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.assai.persistencia.model.Player;
import br.com.assai.persistencia.repository.PlayerRepository;

@RestController
public class PlayerController {

	@Autowired
	private PlayerRepository playerRepository;

	@GetMapping("/players")
	  public List<Player> getPlayes() {
		return (List<Player>) playerRepository.findAll();
	  }
}

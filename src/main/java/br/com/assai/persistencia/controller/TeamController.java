package br.com.assai.persistencia.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.assai.persistencia.model.Team;
import br.com.assai.persistencia.service.TeamService;


@RestController
public class TeamController {

	@Autowired
	TeamService teamService;

	@GetMapping("/teams")
	  public List<Team> getTeams() {
				
		return  teamService.listTeam();
	  }
}

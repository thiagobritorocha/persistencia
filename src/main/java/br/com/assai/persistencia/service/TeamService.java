package br.com.assai.persistencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.assai.persistencia.model.Player;
import br.com.assai.persistencia.model.Team;
import br.com.assai.persistencia.repository.PlayerRepository;
import br.com.assai.persistencia.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
	@Autowired
	private PlayerRepository playerRepository;
	
	public List<Team> listTeam(){
		List<Team> listTeam = (List<Team>) teamRepository.findAll();
		for(int i =0; i < listTeam.size(); i++){
			if(i ==0){
				Team team = listTeam.get(i);
				team.setName("Santos");
				teamRepository.save(team);
				
				Player player = team.getPlayers().get(i);
				player.setName("Thiago");
				
				playerRepository.save(player);
			}
		}		
		return  (List<Team>) teamRepository.findAll();
	}
}

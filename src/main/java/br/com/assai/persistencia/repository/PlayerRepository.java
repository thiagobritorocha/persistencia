package br.com.assai.persistencia.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.assai.persistencia.model.Player;

public interface PlayerRepository extends CrudRepository<Player,Long> {

}

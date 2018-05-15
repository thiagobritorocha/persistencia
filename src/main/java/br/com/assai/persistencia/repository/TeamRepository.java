package br.com.assai.persistencia.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.assai.persistencia.model.Team;

public interface TeamRepository extends CrudRepository<Team,Long>{

}

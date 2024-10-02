package start.repository;

import org.springframework.data.repository.CrudRepository;

import start.model.Utente;

public interface UtenteRepository extends CrudRepository<Utente,Integer> {

}

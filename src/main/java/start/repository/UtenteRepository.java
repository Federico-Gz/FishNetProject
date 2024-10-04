package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import start.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	Utente findByUsernameAndPassword(String username, String password);
}

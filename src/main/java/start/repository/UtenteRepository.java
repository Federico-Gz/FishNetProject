package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {
	Utente findByUsernameAndPassword(String username, String password);
	Utente findByUsername(String username);
}

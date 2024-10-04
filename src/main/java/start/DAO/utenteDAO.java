package start.DAO;

import java.util.List;

//import org.springframework.stereotype.Service;

import start.model.Utente;

public interface utenteDAO {

	void inserisciUtente(Utente u);

	Utente selezionaId(Integer id);

	void cancellaUtente(Utente u);

	void cancellaUtenteTramiteId(Integer id);

	void aggiornaUtente(Utente u, Integer id);

	List<Utente> selezionaUtenti();

	long contaUtenti();
	// Utente trovaUtentetramiteMail(String mail);

	
	void aggiungiImmagineProfilo(String path);
	
	public boolean controlloCredenziali(String username, String password);
}

package com.FishNet.DAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.FishNet.model.Utente;

public interface utenteDAO {

	void inserisciUtente(Utente u);

	Utente selezionaId(Integer id);

	void cancellaUtente(Utente u);

	void cancellaUtenteTramiteId(Integer id);

	void aggiornaUtente(Utente u, Integer id);

	List<Utente> selezionaUtenti();

	long contaUtenti();
	// Utente trovaUtentetramiteMail(String mail);

}

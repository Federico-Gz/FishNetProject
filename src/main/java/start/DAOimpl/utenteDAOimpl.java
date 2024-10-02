package start.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import start.DAO.utenteDAO;
import start.model.Utente;
import start.repository.UtenteRepository;

@Service
public class utenteDAOimpl implements utenteDAO {
	@Autowired
	private UtenteRepository repository;

	
	   @Override
	    @Transactional
	public void inserisciUtente(Utente u) {
		repository.save(u);
		System.out.println("inserito utente");
	}

	@Override
	public Utente selezionaId(Integer id) {
		return null;
	}

	@Override
	public void cancellaUtente(Utente u) {

	}

	@Override
	public void cancellaUtenteTramiteId(Integer id) {

	}

	@Override
	public void aggiornaUtente(Utente u, Integer id) {

	}

	@Override
	public List<Utente> selezionaUtenti() {
		return null;
	}

	@Override
	public long contaUtenti() {
		return 0;
	}

}
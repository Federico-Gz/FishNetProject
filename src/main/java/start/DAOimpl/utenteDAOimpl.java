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
		Utente u = repository.findById(id).get();
		return u;
	}

	@Override
	public void cancellaUtente(Utente u) {
		repository.delete(u);
		System.out.println("cancellato utente");
	}

	@Override
	public void cancellaUtenteTramiteId(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void aggiornaUtente(Utente u, Integer id) {
//da implementare quando esisterà la pagina profilo.ftl

	}

	@Override
	public List<Utente> selezionaUtenti() {
		List<Utente> utenti = (List<Utente>) repository.findAll();
		return utenti;
	}

	@Override
	public long contaUtenti() {
		return repository.count();
	}

	@Override
	public void aggiungiImmagineProfilo(String path) {
		
//		Utente u=this.selezionaId(1);
//		u.setImg(path); da implementare in modo dinamico
	}

}

package start.DAOimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import start.DAO.UtenteDAO;
import start.model.Utente;
import start.repository.UtenteRepository;

@Service
public class UtenteDAOimpl implements UtenteDAO {
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

	public boolean controlloCredenziali(String username, String password) {
		boolean success = false;
		Utente u = repository.findByUsernameAndPassword(username, password);
		if (u != null) {

			if (u.getPassword().equals(password) && (u.getUsername().equals(username))) {
				success = true;
			} else {
				success = false;

			}
			return success;
		} else {
			success = false;
		}
		return success;
	}

	@Override
	public boolean controlloPresenzaUserPw(String username, String email) {
		boolean presente = false;
		List<Utente> utenti = repository.findAll();

		for (Utente u : utenti) {
			if (u.getUsername().equals(username) && u.getEmail().equals(email)) {
				presente = true;
			}
		}
		return presente;
	}

	@Override
	public boolean controlloPresenzaUser(String username) {
		boolean presente = false;
		List<Utente> utenti = repository.findAll();

		for (Utente u : utenti) {
			if (u.getUsername().equals(username)) {
				presente = true;
			}
		}
		return presente;
	}

	@Override
	public boolean controlloPresenzaEmail(String email) {
		boolean presente = false;
		List<Utente> utenti = repository.findAll();

		for (Utente u : utenti) {
			if (u.getEmail().equals(email)) {
				presente = true;
			}
		}
		return presente;
	}

	@Override
	public boolean controlloData(LocalDate data) {
		boolean invalidDate;
		LocalDate dataOggi = LocalDate.now();
		if (data.isAfter(dataOggi)) {
			invalidDate = true;
		} else {
			invalidDate = false;
		}
		return invalidDate;
	}

	@Override
	public Utente selezionaUtenteByUsername(String username) {
		Utente u = repository.findByUsername(username);
		return u;

	}

}

package start.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import start.DAO.EventoDAO;
import start.model.Evento;
import start.repository.EventoRepository;

@Service
public class EventoDAOimpl implements EventoDAO {

	@Autowired
	private EventoRepository repository;
	
	@Override
	public void inserisciEvento(Evento e) {
		repository.save(e);		
	}

	@Override
	public Evento selezionaEventoById(Integer id) {
		return repository.findById(id).get();
	}

	@Override
	public void cancellaEvento(Evento e) {
		repository.delete(e);
	}

	@Override
	public void cancellaEventoTramiteId(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void aggiornaEvento(Evento e, Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Evento> selezionaTuttiEvento() {		
		return repository.findAll();
	}

	@Override
	public long contaEvento() {
		return repository.count();
	}

}

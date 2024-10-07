package start.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import start.DAO.LuogoDAO;
import start.model.Luogo;
import start.repository.LuogoRepository;


@Service
public class LuogoDAOimpl implements LuogoDAO {

	@Autowired
	private LuogoRepository repository;
	
	@Override
	public void inserisciLuogo(Luogo l) {
		repository.save(l);
		
	}

	@Override
	public Luogo selezionaLuogoById(Integer id) {
		Luogo l = repository.findById(id).get();
		return l;
	}

	@Override
	public void cancellaLuogo(Luogo l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancellaLuogoTramiteId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aggiornaLuogo(Luogo l, Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Luogo> selezionaTuttiLuoghi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long contaLuoghi() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package start.DAO;

import java.util.List;

import start.model.Luogo;
import start.model.Post;

public interface LuogoDAO {

	void inserisciLuogo(Luogo l);

	Luogo selezionaLuogoById(Integer id);

	void cancellaLuogo(Luogo l);

	void cancellaLuogoTramiteId(Integer id);

	void aggiornaLuogo(Luogo l, Integer id);

	List<Luogo> selezionaTuttiLuoghi();

	long contaLuoghi();
}

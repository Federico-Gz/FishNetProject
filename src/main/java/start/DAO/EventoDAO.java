package start.DAO;

import java.util.List;

import start.model.Evento;


public interface EventoDAO {

	void inserisciEvento(Evento e);

	Evento selezionaEventoById(Integer id);

	void cancellaEvento(Evento e);

	void cancellaEventoTramiteId(Integer id);

	void aggiornaEvento(Evento e, Integer id);

	List<Evento> selezionaTuttiEvento();

	long contaEvento();
}

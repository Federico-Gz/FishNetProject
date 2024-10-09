package start.DAO;

import java.util.List;

import start.model.Mi_piace;


public interface Mi_piaceDAO {

    void inserisciMi_piace(Mi_piace m);

    Mi_piace selezionaMi_piaceById(Integer id);

    void cancellaMi_piace(Mi_piace m);

    void cancellaPostTramiteId(Integer id);

    List<Mi_piace> selezionaTuttiMi_piace();

    long contaMi_piace();
    
    
}

package start.DAO;

import java.util.List;

import start.model.Mi_piace;
import start.model.Post;


public interface Mi_piaceDAO {

    void inserisciMi_piace(Mi_piace m);

    Mi_piace selezionaMi_piaceById(Integer id);

    void cancellaMi_piace(Mi_piace m);

    void cancellaMi_piaceTramiteId(Integer id);

    List<Mi_piace> selezionaTuttiMi_piace();

    long contaMi_piace();
    
    List<Mi_piace> selezionaLikesByPost(Post p );
}

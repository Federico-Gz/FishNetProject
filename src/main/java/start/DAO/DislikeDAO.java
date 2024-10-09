package start.DAO;

import java.util.List;

import start.model.Dislike;
import start.model.Post;

public interface DislikeDAO {

    void inserisciDislike(Dislike d);

    Dislike selezionaDislikeById(Integer id);

    void cancellaDislike(Dislike d);

    void cancellaDislikeTramiteId(Integer id);

    List<Dislike> selezionaTuttiDislike();

    long contaDislike();
    
    List<Dislike> selezionaDisLikesByPost(Post p );
}
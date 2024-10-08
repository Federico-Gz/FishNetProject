package start.DAO;

import java.util.List;

import start.model.Dislike;

public interface DislikeDAO {

    void inserisciDislike(Dislike d);

    Dislike selezionaDislikeById(Integer id);

    void cancellaDislike(Dislike d);

    void cancellaDislikeTramiteId(Integer id);

    List<Dislike> selezionaTuttiDislike();

    long contaDislike();
}
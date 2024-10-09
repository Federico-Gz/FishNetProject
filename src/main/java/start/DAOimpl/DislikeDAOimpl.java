package start.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import start.DAO.DislikeDAO;
import start.model.Dislike;
import start.model.Post;
import start.repository.DislikeRepository;

@Service
public class DislikeDAOimpl implements DislikeDAO {

    @Autowired
    private DislikeRepository repository;

    @Override
    public void inserisciDislike(Dislike d) {
        repository.save(d);
    }

    @Override
    public Dislike selezionaDislikeById(Integer id) {
        Dislike d = repository.findById(id).get();
        return d;
    }

    @Override
    public void cancellaDislike(Dislike d) {
        repository.delete(d);
    }

    @Override
    public void cancellaDislikeTramiteId(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Dislike> selezionaTuttiDislike() {
        List<Dislike> dislikes = (List<Dislike>) repository.findAll();
        return dislikes;
    }

    @Override
    public long contaDislike() {
        return repository.count();
    }

    @Override
    public List<Dislike> selezionaDisLikesByPost(Post p) {
        List<Dislike> disLikes = repository.findByPost(p);
        return disLikes;
    }

}
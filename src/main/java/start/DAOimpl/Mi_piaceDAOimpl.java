package start.DAOimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import start.DAO.Mi_piaceDAO;
import start.model.Mi_piace;
import start.model.Post;
import start.repository.Mi_piaceRepository;

@Service
public class Mi_piaceDAOimpl implements Mi_piaceDAO{

    @Autowired
    private Mi_piaceRepository repository;


    @Override
    public void inserisciMi_piace(Mi_piace m) {
        repository.save(m);

    }

    @Override
    public Mi_piace selezionaMi_piaceById(Integer id) {
        Mi_piace m = repository.findById(id).get();
        return m;
    }

    @Override
    public void cancellaMi_piace(Mi_piace m) {
        repository.delete(m);

    }

    @Override
    public void cancellaMi_piaceTramiteId(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public List<Mi_piace> selezionaTuttiMi_piace() {
        List<Mi_piace> likes = (List<Mi_piace>) repository.findAll();
        return likes;
    }

    @Override
    public long contaMi_piace() {

        return repository.count();
    }

	@Override
	public List<Mi_piace> selezionaLikesByPost(Post p) {
        List<Mi_piace> likes = repository.findByPost(p);

        return likes;
    }
    
    

}
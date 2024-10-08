package start.DAOimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import start.DAO.PostDAO;
import start.model.Post;
import start.repository.PostRepository;

@Service
public class PostDAOimpl implements PostDAO {
	@Autowired
	private PostRepository repository;

	@Override
	@Transactional
	public void inserisciPost(Post p) {
		repository.save(p);
		System.out.println("inserito post");
	}

	@Override
	public Post selezionaPostById(Integer id) {
		Post p = repository.findById(id).get();
		return p;
	}

	@Override
	public void cancellaPost(Post p) {
		repository.delete(p);

	}

	@Override
	public void cancellaPostTramiteId(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void aggiornaPost(Post p, Integer id) {
		Post postDaAggiornare = repository.findById(id).get();
		if(postDaAggiornare != null) {
			postDaAggiornare.setUtente(p.getUtente());
			postDaAggiornare.setDescrizione(p.getDescrizione());
			postDaAggiornare.setDataOra(p.getDataOra());
			postDaAggiornare.setImg(p.getImg());
//			postDaAggiornare.setLike(p.getLike());
//			postDaAggiornare.setDislike(p.getDislike());
		}
		else {
			System.out.println("Post non presente nel Db");
		}
	}

	@Override
	public List<Post> selezionaTuttiPost() {
		 return repository.findAll();
	}

	@Override
	public long contaPost() {
		
		return repository.count();
	}



}

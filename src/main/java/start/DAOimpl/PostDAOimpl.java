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
	public Post selezionaId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancellaPost(Post p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancellaPostTramiteId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aggiornaPost(Post p, Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> selezionaPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long contaPost() {
		// TODO Auto-generated method stub
		return 0;
	}

}

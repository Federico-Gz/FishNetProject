package start.DAO;

import java.util.List;

import start.model.Post;

public interface PostDAO {

	void inserisciPost(Post p);

	Post selezionaPostById(Integer id);

	void cancellaPost(Post p);

	void cancellaPostTramiteId(Integer id);

	void aggiornaPost(Post p, Integer id);

	List<Post> selezionaTuttiPost();

	long contaPost();

}

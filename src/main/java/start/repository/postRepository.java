package start.repository;

import org.springframework.data.repository.CrudRepository;

import start.model.Post;


public interface postRepository extends CrudRepository<Post,Integer> {

}

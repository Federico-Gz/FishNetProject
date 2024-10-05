package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Post;


public interface PostRepository extends JpaRepository<Post,Integer> {

}

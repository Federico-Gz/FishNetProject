package start.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Mi_piace;
import start.model.Post;



public interface Mi_piaceRepository extends JpaRepository<Mi_piace,Integer> {

	List<Mi_piace> findByPost(Post post);

}
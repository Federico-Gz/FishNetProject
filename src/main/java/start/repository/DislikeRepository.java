package start.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Dislike;
import start.model.Post;

public interface DislikeRepository extends JpaRepository<Dislike,Integer>{

    List<Dislike> findByPost(Post post);
}
package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Dislike;

public interface DislikeRepository extends JpaRepository<Dislike,Integer>{

}
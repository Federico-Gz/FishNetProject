package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Evento;

public interface EventoRepository extends JpaRepository<Evento,Integer> {

}

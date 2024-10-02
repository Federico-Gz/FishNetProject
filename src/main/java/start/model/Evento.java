package start.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Evento extends Post{
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvento;
	@Column(name = "data_evento", nullable = false)
	private LocalDate dataevento;
	@Column(name = "numero_max", nullable = false)
	private int numeroMaxP;
	@Column(name = "numero_iscritti", nullable = false)
	private int numeroIscritti;
	@Column(name = "data", nullable = false)
	List<Utente> partecipanti;
	

	
	
	public Evento(Utente utente, LocalDate data, String contenuto, String img) {
		super(utente, data, contenuto, img);
		List<Utente> partecipanti=new ArrayList<>();
	}




	public LocalDate getDataevento() {
		return dataevento;
	}




	public void setDataevento(LocalDate dataevento) {
		this.dataevento = dataevento;
	}




	public int getNumeroMaxP() {
		return numeroMaxP;
	}




	public void setNumeroMaxP(int numeroMaxP) {
		this.numeroMaxP = numeroMaxP;
	}




	public int getNumeroIscritti() {
		return numeroIscritti;
	}




	public void setNumeroIscritti(int numeroIscritti) {
		this.numeroIscritti = numeroIscritti;
	}




	public List<Utente> getPartecipanti() {
		return partecipanti;
	}




	public void setPartecipanti(List<Utente> partecipanti) {
		this.partecipanti = partecipanti;
	}


	
	
	
	
	
	
	
}

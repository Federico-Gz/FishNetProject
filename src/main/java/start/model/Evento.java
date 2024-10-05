package start.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")

public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_evento;
	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente utente;
	@Column(name = "data_evento", nullable = false)
	private LocalDate data_evento;
	@Column(name = "data_creazione", nullable = false)
	private LocalDate data_creazione;
	@Column(name = "descrizione", nullable = false)
	private String descrizione;
	@Column(name = "numero_max", nullable = false)
	private int numero_max;
	@Column(name = "numero_iscritti")
	private int numero_iscritti;
	@Column(name = "immagine")
	private String immagine;
	@ManyToMany(mappedBy = "eventi_partecipati")
	List<Utente> partecipanti;

	public Evento(Utente utente, LocalDate data_evento, LocalDate data_creazione, String descrizione, int numero_max) {
		super();
		this.utente = utente;
		this.data_evento = data_evento;
		this.data_creazione = data_creazione;
		this.descrizione = descrizione;
		this.numero_max = numero_max;
		this.partecipanti = new ArrayList<>();
	}

	public Evento(Utente utente, LocalDate data_evento, LocalDate data_creazione, String descrizione, int numero_max,
			String immagine) {
		super();
		this.utente = utente;
		this.data_evento = data_evento;
		this.data_creazione = data_creazione;
		this.descrizione = descrizione;
		this.numero_max = numero_max;
		this.immagine = immagine;
		this.partecipanti = new ArrayList<>();
	}

	public int getId_evento() {
		return id_evento;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public LocalDate getData_evento() {
		return data_evento;
	}

	public void setData_evento(LocalDate data_evento) {
		this.data_evento = data_evento;
	}

	public LocalDate getData_creazione() {
		return data_creazione;
	}

	public void setData_creazione(LocalDate data_creazione) {
		this.data_creazione = data_creazione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getNumero_max() {
		return numero_max;
	}

	public void setNumero_max(int numero_max) {
		this.numero_max = numero_max;
	}

	public int getNumero_iscritti() {
		return numero_iscritti;
	}

	public void setNumero_iscritti(int numero_iscritti) {
		this.numero_iscritti = numero_iscritti;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public List<Utente> getPartecipanti() {
		return partecipanti;
	}

	public void setPartecipanti(List<Utente> partecipanti) {
		this.partecipanti = partecipanti;
	}

}

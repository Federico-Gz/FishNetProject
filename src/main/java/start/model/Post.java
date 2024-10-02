package start.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPost;

	private Utente utente;
	@Column(name = "data", nullable = false)
	private LocalDate data_creazione;
	@Column(name = "descrizione")
	private String contenuto;
	@Column(name = "immagine", nullable = false)
	private String img;

	public Post(Utente utente, LocalDate data_creazione, String contenuto, String img) {
		super();
		this.utente = utente;
		this.data_creazione = data_creazione;
		this.contenuto = contenuto;
		this.img = img;
	}

	public Post(Utente utente, LocalDate data, String img) {
		super();
		this.utente = utente;
		this.data_creazione = data;
		this.img = img;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public LocalDate getData() {
		return data_creazione;
	}

	public void setData(LocalDate data) {
		this.data_creazione = data;
	}

	public String getContenuto() {
		return contenuto;
	}

	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}

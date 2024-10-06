package start.model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")

public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPost;
	@ManyToOne
	@JoinColumn(name = "id_utente", nullable = false)
	private Utente utente;
	@Column(name = "data_ora", nullable = false)
	private LocalDateTime dataOra;
	@Column(name = "descrizione", nullable = false)
	private String contenuto;
	@Column(name = "immagine")
	private String img;
	@Column(name = "like")
	private int like;
	@Column(name = "dislike")
	private int dislike;

	public Post(Utente utente, String contenuto, String img) {
		super();
		this.utente = utente;
		this.dataOra = LocalDateTime.now();
		this.contenuto = contenuto;
		this.img = img;
		this.like = 0;
		this.dislike = 0;
	}

	public Post(Utente utente, String img) {
		super();
		this.utente = utente;
		this.dataOra = LocalDateTime.now();
		this.contenuto = "";
		this.img = img;
		this.like = 0;
		this.dislike = 0;
	}

	public Post(String contenuto, Utente utente) {
		super();
		this.utente = utente;
		this.dataOra = LocalDateTime.now();
		this.img = "";
		this.contenuto = contenuto;
		this.like = 0;
		this.dislike = 0;
	}

	public Post() {

	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
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

	public LocalDateTime getDataOra() {
		return dataOra;
	}

	public void setDataOra(LocalDateTime dataOra) {
		this.dataOra = dataOra;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

	public int getIdPost() {
		return idPost;
	}

//	public void setIdPost(int idPost) {
//		this.idPost = idPost;
//	}

}

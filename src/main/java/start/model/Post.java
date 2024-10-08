package start.model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "immagine")
	private String img;
	@ManyToOne
    @JoinColumn(name = "id_luogo", nullable = false)
    private Luogo luogo;
//	@Column(name = "mi_piace")
//	private int mi_piace;
//	@Column(name = "dislike")
//	private int dislike;

//	@OneToMany(mappedBy = "mi_piace")
//	Set<Mi_piace> lista
	
	
	
	public Post(Utente utente, String contenuto, String img,Luogo luogo) {
		super();
		this.setUtente(utente);
		this.setDataOra(LocalDateTime.now());
		this.setDescrizione(contenuto);
		this.setImg(img);
		this.setLuogo(luogo);
//		this.setLike(0);
//		this.setDislike(0);
	}

	public Post(Utente utente, String img) {
		super();
		this.setUtente(utente);
		this.setDataOra(LocalDateTime.now());
		this.setDescrizione("");
		this.setImg(img);
//		this.setLike(0);
//		this.setDislike(0);
	}

	public Post(String contenuto, Utente utente) {
		super();
		this.setUtente(utente);
		this.setDataOra(LocalDateTime.now());
		this.setDescrizione("");
		this.setImg(img);
//		this.setLike(0);
//		this.setDislike(0);
	}

	public Post() {

	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String contenuto) {
		this.descrizione = contenuto;
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

//	public int getLike() {
//		return mi_piace;
//	}
//
//	public void setLike(int like) {
//		this.mi_piace = like;
//	}
//
//	public int getDislike() {
//		return dislike;
//	}
//
//	public void setDislike(int dislike) {
//		this.dislike = dislike;
//	}

	public int getIdPost() {
		return idPost;
	}

	public Luogo getLuogo() {
		return luogo;
	}

	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}

}

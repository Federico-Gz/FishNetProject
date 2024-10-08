package start.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dislike")
public class Dislike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dislike;
    @ManyToOne
    @JoinColumn(name="id_utente",nullable=false)
    private Utente utente;
    @ManyToOne
    @JoinColumn(name="id_post",nullable=false)
    private Post post;

    public Dislike() {}

    public Dislike(Utente utente, Post post) {
    	this.setUtente(utente);
    	this.setPost(post);
    }   

    public int getId_dislike() {
		return id_dislike;
	}

	public void setId_dislike(int id_dislike) {
		this.id_dislike = id_dislike;
	}

	public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}

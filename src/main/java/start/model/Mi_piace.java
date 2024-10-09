package start.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "mi_piace", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_utente", "id_post"})})
public class Mi_piace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mi_piace;
    @ManyToOne
    @JoinColumn(name="id_utente",nullable=false)
    private Utente utente;
    @ManyToOne
    @JoinColumn(name="id_post",nullable=false)
    private Post post;

    public Mi_piace(Utente utente,Post post) {
        this.setUtente(utente);
        this.setPost(post);
    }

    public Mi_piace() {}

    public int getId_mi_piace() {
        return id_mi_piace;
    }

//    public void setId_mi_piace(int id_mi_piace) {
//        this.id_mi_piace = id_mi_piace;
//    }

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
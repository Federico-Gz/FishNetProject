package start.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    @OneToMany(mappedBy = "post")
    private Set<Mi_piace> likes;
    @OneToMany(mappedBy = "post", fetch = FetchType.EAGER)
    private Set<Dislike> dislikes;



    public Post(Utente utente, String contenuto, String img,Luogo luogo) {
        super();
        this.setUtente(utente);
        this.setDataOra(LocalDateTime.now());
        this.setDescrizione(contenuto);
        this.setImg(img);
        this.setLuogo(luogo);

        this.likes= new HashSet<>();
        this.dislikes = new HashSet<>();
    }

    public Post(Utente utente, String img) {
        super();
        this.setUtente(utente);
        this.setDataOra(LocalDateTime.now());
        this.setDescrizione("");
        this.setImg(img);

    }

    public Post(String contenuto, Utente utente) {
        super();
        this.setUtente(utente);
        this.setDataOra(LocalDateTime.now());
        this.setDescrizione("");
        this.setImg(img);

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


    public int getIdPost() {
        return idPost;
    }

    public Luogo getLuogo() {
        return luogo;
    }

    public void setLuogo(Luogo luogo) {
        this.luogo = luogo;
    }

    public Set<Mi_piace> getLikes() {
        return likes;
    }

    public void setLikes(Set<Mi_piace> likes) {
        this.likes = likes;
    }

    public Set<Dislike> getDislikes() {
        return dislikes;
    }

    public void setDislikes(Set<Dislike> dislikes) {
        this.dislikes = dislikes;
    }

    public String getFormattedDataOra() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dataOra.format(formatter);
    }
}

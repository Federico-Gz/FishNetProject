package start.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtente;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cognome", nullable = false)
    private String cognome;
    @Column(name = "data_nascita")
    private LocalDate data;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "immagine")
    private String img;
    @OneToMany(mappedBy = "utente",fetch = FetchType.EAGER)
    private List<Post> postCreati;
    @OneToMany(mappedBy = "utente")
    private List<Evento> eventiCreati;
    @ManyToMany
    @JoinTable(name = "evento_utente", joinColumns = @JoinColumn(name = "id_utente"), inverseJoinColumns = @JoinColumn(name = "id_evento"))
    private List<Evento> eventiPartecipati;
    @OneToMany(mappedBy = "utente")
    private Set<Mi_piace> likes;
    @OneToMany(mappedBy = "utente")
    private Set<Dislike> dislikes;
    
public Utente( String nome, String cognome,LocalDate data,String email, String username, String password) {
        super();
        this.setEmail(email);
        this.setNome(nome);
        this.setCognome(cognome);
        this.setUsername(username);
        this.setPassword(password);
        this.setData(data);
        this.postCreati = new ArrayList<>();
        this.eventiCreati = new ArrayList<>();
        this.eventiPartecipati = new ArrayList<>();
        this.likes = new HashSet<>();
        this.dislikes = new HashSet<>();
    }

    public Utente() {

    }

    public Integer getIdUtente() {
        return idUtente;
    }

//    public void setIdUtente(Integer idUtente) {
//        this.idUtente = idUtente;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getUsername() {
        return username;
    }
public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Post> getPostCreati() {
        return postCreati;
    }

    public void setPostCreati(List<Post> postCreati) {
        this.postCreati = postCreati;
    }

    public List<Evento> getEventiCreati() {
        return eventiCreati;
    }

    public void setEventiCreati(List<Evento> eventiCreati) {
        this.eventiCreati = eventiCreati;
    }

    public List<Evento> getEventPartecipati() {
        return eventiPartecipati;
    }

    public void setEventPartecipati(List<Evento> eventPartecipati) {
        this.eventiPartecipati = eventPartecipati;
    }

    public List<Evento> getEventiPartecipati() {
        return eventiPartecipati;
    }

    public void setEventiPartecipati(List<Evento> eventiPartecipati) {
        this.eventiPartecipati = eventiPartecipati;
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

    public int numeroPostCreati() {
    	return this.getPostCreati().size();
    	
    }

}
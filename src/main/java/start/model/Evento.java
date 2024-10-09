package start.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
	@Column(name = "data_creazione", nullable = false)
	private LocalDateTime dataCreazione;
	@Column(name = "descrizione", nullable = false)
	private String descrizione;
	@Column(name = "numero_max")
	private Integer numeroMax;
	@Column(name = "numero_iscritti")
	private Integer numeroIscritti;
	@ManyToMany
	@JoinTable(name = "evento_utente", joinColumns = @JoinColumn(name="id_evento"),
	inverseJoinColumns = @JoinColumn(name="id_utente"))
	List<Utente> partecipanti;
	@ManyToOne
	@JoinColumn(name = "id_luogo", nullable = false)
	private Luogo luogo;
	@Column(name ="numero_canne", nullable = false)
	private Integer numeroCanne;
	@Column(name ="specialita_canne",nullable = false)
	private String specialitaCanne;
	@Column(name ="gommone", nullable = false)
	private String gommone;
	@Column(name ="tipologia_esca",nullable = false)
	private String tipologiaEsca;
	@Column(name ="data_inizio", nullable = false)
	private LocalDate dataInizio;
	@Column(name ="data_fine", nullable = false)
	private LocalDate dataFine;
	
	public Evento() {}
	
	public Evento(Utente utente, String descrizione,Luogo luogo,Integer numeroCanne,
			String specialitaCanne, String gommone, String tipologiaesca, LocalDate dataInizio,
			LocalDate dataFine) {
		super();
		this.utente = utente;		
		this.dataCreazione = LocalDateTime.now();
		this.descrizione = descrizione;
		
		this.partecipanti = new ArrayList<>();
		this.numeroIscritti = 0;		
		this.luogo = luogo;
		this.numeroCanne = numeroCanne;
		this.specialitaCanne = specialitaCanne;
		this.gommone = gommone;
		this.tipologiaEsca = tipologiaesca;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
	}

	public Evento(Utente utente, String descrizione,Integer numeroMax,Luogo luogo,Integer numeroCanne,
			String specialitaCanne, String gommone, String tipologiaesca, LocalDate dataInizio,
			LocalDate dataFine) {
		super();
		this.utente = utente;		
		this.dataCreazione = LocalDateTime.now();
		this.descrizione = descrizione;
		this.numeroMax = numeroMax;
		this.partecipanti = new ArrayList<>();
		this.numeroIscritti = 0;		
		this.luogo = luogo;
		this.numeroCanne = numeroCanne;
		this.specialitaCanne = specialitaCanne;
		this.gommone = gommone;
		this.tipologiaEsca = tipologiaesca;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
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
	public LocalDateTime getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(LocalDateTime dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Integer getNumeroMax() {
		return numeroMax;
	}
	public void setNumeroMax(Integer numeroMax) {
		this.numeroMax = numeroMax;
	}
	public Integer getNumeroIscritti() {
		if(partecipanti.isEmpty()) {		
			return numeroIscritti = 0;
		}
		this.numeroIscritti=partecipanti.size();
		return numeroIscritti;
	}
	public void setNumeroIscritti(Integer numeroIscritti) {
		this.numeroIscritti = numeroIscritti;
	}
	public List<Utente> getPartecipanti() {
		return partecipanti;
	}
	public void setPartecipanti(List<Utente> partecipanti) {
		this.partecipanti = partecipanti;
	}
	public Luogo getLuogo() {
		return luogo;
	}
	public void setLuogo(Luogo luogo) {
		this.luogo = luogo;
	}
	public Integer getNumeroCanne() {
		return numeroCanne;
	}
	public void setNumeroCanne(Integer numeroCanne) {
		this.numeroCanne = numeroCanne;
	}
	public String getSpecialitaCanne() {
		return specialitaCanne;
	}
	public void setSpecialitaCanne(String specialitaCanne) {
		this.specialitaCanne = specialitaCanne;
	}
	public String getGommone() {
		return gommone;
	}
	public void setGommone(String gommone) {
		this.gommone = gommone;
	}
	public String getTipologiaEsca() {
		return tipologiaEsca;
	}
	public void setTipologiaEsca(String tipologiaEsca) {
		this.tipologiaEsca = tipologiaEsca;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	
}

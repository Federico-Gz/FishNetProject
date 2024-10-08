package start.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "luogo")
public class Luogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_luogo")
    private int id_luogo;

    @Column(name = "nome_luogo", nullable = false)
    private String nome_luogo; 

    @Column(name = "latitudine", nullable = false)
    private double latitudine; 

    @Column(name = "longitudine", nullable = false)
    private double longitudine;

   public Luogo() {}

    public Luogo(String nome_luogo, double latitudine, double longitudine) {
		super();
		this.setNome_luogo(nome_luogo);
		this.setLatitudine(latitudine);
		this.setLongitudine(longitudine);
	}

	public int getId_luogo() {
		return id_luogo;
	}

	public void setId_luogo(int id_luogo) {
		this.id_luogo = id_luogo;
	}

	public String getNome_luogo() {
		return nome_luogo;
	}

	public void setNome_luogo(String nome_luogo) {
		this.nome_luogo = nome_luogo;
	}

	public double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }
}

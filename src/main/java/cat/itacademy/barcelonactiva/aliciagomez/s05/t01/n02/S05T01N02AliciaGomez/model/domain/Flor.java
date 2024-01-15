package cat.itacademy.barcelonactiva.aliciagomez.s05.t01.n02.S05T01N02AliciaGomez.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flor")
public class Flor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pk_FlorID;

    @Column(name = "nom")
    private String nomFlor;

    @Column(name = "pais")
    private String paisFlor;

    public Flor() {

    }

    public Flor(String nomFlor, String paisFlor) {

        this.nomFlor = nomFlor;
        this.paisFlor = paisFlor;
    }

    public int getPk_FlorID() {
        return pk_FlorID;
    }

    public void setPk_FlorID(int pk_FlorID) {
        this.pk_FlorID = pk_FlorID;
    }

    public String getNomFlor() {
        return nomFlor;
    }

    public void setNomFlor(String nomFlor) {
        this.nomFlor = nomFlor;
    }

    public String getPaisFlor() {
        return paisFlor;
    }

    public void setPaisFlor(String paisFlor) {
        this.paisFlor = paisFlor;
    }
}


package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "mouvement")
@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class Mouvement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mouvement;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mouvement_id", referencedColumnName = "id_etat_mouvement")
    private EtatMouvement etatMouvement;

    @ManyToOne(targetEntity = Candidat.class)
    @JoinColumn(name="CANDIDAT_ID")
    private Long id_candidat;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fonction_id", referencedColumnName = "id_fct")
    private Fonction fonction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organisme_id", referencedColumnName = "id_organisme")
    private Organisme id_organisme;
    private String id_type;

    public Mouvement(EtatMouvement etatMouvement, Long id_candidat, Fonction fonction, Organisme id_organisme, String id_type) {
        this.etatMouvement = etatMouvement;
        this.id_candidat = id_candidat;
        this.fonction = fonction;
        this.id_organisme = id_organisme;
        this.id_type = id_type;
    }

    /*
    public Long getId_mouvement() {
        return id_mouvement;
    }

    public void setId_mouvement(Long id_mouvement) {
        this.id_mouvement = id_mouvement;
    }

    public Long getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Long id_candidat) {
        this.id_candidat = id_candidat;
    }

    public Long getId_fct() {
        return id_fct;
    }

    public void setId_fct(Long id_fct) {
        this.id_fct = id_fct;
    }

    public Long getId_organisme() {
        return id_organisme;
    }

    public void setId_organisme(Long id_organisme) {
        this.id_organisme = id_organisme;
    }

    public Long getId_type() {
        return id_type;
    }

    public void setId_type(Long id_type) {
        this.id_type = id_type;
    }

    public Mouvement(Long id_candidat, Long id_fct, Long id_organisme, Long id_type) {
        this.id_candidat = id_candidat;
        this.id_fct = id_fct;
        this.id_organisme = id_organisme;
        this.id_type = id_type;
    }

    public Mouvement() {

    }*/

}

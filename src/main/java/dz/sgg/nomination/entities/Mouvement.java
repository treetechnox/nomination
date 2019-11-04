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

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "mouvement")
    private EtatMouvement etatMouvement;

    @ManyToOne(targetEntity = Candidat.class)
    @JoinColumn(name="candidat_id")
    private Candidat id_candidat;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fonction_id", referencedColumnName = "id_fct")
    private Fonction fonction;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organisme_id", referencedColumnName = "id_organisme")
    private Organisme id_organisme;
    private String id_type;

    public Mouvement(EtatMouvement etatMouvement, Candidat id_candidat, Fonction fonction, Organisme id_organisme, String id_type) {
        this.etatMouvement = etatMouvement;
        this.id_candidat = id_candidat;
        this.fonction = fonction;
        this.id_organisme = id_organisme;
        this.id_type = id_type;
    }

    public Long getId_mouvement() {
        return id_mouvement;
    }

    public void setId_mouvement(Long id_mouvement) {
        this.id_mouvement = id_mouvement;
    }

    public EtatMouvement getEtatMouvement() {
        return etatMouvement;
    }

    public void setEtatMouvement(EtatMouvement etatMouvement) {
        this.etatMouvement = etatMouvement;
    }

    public Candidat getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Candidat id_candidat) {
        this.id_candidat = id_candidat;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public Organisme getId_organisme() {
        return id_organisme;
    }

    public void setId_organisme(Organisme id_organisme) {
        this.id_organisme = id_organisme;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }
}

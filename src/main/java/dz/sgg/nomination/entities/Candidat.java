package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "candidat")
@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class Candidat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidat;
    //the (mappedBy = "id_candidat") is the same name the "id_candidat" attribute in Mouvement Class
    /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "id_candidat")
    private List<Mouvement> mouvements;*/

    private String nom_fr;
    private String prenom_fr;
    private String nom_ar;
    private String prenom_ar;
    @Temporal(TemporalType.DATE)
    private Date date_naissance;
    private String lieu_naissance;
    private String presum;
    private Civilite civilite;

    public Candidat(String nom_fr, String prenom_fr, String nom_ar, String prenom_ar, Date date_naissance,
                    String lieu_naissance, String presum, Civilite civilite) {
        this.nom_fr = nom_fr;
        this.prenom_fr = prenom_fr;
        this.nom_ar = nom_ar;
        this.prenom_ar = prenom_ar;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.presum = presum;
        this.civilite = civilite;
    }

    public Long getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Long id_candidat) {
        this.id_candidat = id_candidat;
    }

    public String getNom_fr() {
        return nom_fr;
    }

    public void setNom_fr(String nom_fr) {
        this.nom_fr = nom_fr;
    }

    public String getPrenom_fr() {
        return prenom_fr;
    }

    public void setPrenom_fr(String prenom_fr) {
        this.prenom_fr = prenom_fr;
    }

    public String getNom_ar() {
        return nom_ar;
    }

    public void setNom_ar(String nom_ar) {
        this.nom_ar = nom_ar;
    }

    public String getPrenom_ar() {
        return prenom_ar;
    }

    public void setPrenom_ar(String prenom_ar) {
        this.prenom_ar = prenom_ar;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getLieu_naissance() {
        return lieu_naissance;
    }

    public void setLieu_naissance(String lieu_naissance) {
        this.lieu_naissance = lieu_naissance;
    }

    public String getPresum() {
        return presum;
    }

    public void setPresum(String presum) {
        this.presum = presum;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }
}

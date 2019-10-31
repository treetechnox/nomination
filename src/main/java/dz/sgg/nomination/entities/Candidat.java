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
    private String civilite;

    public Candidat(String nom_fr, String prenom_fr, String nom_ar, String prenom_ar, Date date_naissance, String lieu_naissance, String presum, String civilite) {
        this.nom_fr = nom_fr;
        this.prenom_fr = prenom_fr;
        this.nom_ar = nom_ar;
        this.prenom_ar = prenom_ar;
        this.date_naissance = date_naissance;
        this.lieu_naissance = lieu_naissance;
        this.presum = presum;
        this.civilite = civilite;
    }
}

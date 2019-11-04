package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class Fonction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fct;

    private String libelle_fr;
    private String libelle_ar;

    public Fonction(String libelle_fr, String libelle_ar) {
        this.libelle_fr = libelle_fr;
        this.libelle_ar = libelle_ar;
    }

    public Long getId_fct() {
        return id_fct;
    }

    public void setId_fct(Long id_fct) {
        this.id_fct = id_fct;
    }

    public String getLibelle_fr() {
        return libelle_fr;
    }

    public void setLibelle_fr(String libelle_fr) {
        this.libelle_fr = libelle_fr;
    }

    public String getLibelle_ar() {
        return libelle_ar;
    }

    public void setLibelle_ar(String libelle_ar) {
        this.libelle_ar = libelle_ar;
    }
}

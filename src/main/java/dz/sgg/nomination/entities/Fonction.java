package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
}

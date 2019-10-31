package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class Organisme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_organisme;

    private String libelle_fr;
    private String libelle_ar;
    private String tutelle;
}

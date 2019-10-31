package dz.sgg.nomination.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data@NoArgsConstructor@AllArgsConstructor@ToString
public class EtatMouvement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_etat_mouvement;

    //private Long id_mouvement;
    @Temporal(TemporalType.DATE)
    private Date date_proposition;
    @Temporal(TemporalType.DATE)
    private Date date_signature;
    @Temporal(TemporalType.DATE)
    private Date date_publication;
    private String num_jo;
    private String num_ref;
    private String etat_dossier;
    private int page;

    private boolean deja_occupe;
    private Long ancien_id_candidat;
    @Temporal(TemporalType.DATE)
    private Date get_date;
    private Long fct_anterieure;
    private String num_jo_anterieure;
    private String ref_anterieure;
    private int page_anterieure;

    public EtatMouvement(Date date_proposition, Date date_signature, Date date_publication, String num_jo, String num_ref, String etat_dossier, int page,
                         boolean deja_occupe, Long ancien_id_candidat, Date get_date, Long fct_anterieure, String num_jo_anterieure,
                         String ref_anterieure, int page_anterieure) {
        this.date_proposition = date_proposition;
        this.date_signature = date_signature;
        this.date_publication = date_publication;
        this.num_jo = num_jo;
        this.num_ref = num_ref;
        this.etat_dossier = etat_dossier;
        this.page = page;
        this.deja_occupe = deja_occupe;
        this.ancien_id_candidat = ancien_id_candidat;
        this.get_date = get_date;
        this.fct_anterieure = fct_anterieure;
        this.num_jo_anterieure = num_jo_anterieure;
        this.ref_anterieure = ref_anterieure;
        this.page_anterieure = page_anterieure;
    }
}

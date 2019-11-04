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

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mouvement_id", nullable = false)
    private Mouvement mouvement;

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

    public Long getId_etat_mouvement() {
        return id_etat_mouvement;
    }

    public void setId_etat_mouvement(Long id_etat_mouvement) {
        this.id_etat_mouvement = id_etat_mouvement;
    }

    public Date getDate_proposition() {
        return date_proposition;
    }

    public void setDate_proposition(Date date_proposition) {
        this.date_proposition = date_proposition;
    }

    public Date getDate_signature() {
        return date_signature;
    }

    public void setDate_signature(Date date_signature) {
        this.date_signature = date_signature;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public String getNum_jo() {
        return num_jo;
    }

    public void setNum_jo(String num_jo) {
        this.num_jo = num_jo;
    }

    public String getNum_ref() {
        return num_ref;
    }

    public void setNum_ref(String num_ref) {
        this.num_ref = num_ref;
    }

    public String getEtat_dossier() {
        return etat_dossier;
    }

    public void setEtat_dossier(String etat_dossier) {
        this.etat_dossier = etat_dossier;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isDeja_occupe() {
        return deja_occupe;
    }

    public void setDeja_occupe(boolean deja_occupe) {
        this.deja_occupe = deja_occupe;
    }

    public Long getAncien_id_candidat() {
        return ancien_id_candidat;
    }

    public void setAncien_id_candidat(Long ancien_id_candidat) {
        this.ancien_id_candidat = ancien_id_candidat;
    }

    public Date getGet_date() {
        return get_date;
    }

    public void setGet_date(Date get_date) {
        this.get_date = get_date;
    }

    public Long getFct_anterieure() {
        return fct_anterieure;
    }

    public void setFct_anterieure(Long fct_anterieure) {
        this.fct_anterieure = fct_anterieure;
    }

    public String getNum_jo_anterieure() {
        return num_jo_anterieure;
    }

    public void setNum_jo_anterieure(String num_jo_anterieure) {
        this.num_jo_anterieure = num_jo_anterieure;
    }

    public String getRef_anterieure() {
        return ref_anterieure;
    }

    public void setRef_anterieure(String ref_anterieure) {
        this.ref_anterieure = ref_anterieure;
    }

    public int getPage_anterieure() {
        return page_anterieure;
    }

    public void setPage_anterieure(int page_anterieure) {
        this.page_anterieure = page_anterieure;
    }

    public Mouvement getMouvement() {
        return mouvement;
    }

    public void setMouvement(Mouvement mouvement) {
        this.mouvement = mouvement;
    }
}

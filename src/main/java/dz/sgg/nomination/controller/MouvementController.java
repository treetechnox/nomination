package dz.sgg.nomination.controller;

import dz.sgg.nomination.dao.CandidatRepository;
import dz.sgg.nomination.dao.MouvementRepository;
import dz.sgg.nomination.entities.Mouvement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MouvementController {
    @Autowired
    MouvementRepository mouvementRepository;

    @Autowired
    CandidatRepository candidatRepository;

    @GetMapping("/candidats/{id_candidat}/mouvements")
    public Page<Mouvement> getAllMouvementByIdCandidat(@PathVariable(value = "id_candidat") Long id_candidat, Pageable pageable){
        return mouvementRepository.findByIdCandidat(id_candidat,pageable);
    }
}

package dz.sgg.nomination.controller;

import dz.sgg.nomination.dao.CandidatRepository;
import dz.sgg.nomination.entities.Candidat;
import dz.sgg.nomination.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CandidatController {

    @Autowired
    CandidatRepository candidatRepository;

    @GetMapping("candidats")
    public Page<Candidat> getAllCandidat(Pageable pageable){
        return candidatRepository.findAll(pageable);
    }

    @PostMapping("candidats")
    public Candidat addCandidat(@Valid @RequestBody Candidat candidat){
        return candidatRepository.save(candidat);
    }

    @PutMapping("candidats/{id_candidat}")
    public Candidat updateCandidat(@PathVariable(value = "id_candidat") Long id_candidat, @Valid @RequestBody Candidat candidatRequest){
        return candidatRepository.findById(id_candidat).map(candidat -> {
            candidat.setNom_ar(candidatRequest.getNom_ar());
            candidat.setPrenom_ar(candidatRequest.getPrenom_ar());
            candidat.setNom_fr(candidatRequest.getNom_fr());
            candidat.setPrenom_fr(candidatRequest.getPrenom_fr());
            candidat.setDate_naissance(candidatRequest.getDate_naissance());
            candidat.setLieu_naissance(candidatRequest.getLieu_naissance());
            candidat.setPresum(candidatRequest.getPresum());
            candidat.setCivilite(candidatRequest.getCivilite());
            return candidatRepository.save(candidat);
        }).orElseThrow(() -> new ResourceNotFoundException("The candidate "+id_candidat+ " Doesn't exist"));
    }

    @DeleteMapping("candidats/{id_candidat}")
    public ResponseEntity<?> deleteCandidatById(@PathVariable(value = "id_candidat") Long id_candidat){
        return candidatRepository.findById(id_candidat).map(candidat -> {
            candidatRepository.delete(candidat);
            return ResponseEntity.ok().build();
        }).orElseThrow(()-> new ResourceNotFoundException("Candidate "+id_candidat+"not found"));
    }
}

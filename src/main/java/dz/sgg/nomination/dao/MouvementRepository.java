package dz.sgg.nomination.dao;

import dz.sgg.nomination.entities.Mouvement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface MouvementRepository extends JpaRepository<Mouvement,Long> {
    Page<Mouvement> findByIdCandidat(Long idcandidat, Pageable pageable);
    //Optional<Mouvement> findByIdAndCandidatId(Long id, Long candidatId);
}

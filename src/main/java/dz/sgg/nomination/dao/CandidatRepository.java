package dz.sgg.nomination.dao;

import dz.sgg.nomination.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CandidatRepository extends JpaRepository<Candidat,Long> {

}

package dz.sgg.nomination.dao;

import dz.sgg.nomination.entities.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MouvementRepository extends JpaRepository<Mouvement,Long> {
}

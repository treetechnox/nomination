package dz.sgg.nomination.dao;

import dz.sgg.nomination.entities.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FonctionRepository extends JpaRepository<Fonction,Long> {
}

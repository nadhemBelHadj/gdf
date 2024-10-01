package sn.mfpai.gdemandeur.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.mfpai.gdemandeur.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
	
	
}

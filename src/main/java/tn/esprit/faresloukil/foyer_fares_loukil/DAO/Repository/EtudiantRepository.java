package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}

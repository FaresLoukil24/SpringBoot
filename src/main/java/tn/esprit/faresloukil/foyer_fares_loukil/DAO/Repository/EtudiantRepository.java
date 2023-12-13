package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(long cin);
    List<Etudiant> findByNomLike(String nom);
    List<Etudiant> findByNomContains(String nom);
    List<Etudiant> findByNomContaining(String nom);
}

package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Etudiant;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(long cin);

    @Override
    List<Etudiant> findAll();

    List<Etudiant> findByNomLike();
    List<Etudiant> findByNomContains();
    List<Etudiant> findByNomContaining();

    Etudiant findByNomAndPrenom(String nom,String prenom);
    Etudiant findBycin(long cin);

    List<Etudiant> findByDateNaissanceGreaterThan(LocalDate date);

    List<Etudiant> findByEcole(String ecole);

    List<Etudiant> findByReservationsAndId(long id);

    //6- Recherche des étudiants par réservation (année de réservation)
    List<Etudiant>findByReservationsAnneUniversitaire(Date anne);

    List<Etudiant> findByNaissanceGreaterThanAndecole(LocalDate date,String nomEcole);

    List<Etudiant> findByReservationsAnneUniversitaireOrderByNaissance(Date anne);
}

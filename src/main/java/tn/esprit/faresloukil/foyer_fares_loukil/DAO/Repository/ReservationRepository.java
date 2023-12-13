package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Reservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findReservationByEstValide(boolean Valdie);
    // Recherche des réservations par l'id de l'étudiant
    List<Reservation> findByEtudiantsIdEtudiant(long idEtudian);
    // Recherche des réservations par année et validité

    List<Reservation> findReservationByEstValideAndAnneUniversitaire(boolean Valdie, Date anneeUniversitaire);
}

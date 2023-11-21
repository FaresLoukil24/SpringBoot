package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}

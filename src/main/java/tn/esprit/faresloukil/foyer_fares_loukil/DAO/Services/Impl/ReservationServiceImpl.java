package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Reservation;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository.ReservationRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.ReservationService;


import java.util.List;

@Primary
@Service("ReservationServiceImpl")
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation e) {
        return reservationRepository.save(e);
    }

    @Override
    public void removeReservation(String id) {
        reservationRepository.deleteById(Long.valueOf(id));
    }

    @Override
    public Reservation modifyReservation(Reservation updatedReservation, String id) {
        Reservation reservationToModify = reservationRepository.findById(Long.valueOf(id)).orElse(null);

        if (reservationToModify != null) {
            reservationToModify.setAnneeUniversitaire(updatedReservation.getAnneeUniversitaire());
            reservationToModify.setEstValide(updatedReservation.getEstValide());

            return reservationRepository.save(reservationToModify);
        } else {
            throw new EntityNotFoundException("Reservation with ID " + id + " not found");
        }
    }

}

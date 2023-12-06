package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> getAllReservations();
    Reservation addReservation(Reservation e);
    void removeReservation(String id);
    Reservation modifyReservation(Reservation e, String id);
}

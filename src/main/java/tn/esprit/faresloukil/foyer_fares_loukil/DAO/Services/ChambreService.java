package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> getAllChambres();
    Chambre addChambre(Chambre e);
    void removeChambre(long id);
    Chambre modifyChambre(Chambre e, long id);
}

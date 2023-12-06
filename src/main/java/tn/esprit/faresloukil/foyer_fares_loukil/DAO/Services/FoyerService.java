package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Foyer;

import java.util.List;

public interface FoyerService {
    List<Foyer> getAllFoyers();
    Foyer addFoyer(Foyer e);
    void removeFoyer(long id);
    Foyer modifyFoyer(Foyer e, long id);
}

package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> getAllUniversites();
    Universite addUniversite(Universite e);
    void removeUniversite(long id);
    Universite modifyUniversite(Universite e, long id);
}

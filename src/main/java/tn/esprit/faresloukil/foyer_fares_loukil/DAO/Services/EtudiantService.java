package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    void removeEtudiant(long id);
    Etudiant modifyEtudiant(Etudiant e, long id);

}

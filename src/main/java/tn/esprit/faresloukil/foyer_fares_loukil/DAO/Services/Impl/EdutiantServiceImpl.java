package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Etudiant;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository.EtudiantRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.EtudiantService;


import java.util.List;

@Primary
@Service("EdutiantServiceImpl")
@AllArgsConstructor
public class EdutiantServiceImpl implements EtudiantService {

    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public void removeEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e,long id) {
        Etudiant eModify = etudiantRepository.findById(id).get();
        eModify.setNom(e.getNom());
        eModify.setPrenom(e.getPrenom());
        eModify.setCin(e.getCin());
        eModify.setEcole(e.getEcole());
        return etudiantRepository.save(eModify);
    }

}

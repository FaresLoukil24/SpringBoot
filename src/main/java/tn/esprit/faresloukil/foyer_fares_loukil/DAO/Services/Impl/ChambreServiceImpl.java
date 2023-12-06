package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Chambre;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository.ChambreRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.ChambreService;


import java.util.List;

@Primary
@Service("ChambreServiceImpl")
@AllArgsConstructor
public class ChambreServiceImpl implements ChambreService {
    ChambreRepository chambreRepository;

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre e) {
        return chambreRepository.save(e);
    }

    @Override
    public void removeChambre(long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public Chambre modifyChambre(Chambre e, long id) {
            Chambre chambreToModify = chambreRepository.findById(id).orElse(null);

            if (chambreToModify != null) {
                chambreToModify.setCh(e.getCh());
                // You can update other properties here if needed

                return chambreRepository.save(chambreToModify);
            } else {
                throw new EntityNotFoundException("Chambre with ID " + id + " not found");
            }
    }

}

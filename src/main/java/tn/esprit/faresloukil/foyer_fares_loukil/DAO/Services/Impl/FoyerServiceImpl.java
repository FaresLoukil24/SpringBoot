package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Foyer;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository.FoyerRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.FoyerService;


import java.util.List;

@Primary
@Service("FoyerServiceImpl")
@AllArgsConstructor
public class FoyerServiceImpl implements FoyerService {
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer e) {
        return foyerRepository.save(e);
    }

    @Override
    public void removeFoyer(long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public Foyer modifyFoyer(Foyer updatedFoyer, long id) {
        Foyer foyerToModify = foyerRepository.findById(id).orElse(null);

        if (foyerToModify != null) {
            foyerToModify.setNomFoyer(updatedFoyer.getNomFoyer());
            foyerToModify.setCapaciteFoyer(updatedFoyer.getCapaciteFoyer());

            return foyerRepository.save(foyerToModify);
        } else {
            throw new EntityNotFoundException("Foyer with ID " + id + " not found");
        }
    }

}

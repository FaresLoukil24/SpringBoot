package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.cglib.core.Block;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Bloc;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository.BlocRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services.IBlockService;


import java.util.List;

@Primary
@Service("BlockServiceImpl")
@AllArgsConstructor
public class BlockServiceImpl implements IBlockService {
    BlocRepository blockRepository;

    @Override
    public List<Bloc> getAllBlocks() {
        return blockRepository.findAll();
    }

    @Override
    public Bloc addBlock(Bloc e) {
        return blockRepository.save(e);
    }

    @Override
    public void removeBlock(long id) {
        blockRepository.deleteById(id);
    }

    @Override
    public Bloc modifyBlock(Bloc e, long id) {
        Bloc blocToModify = blockRepository.findById(id).orElse(null);

        if (blocToModify != null) {
            blocToModify.setNomBloc(e.getNomBloc());
            blocToModify.setCapacite(e.getCapacite());

            return blockRepository.save(blocToModify);
        } else {
            throw new EntityNotFoundException("Bloc with ID " + id + " not found");
        }
    }
}

package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Services;


import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Bloc;

import java.util.List;

public interface IBlockService {
    List<Bloc> getAllBlocks();
    Bloc addBlock(Bloc e);
    void removeBlock(long id);
    Bloc modifyBlock(Bloc e, long id);
}

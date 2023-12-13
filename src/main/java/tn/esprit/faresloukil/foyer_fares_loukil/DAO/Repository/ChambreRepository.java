package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Bloc;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Chambre;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
List<Chambre> findByNumeroChambre(long numeroChambre);
List<Chambre> findByCh(TypeChambre ch);
List<Chambre> findChambreByBloc(Bloc bloc);
List<Chambre> findChambreByBlocAndCh(Bloc bloc,TypeChambre ch);
List<Chambre> findChambreByNumeroChambreAndCh(long numeroChambre,TypeChambre ch);


}

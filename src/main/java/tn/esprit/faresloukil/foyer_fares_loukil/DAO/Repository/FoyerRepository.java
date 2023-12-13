package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Bloc;
import tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities.Foyer;

import java.util.List;
import java.util.Set;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
List<Foyer> findByBlocs(Long id);
List<Foyer> findFoyerByIdAndBlocs(long id, Set<Bloc> blocs);
}

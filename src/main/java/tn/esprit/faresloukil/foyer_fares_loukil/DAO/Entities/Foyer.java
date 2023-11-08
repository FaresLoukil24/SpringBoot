package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private long id;
    @Column(name="nomFoyer")
    private String nomFoyer;
    @Column(name="capaciteFoyer")
    private long capaciteFoyer;

}

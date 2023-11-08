package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private long id;

    @Column(name="numeroChambre")
    private long nomUniversite;
    @Enumerated(EnumType.STRING)
    private TypeChambre ch;
}

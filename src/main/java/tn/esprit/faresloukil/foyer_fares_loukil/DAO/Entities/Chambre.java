package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")
    private long id;

    @Column(name="numeroChambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre ch;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;

    @JsonIgnoreProperties("bloc")
    @ManyToOne
    Bloc bloc;
}

package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @Column(name="idReservation")
    private long id;
    @Column(name="anneeUniversitaire")
    private Date anneeUniversitaire;

    @Column(name="estValide")
    private Boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Etudiant> etudiants;
}

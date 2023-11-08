package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private long id;

    @Column(name="nomUniversite")
    private String nomUniversite;

    @Column(name="adresse")
    private String adresse;

}

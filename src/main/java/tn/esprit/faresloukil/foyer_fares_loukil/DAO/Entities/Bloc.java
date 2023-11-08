package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long id;

    @Column(name="nomEt")
    private String nom;
    @Column(name="prenomEt")
    private String prenom;
    @Column(name="cin")
    private long cin;
    @Column(name="ecole")
    private String ecole;
    @Column(name="dateNaissance")
    private Date dateNaissance;

}

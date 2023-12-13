package tn.esprit.faresloukil.foyer_fares_loukil.DAO.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "Bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private long id;

    @Column(name="nomBloc")
    private String nomBloc;
    @Column(name="prenomEt")
    private String prenom;
    @Column(name="cin")
    private long cin;
    @Column(name="ecole")
    private String ecole;
    @Column(name="capcite")
    private int capacite;
    @Column(name="dateNaissance")
    private Date dateNaissance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    Set<Chambre> chambre;

    @JsonIgnoreProperties("foyer")
    @ManyToOne
    Foyer foyer;
}


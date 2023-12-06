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

    @JsonIgnoreProperties("foyer")
    @OneToOne(mappedBy="foyer")
    Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    Set<Bloc> blocs;

}

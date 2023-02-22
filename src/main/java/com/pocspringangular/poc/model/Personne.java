package com.pocspringangular.poc.model;

import lombok.*;

import javax.persistence.*;

@Builder
@Data
@Entity
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Table (name = "personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String nom;
    @Column(length = 50)
    private String prenom;
    @Column(length = 150)
    private String adresse;
}

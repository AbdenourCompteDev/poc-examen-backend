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
@Table (name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String firstname;
    @Column(length = 50)
    private String lastname;
    @Column(length = 50)
    private String adress;
    @Column(length = 50)
    private String city;
    @Column(length = 50)
    private String zipcode;
    @Column(length = 50)
    private String country;
    @Column(length = 50)
    private String phonenumber;
    @Column(length = 50)
    private String dateofbirth;

}

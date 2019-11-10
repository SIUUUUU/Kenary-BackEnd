package com.siuuu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    //Attributes
    @Id
    @GeneratedValue(generator = "person_c_person_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "person_c_person_seq", sequenceName = "public.person_c_person_seq", allocationSize = 1)
    private long cPërson;

    private String uPhoto;

    private String uFirstNames;

    private String uLastNames;

    private String uUsername;

    private String uPassword;

    private String uBirthday;

    private String uGender;

    private String uCountry;

    private String uInstitution;

    private String uDegree;

    private String uCareer;

    private String uType;
    //Attributes
}

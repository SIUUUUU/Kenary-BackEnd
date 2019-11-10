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
public class Person {
    //Attributes
    @Id
    @GeneratedValue(generator = "person_c_user_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "person_c_user_seq", sequenceName = "public.person_c_user_seq", allocationSize = 1)
    private long cPerson;

    private String uPhoto;

    private String uFirstName;

    private String uLastName;

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

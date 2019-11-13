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
    @GeneratedValue(generator = "person_c_person_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "person_c_person_seq", sequenceName = "public.person_c_person_seq", allocationSize = 1)
    private long c_Person;

    private String u_Photo;

    private String u_First_Name;

    private String u_Last_Name;

    private String username;

    private String password;

    private String u_Birthdate;

    private String u_Gender;

    private String u_Country;

    private String u_Institution;

    private String u_Degree;

    // private String u_Career;

    private String u_Type;
    //Attributes
}

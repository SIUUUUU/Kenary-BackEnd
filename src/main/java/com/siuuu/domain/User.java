package com.siuuu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "usuario")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    //Attributes
    @Id
    @Column(name = "c_usuario")
    @GeneratedValue(generator = "usuario_c_usuario_seq", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "usuario_c_usuario_seq", sequenceName = "public.usuario_c_usuario_seq", allocationSize = 1)
    private long cUser;

    @Column(name = "u_foto")
    private String uPhoto;

    @Column(name = "u_nombres")
    private String uFirstName;

    @Column(name = "u_apellidos")
    private String uLastName;

    @Column(name = "u_nombre_usuario")
    private String uUsername;

    @Column(name = "u_contrasenia")
    private String uPassword;

    @Column(name = "u_fecha_nacimiento")
    private String uBirthday;

    @Column(name = "u_pais")
    private String uCountry;

    @Column(name = "u_institucion")
    private String uInstitution;

    @Column(name = "u_sexo")
    private String uGender;

    @Column(name = "u_grado")
    private String uDegree;

    @Column(name = "u_tipo")
    private String uType;

    @Column(name = "u_carrera")
    private String uCareer;
    //Attributes
}

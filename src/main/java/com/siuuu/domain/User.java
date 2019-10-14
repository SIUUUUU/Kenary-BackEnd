package com.siuuu.domain;

import javax.persistence.*;
import java.io.Serializable;


@Table(name = "USUARIO")
@Entity
public class User implements Serializable {
    //Attributes
    @GeneratedValue
    @Id
    @Column(name = "c_usuario")
    private long cUser;

    @Column(name = "u_foto")
    private String uPhoto;

    @Column(name = "u_nombres")
    private String uFirstNames;

    @Column(name = "u_apellidos")
    private String uLastNames;

    @Column(name = "u_usuario")
    private String uUsername;

    @Column(name=  "u_contraseña")
    private String uPassword;

    @Column(name = "u_fecha_nacimiento")
    private String uBirthday;

    @Column(name = "u_sexo")
    private String uGender;

    @Column(name = "u_pais")
    private String uCountry;

    @Column(name = "u_universidad")
    private String uInstitution;

    @Column(name = "u_grado")
    private String uDegree;

    @Column(name = "u_carrera")
    private String uCareer;

    @Column(name = "u_tipo")
    private String uType;
    //Attributes
    //Constructors
    public User() {
    }

    public User(String uPhoto, String uFirstNames, String uLastNames, String uUsername,
                String uPassword, String uBirthday, String uGender, String uCountry,
                String uInstitution, String uDegree, String uCareer, String uType) {
        this.uPhoto = uPhoto;
        this.uFirstNames = uFirstNames;
        this.uLastNames = uLastNames;
        this.uUsername = uUsername;
        this.uPassword = uPassword;
        this.uBirthday = uBirthday;
        this.uGender = uGender;
        this.uCountry = uCountry;
        this.uInstitution = uInstitution;
        this.uDegree = uDegree;
        this.uCareer = uCareer;
        this.uType = uType;
    }
    //Constructors
    //Getters and setters
    public long getcUser() {
        return cUser;
    }

    public void setcUser(long c_user) {
        this.cUser = c_user;
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getuFirstNames() {
        return uFirstNames;
    }

    public void setuFirstNames(String uFirstNames) {
        this.uFirstNames = uFirstNames;
    }

    public String getuLastNames() {
        return uLastNames;
    }

    public void setuLastNames(String uLastNames) {
        this.uLastNames = uLastNames;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(String uBirthday) {
        this.uBirthday = uBirthday;
    }

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }

    public String getuCountry() {
        return uCountry;
    }

    public void setuCountry(String uCountry) {
        this.uCountry = uCountry;
    }

    public String getuInstitution() {
        return uInstitution;
    }

    public void setuInstitution(String uInstitution) {
        this.uInstitution = uInstitution;
    }

    public String getuDegree() {
        return uDegree;
    }

    public void setuDegree(String uDegree) {
        this.uDegree = uDegree;
    }

    public String getuCareer() {
        return uCareer;
    }

    public void setuCareer(String uCareer) {
        this.uCareer = uCareer;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }
    //Getters and setters
}

package com.siuuu.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(schema = "public", name = "usuario")
public class User {
    //Attributes
    @Id
    @Column(name = "c_usuario")
    @GeneratedValue(generator = "usuario_c_usuario_seq1", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "usuario_c_usuario_seq1", sequenceName = "public.usuario_c_usuario_seq1", allocationSize = 1)
    private long cUser;

    @Column(name = "u_foto")
    private String uPhoto;

    @Column(name = "u_nombres")
    private String uFirstName;

    @Column(name = "u_apellidos")
    private String uLastName;

    @NotNull
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

    //@OneToMany(mappedBy = "sUser", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //private List<Session> uSessions;
    //Attributes
    //AllArgumentsConstructor
    public User(String uPhoto, String uFirstName, String uLastName, String uUsername, String uPassword, String uBirthday, String uCountry, String uInstitution, String uGender, String uDegree, String uType, String uCareer) {
        this.uPhoto = uPhoto;
        this.uFirstName = uFirstName;
        this.uLastName = uLastName;
        this.uUsername = uUsername;
        this.uPassword = uPassword;
        this.uBirthday = uBirthday;
        this.uCountry = uCountry;
        this.uInstitution = uInstitution;
        this.uGender = uGender;
        this.uDegree = uDegree;
        this.uType = uType;
        this.uCareer = uCareer;
        //this.uSessions = uSessions;
    }
    //AllArgumentsConstructor
    //NoArgumentsConstructor
    public User() {
    }
    //NoArgumentsConstructor
    //Getters and setters
    public long getcUser() {
        return cUser;
    }

    public void setcUser(long cUser) {
        this.cUser = cUser;
    }

    public String getuPhoto() {
        return uPhoto;
    }

    public void setuPhoto(String uPhoto) {
        this.uPhoto = uPhoto;
    }

    public String getuFirstName() {
        return uFirstName;
    }

    public void setuFirstName(String uFirstName) {
        this.uFirstName = uFirstName;
    }

    public String getuLastName() {
        return uLastName;
    }

    public void setuLastName(String uLastName) {
        this.uLastName = uLastName;
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

    public String getuGender() {
        return uGender;
    }

    public void setuGender(String uGender) {
        this.uGender = uGender;
    }

    public String getuDegree() {
        return uDegree;
    }

    public void setuDegree(String uDegree) {
        this.uDegree = uDegree;
    }

    public String getuType() {
        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType;
    }

    public String getuCareer() {
        return uCareer;
    }

    public void setuCareer(String uCareer) {
        this.uCareer = uCareer;
    }

    //public List<Session> getuSessions(){
    //    return uSessions;
    //}

    //public void setuSessions(List<Session> sessions){
    //    this.uSessions = uSessions;
    //}
    //Getters and setters
}

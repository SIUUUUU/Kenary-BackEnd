package com.siuuu.model;

import com.siuuu.domain.User;

public class UserModel {
    //Attributes
    private long cUser;

    private String uPhoto;

    private String uFirstName;

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
    //Constructors
    public UserModel(User user){
        this.cUser = user.getcUser();
        this.uPhoto = user.getuPhoto();
        this.uFirstName = user.getuFirstNames();
        this.uLastNames = user.getuLastNames();
        this.uUsername = user.getuUsername();
        this.uPassword = user.getuPassword();
        this.uBirthday = user.getuBirthday();
        this.uGender = user.getuGender();
        this.uCountry = user.getuCountry();
        this.uInstitution = user.getuInstitution();
        this.uDegree = user.getuDegree();
        this.uCareer = user.getuCareer();
        this.uType = user.getuType();
    }
    public UserModel(){
    }

    public UserModel(long c_user, String uPhoto, String uFirstName, String uLastNames,
                     String uUsername, String uPassword, String uBirthday, String uGender,
                     String uCountry, String uInstitution, String uDegree, String uCareer, String uType) {
        this.cUser = c_user;
        this.uPhoto = uPhoto;
        this.uFirstName = uFirstName;
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

    public String getuFirstName() {
        return uFirstName;
    }

    public void setuFirstName(String uFirstName) {
        this.uFirstName = uFirstName;
    }

    public String getuLastNames() {
        return uLastNames;
    }

    public void setuLastName(String uLastName) {
        this.uLastNames = uLastName;
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

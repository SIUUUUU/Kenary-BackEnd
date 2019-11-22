package com.siuuu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "session")
public class Session {

    //Attributes
    @Id
    @Column(name = "c_sesion")
    private long cSession;

    @Column(name = "c_creator")
    private long cCreator;

    @Column(name = "s_pais")
    private String sCountry;

    @Column(name = "s_ciudad")
    private String sCity;

    @Column(name = "s_lugar")
    private String sPlace;

    @Column(name = "s_fecha")
    private String sDate;

    @Column(name = "s_time")
    private String sTime;

    @Column(name = "s_subject")
    private String sSubject;

    @Column(name = "s_topic")
    private String sTopic;

    @Column(name = "s_price")
    private String sPrice;
    //Attributes
    //All Arguments Constructor

    public Session(long cSession, long cCreator, String sCountry, String sCity, String sPlace, String sDate, String sTime, String sSubject, String sTopic, String sPrice) {
        this.cSession = cSession;
        this.cCreator = cCreator;
        this.sCountry = sCountry;
        this.sCity = sCity;
        this.sPlace = sPlace;
        this.sDate = sDate;
        this.sTime = sTime;
        this.sSubject = sSubject;
        this.sTopic = sTopic;
        this.sPrice = sPrice;
    }
    //All Arguments Constructor
    //No Arguments Constructor
    public Session() {
    }
    //No Arguments Constructor
    //Getters and setters

    public long getcSession() {
        return cSession;
    }

    public void setcSession(long cSession) {
        this.cSession = cSession;
    }

    public long getcCreator() {
        return cCreator;
    }

    public void setcCreator(long cCreator) {
        this.cCreator = cCreator;
    }

    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getsCity() {
        return sCity;
    }

    public void setsCity(String sCity) {
        this.sCity = sCity;
    }

    public String getsPlace() {
        return sPlace;
    }

    public void setsPlace(String sPlace) {
        this.sPlace = sPlace;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String getsSubject() {
        return sSubject;
    }

    public void setsSubject(String sSubject) {
        this.sSubject = sSubject;
    }

    public String getsTopic() {
        return sTopic;
    }

    public void setsTopic(String sTopic) {
        this.sTopic = sTopic;
    }

    public String getsPrice() {
        return sPrice;
    }

    public void setsPrice(String sPrice) {
        this.sPrice = sPrice;
    }
    //Getters and setters
}

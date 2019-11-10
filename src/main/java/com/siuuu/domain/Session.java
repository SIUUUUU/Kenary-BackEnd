package com.siuuu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "session")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Session {

    private long cSession;

    private long cCreator;

    private String sCountry;

    private String sCity;

    private String sPlace;

    private String sDate;

    private String sTime;

    private String sSubject;

    private String sTopic;

    private String sPrice;

}

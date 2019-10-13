package com.siuuu.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue
    private long id;
}

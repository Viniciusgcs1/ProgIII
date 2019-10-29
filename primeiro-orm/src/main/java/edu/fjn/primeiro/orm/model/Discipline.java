/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vinicius
 */
@Entity
public class Discipline {

    @Id
    private String code;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeCriacao;

    public Discipline() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatadeCriacao() {
        return datadeCriacao;
    }

    public void setDatadeCriacao(Date datadeCriacao) {
        this.datadeCriacao = datadeCriacao;
    }
    @PrePersist
    private void antesdeSalvar(){

    this.code =  UUID.randomUUID().toString();
    this.datadeCriacao =  new Date();
}

    
}

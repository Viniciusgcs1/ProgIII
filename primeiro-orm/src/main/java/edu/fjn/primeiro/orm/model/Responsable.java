/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author vinicius
 */
@Entity
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "responsable_gen")
    @SequenceGenerator(initialValue = 1,
            allocationSize = 1,
            sequenceName = "responsable_seq",
            name = "responsable_gen")
    private Integer code;
    @Column (nullable = false)
    private String name;
    @Column(nullable = false,unique=true)
    private String cpf;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeResponsable type;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TypeResponsable getType() {
        return type;
    }

    public void setType(TypeResponsable type) {
        this.type = type;
    }

    
    
    
    
}

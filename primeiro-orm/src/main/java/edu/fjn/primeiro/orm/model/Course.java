/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.model;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 *
 * @author vinicius
 */
@Entity
public class Course {
        @Id
        
        private String code;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private Integer workLoad;
        @Column(nullable = false)
        private Integer  year;
                
                
        public Course(){
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

    public Integer getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(Integer workLoad) {
        this.workLoad = workLoad;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
        
        @PrePersist
        private void generateCode(){
            this.code =  UUID.randomUUID().toString();
        }
}

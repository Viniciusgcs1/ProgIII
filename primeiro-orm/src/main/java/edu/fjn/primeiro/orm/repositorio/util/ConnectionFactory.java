/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.repositorio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vinicius
 */


    
public class ConnectionFactory {
    
    private static final EntityManagerFactory factory
            = Persistence.createEntityManagerFactory("orm-unit");
    
    public static EntityManager obterManager(){
        
        return  factory.createEntityManager();
        
    }
    /**
    Fechar conexão
    **/
    public static void close(){
    
        factory.close();
    }
    
}
    
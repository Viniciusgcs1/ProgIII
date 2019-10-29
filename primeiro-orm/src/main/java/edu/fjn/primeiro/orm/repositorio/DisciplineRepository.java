/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.repositorio;

import edu.fjn.primeiro.orm.model.Discipline;
import edu.fjn.primeiro.orm.repositorio.util.ConnectionFactory;
import javax.persistence.EntityManager;

/**
 *
 * @author vinicius
 */
public class DisciplineRepository {

    public void save(Discipline discipline) {

        /*Conexão do Banco de Dados*/
        EntityManager manager = ConnectionFactory.obterManager();

        /*Gerenciamento  do Banco de Dados */
        try {

            manager.getTransaction().begin();
            manager.persist(discipline);
            manager.getTransaction().commit();

        } catch (Exception e) {
            // Verificar  se transação está ativa ainda.
            // Um erro pode  encerrar a transação  sem permitir 
            // Um rollback pelo progamador  

            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }

        } finally {
            manager.close();

        }

    }

    public void update(Discipline discipline) {
        /*Conexão do Banco de Dados*/
        EntityManager manager = ConnectionFactory.obterManager();

        /*Gerenciamento  do Banco de Dados */
        try {

            manager.getTransaction().begin();
            manager.merge(discipline);
            manager.getTransaction().commit();

        } catch (Exception e) {
            // Verificar  se transação está ativa ainda.
            // Um erro pode  encerrar a transação  sem permitir 
            // Um rollback pelo progamador  

            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }

        } finally {
            manager.close();

        }

    }
}

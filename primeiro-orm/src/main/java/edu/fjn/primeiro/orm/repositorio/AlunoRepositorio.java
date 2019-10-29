/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.repositorio;

import edu.fjn.primeiro.orm.model.Aluno;
import edu.fjn.primeiro.orm.repositorio.util.ConnectionFactory;
import javax.persistence.EntityManager;



/**
 *
 * @author vinicius
 */
public class AlunoRepositorio {

  

    public void save(Aluno aluno) {
        /*Conexão do Banco de Dados*/
        EntityManager manager = ConnectionFactory.obterManager();

        /*Gerenciamento  do Banco de Dados */
        try {

            manager.getTransaction().begin();
            manager.persist(aluno);
            manager.getTransaction().commit();

        } catch (Exception e) {
            // Verificar  se transação está ativa ainda.
            // Um erro pode  encerrar a transação  sem permitir 
            // Um rollback pelo progamador  

            if (manager.getTransaction().isActive()) {
                manager.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            manager.close();
            
        }

    }

    public void update(Aluno aluno) {
         /*Conexão do Banco de Dados*/
        EntityManager manager = ConnectionFactory.obterManager();

        /*Gerenciamento  do Banco de Dados */
        try {

            manager.getTransaction().begin();
            manager.merge(aluno);
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

    public void delete(Aluno aluno) {
    }

    public Aluno SearchForId(Integer id) {
        EntityManager manager =  ConnectionFactory.obterManager();
        return  manager.find(Aluno.class, id);
    }
}

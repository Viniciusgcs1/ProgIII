/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fjn.primeiro.orm.teste;

import edu.fjn.primeiro.orm.model.Aluno;
import edu.fjn.primeiro.orm.model.Course;
import edu.fjn.primeiro.orm.model.Responsable;
import edu.fjn.primeiro.orm.model.TypeResponsable;
import edu.fjn.primeiro.orm.repositorio.AlunoRepositorio;
import edu.fjn.primeiro.orm.repositorio.util.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class Executavel {

    public static void main(String[] args) {

        AlunoRepositorio alunoRepositorio 
                = new AlunoRepositorio();
        
        Aluno  aluno = alunoRepositorio.SearchForId(5);
        System.out.println("Name: "+aluno.getNome());
        System.out.println("Reponsable: "+ aluno.getResponsable().getName());
        
        aluno.getCourse().forEach((a)->{
            System.out.println("Course: " + a.getName());
            System.out.println("Course: " +a.getWorkLoad());
    
        });
                

       /* Aluno aluno = new Aluno();
        aluno.setCodigo(8);
        aluno.setNome("Jhon Fededsds");

        Responsable responsable = new Responsable();
        responsable.setName("Joao cabal");
        responsable.setCpf("454545455487");
        responsable.setType(TypeResponsable.FATHER);

        aluno.setResponsable(responsable);

        List<Course> courses = new ArrayList<>();

        Course course = new Course();
        course.setName("Java");
        course.setWorkLoad(172);
        course.setYear(2019);
        courses.add(course);

        course = new Course();
        course.setName(" JS");
        course.setWorkLoad(85);
        course.setYear(2019);
        courses.add(course);

        aluno.setCourse(courses);
       
       
        alunoRepositorio.save(aluno);*/
        ConnectionFactory.close();

    }

}

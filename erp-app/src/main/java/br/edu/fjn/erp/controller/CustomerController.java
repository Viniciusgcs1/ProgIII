/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author vinicius
 */

/*FRAMEWORKS PESQUISAR : Spring  MVC /  VRaptor*/
@Controller
public class CustomerController extends HttpServlet {

    @Get("/hello")
    public void receiveRequisition() {
        System.out.println("HELLO FRIEND!");
    }
}

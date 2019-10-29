/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fjn.erp.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.fjn.erp.domain.customer.Customer;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.ws.rs.POST;

/**
 *
 * @author vinicius
 */

/*FRAMEWORKS PESQUISAR : Spring  MVC /  VRaptor*/
@Controller
@Path("customer")
public class CustomerController {
    @Inject
    private Result  result;
    
    
    
   @Get("new")
    public void formView(){    
    }
   @Post("save")
   public void save(Customer customer){
       result.include("SaveComplete", "Feito! s"
               + customer.getName()+ " Save Complete");
       result.redirectTo(this).formView();
        
   }

}

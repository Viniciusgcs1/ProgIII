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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private Result result;
    
    //Lista de cidades
    @Get("new")
    public void formView() {
        List<String> citiesList = Arrays.asList("Juazeiro", "Abaiara", "Crato", "Barbalha");
        result.include("citiesList", citiesList);
    }
    //Salvar Clientes
    @Post("save")
    public void save(Customer customer) {
        System.out.println("City " + customer.getAddress().getCity());
        System.out.println("Address : " + customer.getAddress().getStreet());

        result.include("saveComplete", "Feito! "
                + customer.getName() + " Save Complete");
        result.redirectTo(this).formView();

    }
    //Listando os Clientes
    @Get("list")
    public void list() {
        Customer customer1 = new Customer();
        customer1.setName("Vinicius Guilherme ");
        Customer customer2 = new Customer();
        customer2.setName("Vinicius o Grande");
        Customer customer3 = new Customer();
        customer3.setName("Vinicius Incrivel");

        List<Customer> customerList = new ArrayList();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        result.include("customerList", customerList);
    }

}

//Define o pacote
package org.acme.controller;

//O código está importando classes e bibliotecas que é preciso.
import org.acme.entity.Customer;
import org.acme.service.CustomerService;
import java.util.List;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.ArrayList;

//Caminho da API para requisição http funcionar
@Path("/api/customer")


//Lógica definida para controlar os métodos GET e POST da API
public class CustomerController {


    //Uma instância da classe CustomerService dentro do controlador
    @Inject
    CustomerService customerService;

    //Método será chamado para retornar uma lista de clientes
    @GET
    public List<Customer> retrieveCustomers(){

        List<Customer> customers = new ArrayList<>();
        try {
            customers = customerService.findAllCustomers();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }

    //Método será chamado para adicionar um cliente
    @POST
    @Transactional
    public void addCustomer(Customer customer) { customerService.addCustomer(customer); }

}

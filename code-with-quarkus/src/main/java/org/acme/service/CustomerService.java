//Declaração do pacote
package org.acme.service;

//Importações
import org.acme.repository.CustomerRepository;
import java.util.List;
import org.acme.entity.Customer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped

//Serve como intermediária entre o controlador e o repositório, lidando com a lógica do PROJETO.
public class CustomerService {

    @Inject
    CustomerRepository customerRepository;

    //Este método retorna uma lista de todos os clientes.
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll().list();
    }

    //Este método adiciona um novo cliente ao banco de dados.
    public void addCustomer(Customer customer) {
        customerRepository.persist(customer);
    }

}


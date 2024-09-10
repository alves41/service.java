//Declaração do pacote
package org.acme.repository;

// Importações
import org.acme.entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped

//simplifica o acesso ao banco de dados, sem a necessidade de escrever código SQL
public class CustomerRepository implements PanacheRepository<Customer>{

}

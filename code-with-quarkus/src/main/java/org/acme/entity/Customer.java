//Declaração do pacote
package org.acme.entity;

//São importações das classes e anotações necessárias para definir a entidade e automatizar alguns comportamentos.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

//Essas anotações e classe é uma entidade do banco de dados H2.
@NoArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private String email;
}

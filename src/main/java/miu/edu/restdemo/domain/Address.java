package miu.edu.restdemo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {

    @Id
    int id;
    String city;

    // FOR DEMO PURPOSES
//    @OneToOne(mappedBy = "address")
//    Product product;
}

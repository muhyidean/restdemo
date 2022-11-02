package miu.edu.restdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

//    @Transient
//    private int counter;

    @OneToMany
    @JoinColumn(name ="product_id")
    List<Review> reviews;

//    @OneToOne
//    @JoinColumn
//    Address address;
}

package miu.edu.restdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private float price;
    List<Review> reviews;
}

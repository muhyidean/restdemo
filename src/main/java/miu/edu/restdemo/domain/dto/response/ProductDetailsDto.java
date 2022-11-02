package miu.edu.restdemo.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import miu.edu.restdemo.domain.Review;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetailsDto {

    private int id;
    private String name;
    private float price;
    List<Review> reviews;

}

package miu.edu.restdemo.controller;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.dto.response.ProductDetailsDto;
import miu.edu.restdemo.domain.dto.response.ProductDto;
import miu.edu.restdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/products")
@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping() // GET - api/v1/products
    public List<ProductDto> getProducts(){
        return productService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}") // api/v1/products/{id}
    public ProductDto getProduct(@PathVariable("id") int id){
        return productService.findById(id);
    }

    @PostMapping  // POST - api/v1/products
    public void save( @RequestBody ProductDto productDto){
        productService.save(productDto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id){
        productService.deleteById(id);
    }

    @GetMapping("/{id}/reviews") // api/v1/products/{id}/reviews
    public ProductDetailsDto getReviewsByProductId(@PathVariable int id){
        return productService.getReviewsByProduct(id);
    }


}

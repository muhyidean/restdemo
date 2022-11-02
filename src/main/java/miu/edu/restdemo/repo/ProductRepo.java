package miu.edu.restdemo.repo;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.dto.response.ProductDto;

import java.util.List;

public interface ProductRepo {

    public List<Product> findAll();

    public Product findById(int id);

    public void deleteById(int id);


    public void save(Product product);
 }

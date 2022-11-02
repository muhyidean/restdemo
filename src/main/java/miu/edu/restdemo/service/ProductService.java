package miu.edu.restdemo.service;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.dto.response.ProductDetailsDto;
import miu.edu.restdemo.domain.dto.response.ProductDto;

import java.util.List;

public interface ProductService {

    public List<ProductDto> findAll();

    public ProductDto findById(int id);

    public void deleteById(int id);


    public void save(ProductDto productDto);

    public ProductDetailsDto getReviewsByProduct(int id);
}

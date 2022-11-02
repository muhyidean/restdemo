package miu.edu.restdemo.service.impl;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.dto.response.ProductDetailsDto;
import miu.edu.restdemo.domain.dto.response.ProductDto;
import miu.edu.restdemo.repo.ProductRepo;
import miu.edu.restdemo.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("default")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAll() {
        var products = productRepo.findAll();
        return
                products
                .stream()
                .map( p -> modelMapper.map(p,ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(int id) {
       return modelMapper.map(productRepo.findById(id),ProductDto.class);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void save(ProductDto productDto) {
        productRepo.save( modelMapper.map(productDto,Product.class));
    }

    @Override
    public ProductDetailsDto getReviewsByProduct(int id) {

        return modelMapper.map(productRepo.findById(id),ProductDetailsDto.class);
    }
}

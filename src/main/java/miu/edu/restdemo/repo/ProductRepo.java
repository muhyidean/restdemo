package miu.edu.restdemo.repo;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.dto.response.ProductDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {

    public List<Product> findAll();

    public Product findById(int id);

    public void deleteById(int id);

 }

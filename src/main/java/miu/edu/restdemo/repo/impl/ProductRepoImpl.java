package miu.edu.restdemo.repo.impl;

import miu.edu.restdemo.domain.Product;
import miu.edu.restdemo.domain.Review;
import miu.edu.restdemo.domain.dto.response.ProductDto;
import miu.edu.restdemo.repo.ProductRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepoImpl implements ProductRepo {

    private static List<Product> products;
    private static int productId = 300;
    static {
        products = new ArrayList<>();
        Review r1a = new Review(123,"I love it",5);
        Review r1b = new Review(145,"It is ordinary",4);
        List<Review> reviews1 = Arrays.asList(r1a,r1b);

        Review r2a = new Review(223,"Not that good",3);
        Review r2b = new Review(245,"It does the job",4);
        List<Review> reviews2 = Arrays.asList(r2a,r2b);

        Product p1 = new Product(111,"iPhone13",1100,reviews1);
        Product p2 = new Product(112,"galaxy",1050,reviews2);
        products.add(p1);
        products.add(p2);
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products
                .stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);


    }

    @Override
    public void deleteById(int id) {
        var product = products
                .stream()
                .filter(p -> p.getId()==id)
                .findFirst().get();
        products.remove(product);
    }

    @Override
    public void save(Product product) {
        product.setId(productId++);
        products.add(product);
    }


}

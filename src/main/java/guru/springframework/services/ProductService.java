package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> productList();
}

package spring.security.studying.globalsecurity.service;

import spring.security.studying.globalsecurity.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> sellProducts(List<Product> products);

    List<Product> findProducts();
}

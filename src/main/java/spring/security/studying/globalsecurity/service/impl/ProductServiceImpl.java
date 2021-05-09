package spring.security.studying.globalsecurity.service.impl;

import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;
import spring.security.studying.globalsecurity.model.Product;
import spring.security.studying.globalsecurity.service.ProductService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @PreFilter("filterObject.owner == authentication.name")
    @Override
    public List<Product> sellProducts(List<Product> products) {
        return products;
    }

    @PostFilter("filterObject.owner == authentication.name")
    @Override
    public List<Product> findProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("phone", "oleh"));
        products.add(new Product("car", "oleh"));
        products.add(new Product("book", "marina"));

        return products;
    }
}

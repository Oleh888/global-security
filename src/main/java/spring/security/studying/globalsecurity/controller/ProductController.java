package spring.security.studying.globalsecurity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.security.studying.globalsecurity.model.Product;
import spring.security.studying.globalsecurity.service.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/sell")
    public List<Product> sellProduct() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("phone", "oleh"));
        products.add(new Product("car", "oleh"));
        products.add(new Product("book", "marina"));

        return productService.sellProducts(products);
    }
}

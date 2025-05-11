package com.e_commerce_site.E_Commerce.Site.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.e_commerce_site.E_Commerce.Site.Entity.Product_Entity;
import com.e_commerce_site.E_Commerce.Site.Repo.Product_Repo;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*") // Optional: for WordPress frontend access
public class Product_Controller {

    private final Product_Repo productRepo;

    @Autowired
    public Product_Controller(Product_Repo productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public List<Product_Entity> getAllProducts() {
        return productRepo.findAll();
    }

    @GetMapping("/{id}")
    public Product_Entity getProductById(@PathVariable Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @PostMapping
    public Product_Entity createProduct(@RequestBody Product_Entity product_Entity) {
        return productRepo.save(product_Entity);
    }
}

package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.model.Product;
import com.mentorassignment.RetailApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductRepository repo;

    @Autowired
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/details")
    public List<Product> getProducts(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return  repo.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Product product){
       repo.delete(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        repo.save(product);
    }

}

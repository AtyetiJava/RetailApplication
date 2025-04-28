package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.model.Product;
import com.mentorassignment.RetailApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
class ProductController{
    private ProductRepository repo;

    @Autowired
    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/get")
    public List<Product> getProducts(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product){
        repo.save(product);
    }

    @DeleteMapping("/remove/{id}")
    public void removeProduct(@PathVariable("id") Product product ){
        repo.delete(product);
    }

    @PutMapping("update/{id}")
    public void updateProduct(@PathVariable String id,@RequestBody Product product){
        repo.save(product);
    }
}
















//@RestController
//@RequestMapping("/product")
//public class ProductController {
//    private final ProductRepository repo;
//
//    @Autowired
//    public ProductController(ProductRepository repo) {
//        this.repo = repo;
//    }
//
//    @GetMapping("/get")
//    public List<Product> getProducts(){
//        return repo.findAll();
//    }
//
//    @PostMapping("/add")
//    public Product addProduct(@RequestBody Product product){
//        return  repo.save(product);
//    }
//
//    @DeleteMapping("remove/{id}")
//    public void deleteProduct(@PathVariable("id") Product product){
//       repo.delete(product);
//    }
//
//    @PutMapping("update/{id}")
//    public void updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
//        repo.save(product);
//    }
//
//}

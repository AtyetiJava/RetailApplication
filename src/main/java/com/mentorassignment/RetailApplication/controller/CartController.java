package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.model.Cart;
import com.mentorassignment.RetailApplication.model.Product;
import com.mentorassignment.RetailApplication.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    private final CartRepository cartRepository;

    @Autowired
    public CartController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }


    @GetMapping("/show")
    public List<Cart> getCarts(){
        return cartRepository.findAll();
    }

    @PostMapping("/add")
    public Cart addCart(@RequestBody Cart cart){
        return  cartRepository.save(cart);
    }

    @DeleteMapping("/remove/{id}")
    public void deleteCart(@PathVariable("id") Cart cart){
        cartRepository.delete(cart);
    }

    @PutMapping("/update/{id}")
    public void updateProduct(@PathVariable("id") String id, @RequestBody Cart cart) {
        cartRepository.save(cart);
    }

}

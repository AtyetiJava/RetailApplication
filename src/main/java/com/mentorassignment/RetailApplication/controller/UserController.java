package com.mentorassignment.RetailApplication.controller;

import com.mentorassignment.RetailApplication.exception.UserNotFoundException;
import com.mentorassignment.RetailApplication.model.Cart;
import com.mentorassignment.RetailApplication.model.Order;
import com.mentorassignment.RetailApplication.model.Product;
import com.mentorassignment.RetailApplication.model.User;
import com.mentorassignment.RetailApplication.repository.CartRepository;
import com.mentorassignment.RetailApplication.repository.OrderRepository;
import com.mentorassignment.RetailApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository repo;
    private final CartRepository repoCart;
    private final OrderRepository repoOrder;


    @Autowired
    public UserController(UserRepository repo, CartRepository repoCart, OrderRepository repoOrder) {
        this.repo = repo;
        this.repoCart = repoCart;
        this.repoOrder = repoOrder;
    }
//
//    @Autowired
//    public UserController(UserRepository repo) {
//        this.repo = repo;
//    }

//    @GetMapping("/get")
//    public List<User> getUsers(){
//        try {
//            return repo.findAll();
//        } catch (Exception e) {
//            throw new UserNotFoundException("User Not Found: "+e.getMessage());
//        }
//    }

    @GetMapping("/viewMyCart")
    public List<Cart>  viewUserCart(){
        return repoCart.findAll();
    }

    @GetMapping("/viewMyOrders")
    public List<Order>  viewUserOrders(){
       return  repoOrder.findAll();
    }

//    @GetMapping("/products")
//    public List<Product> viewProducts(){
//        return
//    }




    @PostMapping("/add")
    public User updateUser(@RequestBody User user){
       return repo.save(user);
    }

    @DeleteMapping("remove/{id}")
    public void deleteUser(@PathVariable("id") User user){
        repo.delete(user);
    }

    @PutMapping("update/{id}")
    public void updateUser(@PathVariable("id") String id,@RequestBody User user){
        repo.save(user);
    }

}

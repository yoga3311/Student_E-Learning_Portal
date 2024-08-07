package com.max.quizspring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.max.quizspring.model.Product;
import com.max.quizspring.model.Users;
import com.max.quizspring.service.UserService;


@RestController()
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService uservice;

    @GetMapping("/getusers")
    public List<Users> GetUsers() {
        return uservice.getUsers();
    }

    @GetMapping("/login")
    public boolean login(@RequestParam String email, @RequestParam String password) {
        Users existingUser = uservice.findUserByEmail(email);
        return existingUser != null && existingUser.getPassword().equals(password);
    }
    
    @PostMapping("/register")
    public Users AddUsers(@RequestBody Users user) {
        return uservice.addUsers(user);
    }
    
    @DeleteMapping("/delete/{uid}")
    public String DeleteUser(@PathVariable Long uid) {
        return uservice.deleteUser(uid);
    }
    
    // <--------------------------------->
    
    @PostMapping("/addcourse")
    public Product AddUsers(@RequestBody Product product) {
        return uservice.addproducts(product);
    }
    @GetMapping("/getcourse")
    public List<Product> GetProduct() {
        return uservice.getproduct();
    }
    @DeleteMapping("/deletecourse/{id}")
    public String DeleteProduct(@PathVariable Long id) {
        return uservice.deleteproduct(id);
    }
}

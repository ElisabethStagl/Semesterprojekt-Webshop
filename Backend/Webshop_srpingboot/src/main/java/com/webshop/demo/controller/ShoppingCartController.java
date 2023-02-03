package com.webshop.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.demo.model.ShoppingCart;
import com.webshop.demo.service.ShoppingCartService;

@RestController
@RequestMapping("/shoppingCarts")
public class ShoppingCartController {
    
    private ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService){
        this.shoppingCartService = shoppingCartService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ShoppingCart create(@RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.save(shoppingCart);
    }



    }

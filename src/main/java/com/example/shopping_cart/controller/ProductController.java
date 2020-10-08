package com.example.shopping_cart.controller;

import com.example.shopping_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("product/index");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
}

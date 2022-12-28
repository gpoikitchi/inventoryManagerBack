package com.yacineDev.demo.Controller;

import com.yacineDev.demo.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServices productServices ;

    @GetMapping("/getAllProducts")
    public ResponseEntity getProducts(){
        return new ResponseEntity(productServices.getAllProducts(), HttpStatusCode.valueOf(200));
    }

}

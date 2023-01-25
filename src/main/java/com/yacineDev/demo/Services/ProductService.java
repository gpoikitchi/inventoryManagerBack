package com.yacineDev.demo.Services;

import com.yacineDev.demo.Repositories.EmployeeRepo;
import com.yacineDev.demo.Repositories.ProductRepo;
import com.yacineDev.demo.exception.ProductNotFoundException;
import com.yacineDev.demo.exception.UserNotFoundException;
import com.yacineDev.demo.module.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo ;

    @Autowired
    public ProductService(ProductRepo productRepo,
                          EmployeeRepo employeeRepo) {
        this.productRepo = productRepo;
    }
    @Transactional
    public Product addProduct(Product product){
        return productRepo.save(product);
    }
    @Transactional
    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }
    @Transactional
    public Product updateProduct(Product product){
        return productRepo.save(product);
    }
    @Transactional
    public Product findProductById(Long id){
        return productRepo.findProductById(id).orElseThrow(() -> new ProductNotFoundException("Product By id : "+id+" was not found "));
    }

    public void deleteProduct(Long id){
        productRepo.deleteProductById(id);
    }
}

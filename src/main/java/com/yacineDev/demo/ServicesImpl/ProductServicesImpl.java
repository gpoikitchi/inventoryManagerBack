package com.yacineDev.demo.ServicesImpl;

import com.yacineDev.demo.Class.Product;
import com.yacineDev.demo.Repositories.ProductRepo;
import com.yacineDev.demo.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServicesImpl implements ProductServices {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepo.save(product);
    }

    @Override
    public void modifyProduct(int prodId,Product product) {
        Product productPrev = productRepo.findById(prodId);
        productPrev.setName(product.getName());
        productPrev.setPrice(product.getPrice());
        productRepo.save(productPrev); // he will automatically know that the id didn't change so he will change the name and the price
    }

    @Override
    public void deleteProduct(int prodId) {
        Product productPrev = productRepo.findById(prodId);
        productRepo.delete(productPrev);
    }
}

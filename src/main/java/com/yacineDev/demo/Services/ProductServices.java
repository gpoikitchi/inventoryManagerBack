package com.yacineDev.demo.Services;

import com.yacineDev.demo.Class.Product;

import java.util.List;

public interface ProductServices {
    public abstract List<Product> getAllProducts();
    public abstract void addProduct(Product product);
    public abstract void modifyProduct(int Id , Product product);
    public abstract void deleteProduct(int prodId);

}

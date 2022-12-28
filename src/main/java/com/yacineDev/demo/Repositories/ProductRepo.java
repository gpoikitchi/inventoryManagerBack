package com.yacineDev.demo.Repositories;
import com.yacineDev.demo.module.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    // if we want to search by name we could use findByName , and java spring is smart to di it by itself
    public Product findById(int id);
}




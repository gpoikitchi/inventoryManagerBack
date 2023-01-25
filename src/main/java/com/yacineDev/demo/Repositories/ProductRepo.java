package com.yacineDev.demo.Repositories;
import com.yacineDev.demo.module.Employee;
import com.yacineDev.demo.module.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product,Long> {
    void deleteProductById(Long id);

    Optional<Product> findProductById(Long id);

}

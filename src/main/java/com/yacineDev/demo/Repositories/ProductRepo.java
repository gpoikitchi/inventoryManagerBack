package com.yacineDev.demo.Repositories;
import com.yacineDev.demo.module.Employee;
import com.yacineDev.demo.module.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product,Long> {
    @Query(value="DELETE FROM produit WHERE id_produit = ?1",nativeQuery = true)
    void deleteProductById(Long id);
    @Query(value="SELECT * FROM produit",nativeQuery = true)
    List<Product> findAllProducts();
    @Query(value="SELECT * FROM produit ORDER BY nom",nativeQuery = true)
    List<Product> findAllByOrderByNom();
    @Query(value="SELECT * FROM produit ORDER BY nom DESC",nativeQuery = true)
    List<Product> findAllByOrderByNomDesc();
    @Query(value="SELECT * FROM produit ORDER BY category",nativeQuery = true)
    List<Product> findAllByOrderCategory();
    @Query(value="SELECT * FROM produit ORDER BY category DESC",nativeQuery = true)
    List<Product> findAllByOrderCategoryDesc();
    @Query(value="SELECT * FROM produit ORDER BY prix_unitaire",nativeQuery = true)
    List<Product> findAllByOrderByPrice();
    @Query(value="SELECT * FROM produit ORDER BY prix_unitaire DESC",nativeQuery = true)
    List<Product> findAllByOrderByPriceDesc();
    @Query(value="SELECT * FROM produit ORDER BY produit_en_stock",nativeQuery = true)
    List<Product> findAllByOrderByQuantity();
    @Query(value="SELECT * FROM produit ORDER BY produit_en_stock DESC",nativeQuery = true)
    List<Product> findAllByOrderByQuantityDesc();
    @Query(value="SELECT * FROM produit WHERE nom LIKE %?1% OR category LIKE %?1% ",nativeQuery = true)
    List<Product> findProductsByInput(String input);
    @Query(value="SELECT * FROM produit WHERE id_produit = ?1",nativeQuery = true)
    Optional<Product> findProductById(Long id);
    @Modifying
    @Transactional
    @Query(value="INSERT INTO produit (id_produit , nom , category , prix_unitaire ,priix_de_revient, produit_enstock) VALUES (?1,?2,?3,?4,?5,0)" , nativeQuery = true)
    List<Product> addProduct(int id_produit , String nom , String category , String prix_unitaire , String prix_de_revient , int produit_en_stock);

    @Modifying
    @Transactional
    @Query(value="UPDATE produit SET nom = ?1, category=?2 , prix_unitaire=?3 , prix_de_revient=?4 WHERE id_produit=?33" , nativeQuery = true)
    List<Product> updateproduct(int id_produit) ;

}

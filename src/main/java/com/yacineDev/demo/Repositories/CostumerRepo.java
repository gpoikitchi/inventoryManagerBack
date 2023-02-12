package com.yacineDev.demo.Repositories;

import com.yacineDev.demo.module.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CostumerRepo extends JpaRepository<Costumer,Long> {

    Optional<Costumer> findCostumerById(Long id);

    @Query(value = "SELECT * FROM client",nativeQuery = true)
    List<Costumer> findAllClient();

    @Query(value="SELECT * FROM client ORDER BY nom",nativeQuery = true)
    List<Costumer> findAllClientOrderedByName();

    @Query(value="SELECT * FROM client ORDER BY nom DESC",nativeQuery = true)
    List<Costumer> findAllClientOrderedByNameDESC();


    @Query(value="SELECT * FROM client ORDER BY email DESC",nativeQuery = true)
    List<Costumer> findAllClientOrderedByEmailDESC();


    @Query(value="SELECT * FROM client ORDER BY email",nativeQuery = true)
    List<Costumer> findAllClientOrderedByEmail();

    @Query(value="SELECT * FROM client WHERE nom LIKE %?1% OR prenom LIKE %?1% OR email LIKE %?1%",nativeQuery = true)
    List<Costumer> findCostumersByInput(String input);

    @Query(value="DELETE FROM client WHERE id = ?1",nativeQuery = true)
    void deleteCostumerById(Long id);
}

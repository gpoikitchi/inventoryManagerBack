package com.yacineDev.demo.Repositories;

import com.yacineDev.demo.module.Costumer;
import com.yacineDev.demo.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CostumerRepo extends JpaRepository<Costumer,Long> {

    void deleteCostumerById(Long id);
    Optional<Costumer> findCostumerById(Long id);

    @Query(value = "SELECT * FROM client",nativeQuery = true)
    List<Costumer> findAllClient();

}

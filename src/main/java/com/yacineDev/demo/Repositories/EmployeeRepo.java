package com.yacineDev.demo.Repositories;

import com.yacineDev.demo.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

    @Query(value="DELETE FROM employee WHERE idE = ?1",nativeQuery = true)
    void deleteEmployeeById(Long id);

    @Query(value = "SELECT * FROM employee",nativeQuery = true)
    List<Employee> findAllEmployees();

    @Query(value="SELECT * FROM employee ORDER BY nom",nativeQuery = true)
    List<Employee> findAllEmployeesOrderedByName();

    @Query(value="SELECT * FROM employee ORDER BY nom DESC",nativeQuery = true)
    List<Employee> findAllEmployeesOrderedByNameDESC();


    @Query(value="SELECT * FROM employee ORDER BY email DESC",nativeQuery = true)
    List<Employee> findAllEmployeesOrderedByEmailDESC();


    @Query(value="SELECT * FROM employee ORDER BY email",nativeQuery = true)
    List<Employee> findAllEmployeesOrderedByEmail();

    @Query(value="SELECT * FROM employee WHERE nom LIKE %?1% OR prenom LIKE %?1% OR email LIKE %?1%",nativeQuery = true)
    List<Employee> findEmployeesByInput(String input);

    @Query(value="SELECT * FROM employee WHERE nom_utilisateur = ?1 AND mot_de_passe = ?2",nativeQuery = true)
    Optional<Employee> findByUsernameAndPassword(String username,String password);

    @Query(value="SELECT r.nomR FROM employee e JOIN concerne c ON e.idE= c.idE JOIN role r ON c.idR = r.idR WHERE e.idE = ?1",nativeQuery = true)
    String getEmployeeRole(BigInteger id);
}

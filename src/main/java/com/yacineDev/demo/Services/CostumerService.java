package com.yacineDev.demo.Services;

import com.yacineDev.demo.Repositories.CostumerRepo;
import com.yacineDev.demo.Repositories.EmployeeRepo;
import com.yacineDev.demo.exception.CostumerNotFoundException;
import com.yacineDev.demo.exception.UserNotFoundException;
import com.yacineDev.demo.module.Costumer;
import com.yacineDev.demo.module.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CostumerService {
    private final CostumerRepo costumerRepo;
    private final EmployeeRepo employeeRepo;

    @Autowired
    public CostumerService(CostumerRepo costumerRepo,
                           EmployeeRepo employeeRepo) {
        this.costumerRepo= costumerRepo;
        this.employeeRepo = employeeRepo;
    }
    @Transactional
    public Costumer addCostumer(Costumer costumer){
        return costumerRepo.save(costumer);
    }
    @Transactional
    public List<Costumer> findAllCostumers(){
        return costumerRepo.findAllClient() ;
    }
    @Transactional
    public List<Costumer> findAllCostumersOrderedByName(){
        return costumerRepo.findAllClientOrderedByName();
    }
    @Transactional
    public List<Costumer> findAllCostumersOrderedByNameDESC(){
        return costumerRepo.findAllClientOrderedByNameDESC();
    }

    @Transactional
    public List<Costumer> findAllCostumersOrderedByEmail(){
        return costumerRepo.findAllClientOrderedByEmail();
    }
    @Transactional
    public List<Costumer> findAllCostumersOrderedByEmailDESC(){
        return costumerRepo.findAllClientOrderedByEmailDESC();
    }
    @Transactional
    public List<Costumer> findCostumersByInput(String input){
        return costumerRepo.findCostumersByInput(input);
    }
    @Transactional
    public  Costumer updateCostumer(Costumer costumer){
        return costumerRepo.save(costumer);
    }
    @Transactional
    public Costumer findCostumerById(Long id)  {
        return costumerRepo.findCostumerById(id).orElseThrow(() -> new CostumerNotFoundException("Costumer By id : "+id+" was not found "));
    }
    @Transactional
    public void deleteCostumer(Long id){
        costumerRepo.deleteCostumerById(id);
    }
}

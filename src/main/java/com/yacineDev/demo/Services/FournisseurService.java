package com.yacineDev.demo.Services;

import com.yacineDev.demo.Repositories.FournisseurRepo;
import com.yacineDev.demo.module.Employee;
import com.yacineDev.demo.module.Fournisseur;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    private final FournisseurRepo fournisseurRepo;

    @Autowired
    public FournisseurService(FournisseurRepo fournisseurRepo) {
        this.fournisseurRepo = fournisseurRepo;
    }
    @Transactional
    public List<Fournisseur> findAllFournisseurs(){
        return fournisseurRepo.findAllFournisseurs();
    }
    @Transactional
    public List<Fournisseur> findAllFournisseursOrderedByName(){
        return fournisseurRepo.findAllFournisseursOrderedByName();
    }
    @Transactional
    public List<Fournisseur> findAllFournisseursOrderedByNameDESC(){
        return fournisseurRepo.findAllFournisseursOrderedByNameDESC();
    }
    @Transactional
    public List<Fournisseur> findAllFournisseursOrderedByEmail(){
        return fournisseurRepo.findAllFournisseursOrderedByEmail();
    }
    @Transactional
    public List<Fournisseur> findAllFournisseursOrderedByEmailDESC(){
        return fournisseurRepo.findAllFournisseursOrderedByEmailDESC();
    }
    @Transactional
    public List<Fournisseur> findFournisseursByInput(String input){
        return fournisseurRepo.findFournisseursByInput(input);
    }
    @Transactional
    public Fournisseur addFournisseur(String nom, String email, int nTel){
        fournisseurRepo.addFournisseur(nom,email,nTel);
        return null ;
    }
    @Transactional
    public void deleteFournisseurById(long id){
        fournisseurRepo.deleteFournisseurById(id);
    }
    @Transactional
    public Fournisseur updateFournisseur(Fournisseur fournisseur){
        fournisseurRepo.updateFournisseur(fournisseur.getNomF(), fournisseur.getEmail(), fournisseur.getN_tel(),fournisseur.getIdF());
        return null ;
    }

}

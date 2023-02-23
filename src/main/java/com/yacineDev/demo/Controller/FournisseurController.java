package com.yacineDev.demo.Controller;

import com.yacineDev.demo.Services.FournisseurService;
import com.yacineDev.demo.module.Fournisseur;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurController {
    private final FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Fournisseur>> getAllFournisseurs(){
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseurs();
        return new ResponseEntity<>(fournisseurs, HttpStatus.OK);
    }
    @GetMapping("/all/nameAsc")
    public ResponseEntity<List<Fournisseur>> getAllFournisseursOrderedByName(){
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseursOrderedByName();
        return new ResponseEntity<>(fournisseurs,HttpStatus.OK);
    }
    @GetMapping("/all/nameDesc")
    public ResponseEntity<List<Fournisseur>> getAllFournisseursOrderedByNameDESC(){
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseursOrderedByNameDESC();
        return new ResponseEntity<>(fournisseurs,HttpStatus.OK);
    }
    @GetMapping("/all/emailAsc")
    public ResponseEntity<List<Fournisseur>> getAllFournisseursOrderedByEmail(){
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseursOrderedByEmail();
        return new ResponseEntity<>(fournisseurs,HttpStatus.OK);
    }
    @GetMapping("/all/emailDesc")
    public ResponseEntity<List<Fournisseur>> getAllFournisseursOrderedByEmailDESC(){
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseursOrderedByEmailDESC();
        return new ResponseEntity<>(fournisseurs,HttpStatus.OK);
    }

    @GetMapping("/find/{input}")
    public ResponseEntity<List<Fournisseur>> getFournisseurByInput(@PathVariable("input") String input) {
        List<Fournisseur> fournisseur = fournisseurService.findFournisseursByInput(input);
        return new ResponseEntity<>(fournisseur, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Fournisseur> addFournisseur( @RequestBody Fournisseur fournisseur){
        String nom = fournisseur.getNomF();
        String email = fournisseur.getEmail();
        int tel = fournisseur.getN_tel();
        System.out.println(tel);
        Fournisseur newFournisseur = fournisseurService.addFournisseur(nom,email,tel);
        return new ResponseEntity<>(newFournisseur,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteFournisseur(@PathVariable("id") Long id){
        fournisseurService.deleteFournisseurById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Fournisseur> updateFournisseur(@RequestBody Fournisseur fournisseur){
        Fournisseur updateFournisseur = fournisseurService.updateFournisseur(fournisseur);
        return new ResponseEntity<>(updateFournisseur,HttpStatus.OK);
    }

}

package com.yacineDev.demo.Repositories;

import com.yacineDev.demo.module.Fournisseur;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FournisseurRepo extends JpaRepository<Fournisseur,Long> {

    @Query(value="SELECT * FROM fournisseur",nativeQuery = true)
    List<Fournisseur> findAllFournisseurs();

    @Query(value="SELECT * FROM fournisseur ORDER BY nomF",nativeQuery = true)
    List<Fournisseur> findAllFournisseursOrderedByName();

    @Query(value="SELECT * FROM fournisseur ORDER BY nomF DESC",nativeQuery = true)
    List<Fournisseur> findAllFournisseursOrderedByNameDESC();

    @Query(value="SELECT * FROM fournisseur ORDER BY email DESC",nativeQuery = true)
    List<Fournisseur> findAllFournisseursOrderedByEmailDESC();

    @Query(value="SELECT * FROM fournisseur ORDER BY email",nativeQuery = true)
    List<Fournisseur> findAllFournisseursOrderedByEmail();

    @Query(value="SELECT * FROM fournisseur WHERE nomF LIKE %?1%  OR email LIKE %?1%",nativeQuery = true)
    List<Fournisseur> findFournisseursByInput(String input);

    @Modifying
    @Transactional
    @Query(value="DELETE FROM fournisseur WHERE idF = ?1",nativeQuery = true)
    void deleteFournisseurById(Long id);

    @Modifying
    @Transactional
    @Query(value="INSERT INTO fournisseur (nomF,email,n_tel) VALUES (?1,?2,?3)",nativeQuery = true)
    void addFournisseur(String nomF,String email,int n_tel);

    @Modifying
    @Transactional
    @Query(value="UPDATE fournisseur SET nomF = ?1,email = ?2,n_tel = ?3 WHERE idF = ?4",nativeQuery = true)
    void updateFournisseur(String nomF,String email,int n_tel,Long idF);

}

package com.projet.arrisparis.dao;

import com.projet.arrisparis.model.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface PanierDAO extends JpaRepository<Panier, Long> {

    @Query("Select sum(ajout.prix) FROM Panier ajout WHERE ajout.user_id=:user_id")
    double getTotalAmountByUserId(@Param("user_id") Long user_id);
    @Query("Select ajout  FROM Panier ajout WHERE ajout.user_id=:user_id")
    List<Panier> getCartByuserId(@Param("user_id")Long user_id);
    @Query("Select ajout  FROM Panier ajout ")
    Optional<Panier> getCartByuserIdtest();
    @Query("Select ajout FROM Panier ajout WHERE ajout.produits.id_Produit= :id_Produit and ajout.user_id=:user_id")
    Optional<Panier> getCartByProductIdAnduserId(@Param("user_id")Long user_id,@Param("id_Produit")Long id_Produit);
    @Modifying
    @Transactional
    @Query("DELETE  FROM Panier ajout WHERE ajout.id =:panier_id   and ajout.user_id=:user_id")
    void deleteCartByIdAndUserId(@Param("user_id")Long user_id,@Param("panier_id")Long panier_id);
    @Modifying
    @Transactional
    @Query("DELETE  FROM Panier ajout WHERE ajout.user_id=:user_id")
    void deleteAllCartByUserId(@Param("user_id")Long user_id);

    @Modifying
    @Transactional
    @Query("DELETE  FROM Panier ajout WHERE ajout.user_id=:user_id")
    void deleteAllCartUserId(@Param("user_id")Long user_id);
    @Modifying
    @Transactional
    @Query("update Panier ajout set ajout.qty=:qty,ajout.prix=:prix WHERE ajout.id=:panier_id")
    void updateQtyByCartId(@Param("panier_id")Long panier_id,@Param("prix")double prix,@Param("qty")Integer qty);


}

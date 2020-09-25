package com.projet.arrisparis.dao;

import com.projet.arrisparis.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckoutDAO extends JpaRepository<Checkout, Long> {

    @Query("Select checkCart FROM Checkout checkCart WHERE checkCart.user_id=:user_id")
    List<Checkout> getByuserId(@Param("user_id")Long user_id);
}

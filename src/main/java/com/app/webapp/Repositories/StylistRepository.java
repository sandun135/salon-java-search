package com.app.webapp.Repositories;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

import com.app.webapp.Entity.Stylist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface StylistRepository extends CrudRepository<Stylist, Long> {
    @Query("select s from Stylist s where s.stylistFirstName LIKE %?1% or s.stylistLastName LIKE %?1% or s.city LIKE %?1% or s.country LIKE %?1%")
    List<Stylist> findAllByStylistFirstName(String stylistFirstName);





    @Query("select s from Stylist s inner join Price p ON s.stylistId = p.stylistId where ( s.country LIKE %?1% OR ?1 = 'undefined' ) AND (s.city LIKE %?2% OR ?2 = 'undefined') AND (p.price = ?3  OR ?3 = 'undefined') AND (s.gender LIKE %?4%  OR ?4 = 'undefined')")
    List<Stylist> findAllByAllFind(String country,String city,Long price,String gender);
















/*
    @Query(value = "select s from Stylist s INNER JOIN Price p On s.stylistId=p.stylistID  where s.country LIKE %?1%",  = false)
    List<Stylist> findAllByCountry1(String country);
*/


 /*   List<Stylist> findAllByGender(String gender);

    @Query("select s from Stylist s where s.stylistFirstName LIKE %?1% or s.stylistLastName LIKE %?1% or s.country LIKE %?2%")
    List<Stylist> findAllByStylistFirstNameOrCountry(String name, String country);
*/


}
package com.app.webapp.service;

import com.app.webapp.Entity.Stylist;
import com.app.webapp.Repositories.StylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StylistService {

    @Autowired
    StylistRepository stylistRepository;

    public Iterable<Stylist> findAll() {
        return stylistRepository.findAll();
    }

    public List<Stylist> getStylistById(String id){
        Optional<Stylist> stylistOptional =  stylistRepository.findById(Long.parseLong(id));

        List<Stylist> stylistArrayList = new ArrayList<>();

        if(stylistOptional.isPresent()){
            stylistArrayList.add(stylistOptional.get());
        }

        return stylistArrayList;
    }
    public List<Stylist> getStylistByName(String name){
        List<Stylist> stylistOptional =  stylistRepository.findAllByStylistFirstName(name);
        return stylistOptional;
    }

/*    Find All*/
    public List<Stylist> getStylistByAllFind(String country,String city,String price,String gender){
        List<Stylist> stylistOptional =  stylistRepository.findAllByAllFind(country,city,Long.parseLong(price),gender);
        return stylistOptional;
    }















    /*public List<Stylist> getStylistByGender(String gender){
        List<Stylist> stylistOptional =  stylistRepository.findAllByGender(gender);
        return stylistOptional;
    }
    public List<Stylist> getStylistByStylistFirstNameAndCountryAllIgnoreCase(String name, String country) {

        List<Stylist> stylists = stylistRepository.findAllByStylistFirstNameOrCountry(name, country);



        return stylists;
    }*/


}

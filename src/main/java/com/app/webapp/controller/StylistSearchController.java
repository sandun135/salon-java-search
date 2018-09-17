package com.app.webapp.controller;


import com.app.webapp.Entity.Stylist;
import com.app.webapp.service.StylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class StylistSearchController {

    @Autowired
    private StylistService stylistService;

    @GetMapping(path = "/all")
    public
    @ResponseBody
    Iterable<Stylist> getAllstylist() {
        return stylistService.findAll();
    }

    @GetMapping("/id/{id}")
    public List<Stylist> getstylistId(@PathVariable String id) {

        List<Stylist> stylists = stylistService.getStylistById(id);
        return stylists;
    }


    /*primary search*/
    @GetMapping("/find/{name}")
    public List<Stylist> getstylistName(@PathVariable String name) {

        List<Stylist> stylists = stylistService.getStylistByName(name);
        return stylists;
    }



    /*    Advance Search*/
    @GetMapping("/search")
    public List<Stylist> getAllFind(@RequestParam String country,@RequestParam String city,@RequestParam String price,@RequestParam String gender) {

        List<Stylist> stylists = stylistService.getStylistByAllFind(country,city,price,gender);
        return stylists;
    }



















  /*  @GetMapping("/gender/{gender}")
    public List<Stylist> getGender(@PathVariable String gender) {

        List<Stylist> stylists = stylistService.getStylistByGender(gender);
        return stylists;
    }

    @RequestMapping(path = "/{name}/{country}", method = RequestMethod.GET)
    public List<Stylist> getStylist(@PathVariable String name, @PathVariable String country) {

        List<Stylist> stylists = stylistService.getStylistByStylistFirstNameAndCountryAllIgnoreCase(name, country);

        return stylists;
    }*/


}
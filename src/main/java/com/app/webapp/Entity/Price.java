package com.app.webapp.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="price")
public class Price {

    @Id
    @Column(name = "stylistId")
    private Long stylistId;

    @Column(name = "serviceId")
    private long serviceId;

    @Column(name = "price")
    private long price;


    @OneToMany(targetEntity=Service.class, mappedBy="serviceId", fetch=FetchType.EAGER)
    private List<Service> services = new ArrayList<>();


    public Long getStylistId() {
        return stylistId;
    }

    public void setStylistId(Long stylistId) {
        this.stylistId = stylistId;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }





}
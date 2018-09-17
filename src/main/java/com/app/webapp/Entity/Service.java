package com.app.webapp.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="service")
public class Service {


    @Id
    @Column(name = "serviceId")
    private Long serviceId;
    @Column(name = "serviceName")
    private String serviceName;




    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

}
package com.app.webapp.Entity;


        import javax.persistence.*;
        import java.util.ArrayList;
        import java.util.List;

@Entity
@Table(name="stylist")
public class Stylist {


    @Id
    @Column(name = "stylistId")
    private Long stylistId;
    @Column(name = "stylistFirstName")
    private String stylistFirstName;
    @Column(name = "stylistLastName")
    private String stylistLastName;
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "phoneNo1")
    private String phoneNo1;
    @Column(name = "mobileNo")
    private String mobileNo;
    @Column(name = "Email")
    private String Email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "imageUrl")
    private String imageUrl;
    @Column(name = "dob")
    private String dob;

    /*@JoinTable(name = "price",
            joinColumns = @JoinColumn(name = "stylistId"),
            inverseJoinColumns = @JoinColumn(name = "serviceId")
    )*/

    @OneToMany(targetEntity=Price.class, mappedBy="stylistId",  fetch=FetchType.EAGER)
    private List<Price> prices = new ArrayList<>();

    public Long getStylistId() {
        return stylistId;
    }

    public void setStylistId(Long stylistId) {
        this.stylistId = stylistId;
    }

    public String getStylistFirstName() {
        return stylistFirstName;
    }

    public void setStylistFirstName(String stylistFirstName) {
        this.stylistFirstName = stylistFirstName;
    }

    public String getStylistLastName() {
        return stylistLastName;
    }

    public void setStylistLastName(String stylistLastName) {
        this.stylistLastName = stylistLastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNo1() {
        return phoneNo1;
    }

    public void setPhoneNo1(String phoneNo1) {
        this.phoneNo1 = phoneNo1;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
}
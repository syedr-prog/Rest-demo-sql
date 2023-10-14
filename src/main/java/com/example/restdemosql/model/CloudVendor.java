package com.example.restdemosql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    @Id
    private String vendorId;
    private String name;
    private String Address;
    private String phoneNumber;

//    public CloudVendor(String vendorId, String name, String address, String phoneNumber) {
//        this.vendorId = vendorId;
//        this.namDe = name;
//        Address = address;
//        this.phoneNumber = phoneNumber;
//    }


    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

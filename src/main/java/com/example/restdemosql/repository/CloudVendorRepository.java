package com.example.restdemosql.repository;

import com.example.restdemosql.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
//then in jpa you are giving the type of class which is cloudvendor
//In cloud vendor vendorId has the data type string so  JpaRepository<CloudVendor, String>
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}

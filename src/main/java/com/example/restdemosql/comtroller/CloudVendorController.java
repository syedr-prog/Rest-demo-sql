package com.example.restdemosql.comtroller;

import com.example.restdemosql.model.CloudVendor;
import com.example.restdemosql.reponse.ResponseHandler;
import com.example.restdemosql.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController {
    //  CloudVendor cloudVendor;// create this object so we could fill it post and get information using get request
    //  add an instance of service layer
    CloudVendorService cloudVendorService;
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //Read Specific Cloud Vendor Details
    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, cloudVendorService.getCloudVendor(vendorId));
//        return cloudVendorService.getCloudVendor(vendorId);
    }

    // Read All Cloud Vendor Details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails(){
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
//        return cloudVendor;
        return cloudVendorService.getAllCloudVendors();
    }

    // Read All Cloud Vendor Details from DB
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}

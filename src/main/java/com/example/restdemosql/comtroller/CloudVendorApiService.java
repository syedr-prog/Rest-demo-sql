package com.example.restdemosql.comtroller;

import com.example.restdemosql.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorApiService {

    CloudVendor cloudVendor;// create this object so we could fill it post and get information using get request
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
//        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxx");
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }
}

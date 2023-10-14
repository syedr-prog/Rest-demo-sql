package com.example.restdemosql.service;

import com.example.restdemosql.model.CloudVendor;

import java.util.List;

//add everything you want in your business layer or service layer
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();//fetch all data from database
}

package com.crm.crm.service;

import com.crm.crm.model.CloudVendor;
import java.util.List;

public interface CloudVendorService {
    CloudVendor getCloudVendor(String vendorId);
    String createCloudVendor(CloudVendor cloudVendor);
    String updateCloudVendor(CloudVendor cloudVendor);
    String deleteCloudVendor(String vendorId);
    List<CloudVendor> getAllCloudVendors();
}

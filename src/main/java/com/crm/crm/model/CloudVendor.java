package com.crm.crm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor")
public class CloudVendor {

    @Id
    private String vendorId;
    private String vendorName;
    private String vendorNumber;
    private String vendorIsActive;
    private String vendorEmail;
    private String vendorIsApproved;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorNumber,
                       String vendorIsActive, String vendorEmail, String vendorIsApproved) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorNumber = vendorNumber;
        this.vendorIsActive = vendorIsActive;
        this.vendorEmail = vendorEmail;
        this.vendorIsApproved = vendorIsApproved;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public String getVendorIsActive() {
        return vendorIsActive;
    }

    public void setVendorIsActive(String vendorIsActive) {
        this.vendorIsActive = vendorIsActive;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorIsApproved() {
        return vendorIsApproved;
    }

    public void setVendorIsApproved(String vendorIsApproved) {
        this.vendorIsApproved = vendorIsApproved;
    }
}

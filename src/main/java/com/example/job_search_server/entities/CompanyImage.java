package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class CompanyImage {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column
    private String companyImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getCompanyImage() {
        return companyImage;
    }

    public void setCompanyImage(final String companyImage) {
        this.companyImage = companyImage;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

}

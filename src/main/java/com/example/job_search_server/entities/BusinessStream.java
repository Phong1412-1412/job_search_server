package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class BusinessStream {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String businessStreamName;

    @OneToMany(mappedBy = "business")
    private Set<Company> businessCompanys;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getBusinessStreamName() {
        return businessStreamName;
    }

    public void setBusinessStreamName(final String businessStreamName) {
        this.businessStreamName = businessStreamName;
    }

    public Set<Company> getBusinessCompanys() {
        return businessCompanys;
    }

    public void setBusinessCompanys(final Set<Company> businessCompanys) {
        this.businessCompanys = businessCompanys;
    }

}

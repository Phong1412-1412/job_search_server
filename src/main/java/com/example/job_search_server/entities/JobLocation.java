package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class JobLocation {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(length = 100)
    private String streetAddress;

    @Column(length = 50)
    private String city;

    @Column(length = 50)
    private String state;

    @Column(length = 50)
    private String country;

    @Column(length = 50)
    private String zip;

    @OneToMany(mappedBy = "jobLocation")
    private Set<JobPost> jobLocationJobPosts;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(final String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public Set<JobPost> getJobLocationJobPosts() {
        return jobLocationJobPosts;
    }

    public void setJobLocationJobPosts(final Set<JobPost> jobLocationJobPosts) {
        this.jobLocationJobPosts = jobLocationJobPosts;
    }

}

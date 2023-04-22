package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;


@Entity
public class Company {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(length = 50)
    private String companyName;

    @Column
    private String profileDecription;

    @Column
    private LocalDate establismentDate;

    @Column(length = 50)
    private String companyWebsiteUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_id")
    private BusinessStream business;

    @OneToMany(mappedBy = "company")
    private Set<CompanyImage> companyCompanyImages;

    @OneToMany(mappedBy = "company")
    private Set<JobPost> companyJobPosts;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public String getProfileDecription() {
        return profileDecription;
    }

    public void setProfileDecription(final String profileDecription) {
        this.profileDecription = profileDecription;
    }

    public LocalDate getEstablismentDate() {
        return establismentDate;
    }

    public void setEstablismentDate(final LocalDate establismentDate) {
        this.establismentDate = establismentDate;
    }

    public String getCompanyWebsiteUrl() {
        return companyWebsiteUrl;
    }

    public void setCompanyWebsiteUrl(final String companyWebsiteUrl) {
        this.companyWebsiteUrl = companyWebsiteUrl;
    }

    public BusinessStream getBusiness() {
        return business;
    }

    public void setBusiness(final BusinessStream business) {
        this.business = business;
    }

    public Set<CompanyImage> getCompanyCompanyImages() {
        return companyCompanyImages;
    }

    public void setCompanyCompanyImages(final Set<CompanyImage> companyCompanyImages) {
        this.companyCompanyImages = companyCompanyImages;
    }

    public Set<JobPost> getCompanyJobPosts() {
        return companyJobPosts;
    }

    public void setCompanyJobPosts(final Set<JobPost> companyJobPosts) {
        this.companyJobPosts = companyJobPosts;
    }

}

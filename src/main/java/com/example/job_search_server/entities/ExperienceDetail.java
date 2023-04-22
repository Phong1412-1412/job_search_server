package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class ExperienceDetail {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean isCurentJob;

    @Column(length = 50)
    private String jobTitle;

    @Column
    private LocalDate startDate;

    @Column
    private LocalDate endDate;

    @Column(length = 50)
    private String companyName;

    @Column(length = 50)
    private String jobLocationCity;

    @Column(length = 50)
    private String jobLocationCountry;

    @Column
    private String dicription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile userAccount;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Boolean getIsCurentJob() {
        return isCurentJob;
    }

    public void setIsCurentJob(final Boolean isCurentJob) {
        this.isCurentJob = isCurentJob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(final LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(final LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public String getJobLocationCity() {
        return jobLocationCity;
    }

    public void setJobLocationCity(final String jobLocationCity) {
        this.jobLocationCity = jobLocationCity;
    }

    public String getJobLocationCountry() {
        return jobLocationCountry;
    }

    public void setJobLocationCountry(final String jobLocationCountry) {
        this.jobLocationCountry = jobLocationCountry;
    }

    public String getDicription() {
        return dicription;
    }

    public void setDicription(final String dicription) {
        this.dicription = dicription;
    }

    public SeekerProfile getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(final SeekerProfile userAccount) {
        this.userAccount = userAccount;
    }

}

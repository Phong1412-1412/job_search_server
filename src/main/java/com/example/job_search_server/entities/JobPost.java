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
public class JobPost {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column
    private Boolean isCompanyNameHidden;

    @Column
    private LocalDate createdDate;

    @Column
    private String jobDecription;

    @Column
    private Boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "posted_by_id")
    private UserAccount postedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_type_id")
    private JobType jobType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_location_id")
    private JobLocation jobLocation;

    @OneToMany(mappedBy = "jobPost")
    private Set<JobPostActivity> jobPostJobPostActivitys;

    @OneToMany(mappedBy = "jobPost")
    private Set<JobPostSkillSet> jobPostJobPostSkillSets;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Boolean getIsCompanyNameHidden() {
        return isCompanyNameHidden;
    }

    public void setIsCompanyNameHidden(final Boolean isCompanyNameHidden) {
        this.isCompanyNameHidden = isCompanyNameHidden;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getJobDecription() {
        return jobDecription;
    }

    public void setJobDecription(final String jobDecription) {
        this.jobDecription = jobDecription;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public UserAccount getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(final UserAccount postedBy) {
        this.postedBy = postedBy;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(final JobType jobType) {
        this.jobType = jobType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(final JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }

    public Set<JobPostActivity> getJobPostJobPostActivitys() {
        return jobPostJobPostActivitys;
    }

    public void setJobPostJobPostActivitys(final Set<JobPostActivity> jobPostJobPostActivitys) {
        this.jobPostJobPostActivitys = jobPostJobPostActivitys;
    }

    public Set<JobPostSkillSet> getJobPostJobPostSkillSets() {
        return jobPostJobPostSkillSets;
    }

    public void setJobPostJobPostSkillSets(final Set<JobPostSkillSet> jobPostJobPostSkillSets) {
        this.jobPostJobPostSkillSets = jobPostJobPostSkillSets;
    }

}

package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
public class EducationDetail {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String certificateDegreeName;

    @Column(length = 50)
    private String major;

    @Column(length = 50)
    private String instituteUniversityName;

    @Column
    private LocalDate startingDate;

    @Column
    private LocalDate completion;

    @Column
    private Double percentage;

    @Column
    private Double cgpe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile userAccount;

    public String getCertificateDegreeName() {
        return certificateDegreeName;
    }

    public void setCertificateDegreeName(final String certificateDegreeName) {
        this.certificateDegreeName = certificateDegreeName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(final String major) {
        this.major = major;
    }

    public String getInstituteUniversityName() {
        return instituteUniversityName;
    }

    public void setInstituteUniversityName(final String instituteUniversityName) {
        this.instituteUniversityName = instituteUniversityName;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(final LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getCompletion() {
        return completion;
    }

    public void setCompletion(final LocalDate completion) {
        this.completion = completion;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(final Double percentage) {
        this.percentage = percentage;
    }

    public Double getCgpe() {
        return cgpe;
    }

    public void setCgpe(final Double cgpe) {
        this.cgpe = cgpe;
    }

    public SeekerProfile getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(final SeekerProfile userAccount) {
        this.userAccount = userAccount;
    }

}

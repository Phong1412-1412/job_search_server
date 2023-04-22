package com.example.job_search_server.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class UserAccount {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 100)
    private String password;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private Boolean gender;

    @Column
    private Boolean isActive;

    @Column
    private Integer contactNumber;

    @Column
    private Boolean smsNotificationActive;

    @Column
    private Boolean emailNotificationActive;

    @Column
    private String userImage;

    @Column(nullable = false)
    private LocalDate registration;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id")
    @JsonFormat
    private UserType userType;

    @OneToMany(mappedBy = "userAccount")
    private Set<UserLog> userAccountUserLogs;

    @OneToMany(mappedBy = "userAccount")
    private Set<SeekerProfile> userAccountSeekerProfiles;

    @OneToMany(mappedBy = "postedBy")
    private Set<JobPost> postedByJobPosts;

    @OneToMany(mappedBy = "userAccount")
    private Set<JobPostActivity> userAccountJobPostActivitys;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(final Boolean gender) {
        this.gender = gender;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(final Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Boolean getSmsNotificationActive() {
        return smsNotificationActive;
    }

    public void setSmsNotificationActive(final Boolean smsNotificationActive) {
        this.smsNotificationActive = smsNotificationActive;
    }

    public Boolean getEmailNotificationActive() {
        return emailNotificationActive;
    }

    public void setEmailNotificationActive(final Boolean emailNotificationActive) {
        this.emailNotificationActive = emailNotificationActive;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(final String userImage) {
        this.userImage = userImage;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(final LocalDate registration) {
        this.registration = registration;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(final UserType userType) {
        this.userType = userType;
    }

    public Set<UserLog> getUserAccountUserLogs() {
        return userAccountUserLogs;
    }

    public void setUserAccountUserLogs(final Set<UserLog> userAccountUserLogs) {
        this.userAccountUserLogs = userAccountUserLogs;
    }

    public Set<SeekerProfile> getUserAccountSeekerProfiles() {
        return userAccountSeekerProfiles;
    }

    public void setUserAccountSeekerProfiles(final Set<SeekerProfile> userAccountSeekerProfiles) {
        this.userAccountSeekerProfiles = userAccountSeekerProfiles;
    }

    public Set<JobPost> getPostedByJobPosts() {
        return postedByJobPosts;
    }

    public void setPostedByJobPosts(final Set<JobPost> postedByJobPosts) {
        this.postedByJobPosts = postedByJobPosts;
    }

    public Set<JobPostActivity> getUserAccountJobPostActivitys() {
        return userAccountJobPostActivitys;
    }

    public void setUserAccountJobPostActivitys(
            final Set<JobPostActivity> userAccountJobPostActivitys) {
        this.userAccountJobPostActivitys = userAccountJobPostActivitys;
    }

}

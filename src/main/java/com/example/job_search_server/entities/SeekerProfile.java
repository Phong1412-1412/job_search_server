package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class SeekerProfile {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String userName;

    @Column
    private Double curentSalary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private UserAccount userAccount;

    @OneToMany(mappedBy = "userAccount")
    private Set<EducationDetail> userAccountEducationDetails;

    @OneToMany(mappedBy = "userAccount")
    private Set<ExperienceDetail> userAccountExperienceDetails;

    @OneToMany(mappedBy = "userAccount")
    private Set<SeekerSkillSet> userAccountSeekerSkillSets;

    public String getUserName() {
        return userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }

    public Double getCurentSalary() {
        return curentSalary;
    }

    public void setCurentSalary(final Double curentSalary) {
        this.curentSalary = curentSalary;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(final UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Set<EducationDetail> getUserAccountEducationDetails() {
        return userAccountEducationDetails;
    }

    public void setUserAccountEducationDetails(
            final Set<EducationDetail> userAccountEducationDetails) {
        this.userAccountEducationDetails = userAccountEducationDetails;
    }

    public Set<ExperienceDetail> getUserAccountExperienceDetails() {
        return userAccountExperienceDetails;
    }

    public void setUserAccountExperienceDetails(
            final Set<ExperienceDetail> userAccountExperienceDetails) {
        this.userAccountExperienceDetails = userAccountExperienceDetails;
    }

    public Set<SeekerSkillSet> getUserAccountSeekerSkillSets() {
        return userAccountSeekerSkillSets;
    }

    public void setUserAccountSeekerSkillSets(
            final Set<SeekerSkillSet> userAccountSeekerSkillSets) {
        this.userAccountSeekerSkillSets = userAccountSeekerSkillSets;
    }

}

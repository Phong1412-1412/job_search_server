package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class SeekerSkillSet {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer skillLevel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile userAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "skill_set_id")
    private SkillSet skillSet;

    public Integer getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(final Integer skillLevel) {
        this.skillLevel = skillLevel;
    }

    public SeekerProfile getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(final SeekerProfile userAccount) {
        this.userAccount = userAccount;
    }

    public SkillSet getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(final SkillSet skillSet) {
        this.skillSet = skillSet;
    }

}

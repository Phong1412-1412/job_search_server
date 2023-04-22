package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class SkillSet {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String skillName;

    @OneToMany(mappedBy = "skillSet")
    private Set<SeekerSkillSet> skillSetSeekerSkillSets;

    @OneToMany(mappedBy = "skillSet")
    private Set<JobPostSkillSet> skillSetJobPostSkillSets;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(final String skillName) {
        this.skillName = skillName;
    }

    public Set<SeekerSkillSet> getSkillSetSeekerSkillSets() {
        return skillSetSeekerSkillSets;
    }

    public void setSkillSetSeekerSkillSets(final Set<SeekerSkillSet> skillSetSeekerSkillSets) {
        this.skillSetSeekerSkillSets = skillSetSeekerSkillSets;
    }

    public Set<JobPostSkillSet> getSkillSetJobPostSkillSets() {
        return skillSetJobPostSkillSets;
    }

    public void setSkillSetJobPostSkillSets(final Set<JobPostSkillSet> skillSetJobPostSkillSets) {
        this.skillSetJobPostSkillSets = skillSetJobPostSkillSets;
    }

}

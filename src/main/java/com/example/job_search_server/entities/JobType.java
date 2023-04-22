package com.example.job_search_server.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class JobType {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(nullable = false, length = 100)
    private String jobTypeName;

    @OneToMany(mappedBy = "jobType")
    private Set<JobPost> jobTypeJobPosts;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(final String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    public Set<JobPost> getJobTypeJobPosts() {
        return jobTypeJobPosts;
    }

    public void setJobTypeJobPosts(final Set<JobPost> jobTypeJobPosts) {
        this.jobTypeJobPosts = jobTypeJobPosts;
    }

}

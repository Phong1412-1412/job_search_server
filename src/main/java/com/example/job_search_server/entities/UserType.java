package com.example.job_search_server.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;


@Entity
public class UserType {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String userTypeName;

    @OneToMany(mappedBy = "userType")
    @JsonIgnore
    private Set<UserAccount> userTypeUserAccounts;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(final String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public Set<UserAccount> getUserTypeUserAccounts() {
        return userTypeUserAccounts;
    }

    public void setUserTypeUserAccounts(final Set<UserAccount> userTypeUserAccounts) {
        this.userTypeUserAccounts = userTypeUserAccounts;
    }

}

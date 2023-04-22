package com.example.job_search_server.service;

import com.example.job_search_server.entities.UserAccount;
import com.example.job_search_server.entities.UserType;
import com.example.job_search_server.iservice.IUserAccount;
import com.example.job_search_server.iservice.UserRole;
import com.example.job_search_server.repositories.UserAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAccountService implements IUserAccount {
    private final UserAccountRepository userAccountRepository;
    @Override
    public Optional<List<UserAccount>> getAllUserAccount() {
        return Optional.empty();
    }
    @Override
    public Optional<UserAccount> getUserByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<UserAccount> getUserByID(String id) {
        return Optional.empty();
    }

    @Override
    public UserAccount updateUserByID(String id) {
        return null;
    }

    @Override
    public void deleteUserByID(String id) {

    }

    @Override
    public List<UserType> findUserByType(UserRole userRole) {
        return null;
    }
}

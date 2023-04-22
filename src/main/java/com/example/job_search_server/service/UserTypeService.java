package com.example.job_search_server.service;

import com.example.job_search_server.entities.UserType;
import com.example.job_search_server.iservice.IUserType;
import com.example.job_search_server.iservice.UserRole;
import com.example.job_search_server.repositories.UserTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserTypeService implements IUserType {
    private final UserTypeRepository userTypeRepository;
    @Override
    public List<UserType> getAllUserType() {
        return userTypeRepository.findAll();
    }
}

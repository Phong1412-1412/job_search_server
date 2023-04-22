package com.example.job_search_server.controller;

import com.example.job_search_server.entities.UserType;
import com.example.job_search_server.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/usertype")
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;
    @GetMapping("/all")
    public ResponseEntity<List<UserType>> getAllUserType() {
        return ResponseEntity.ok().body(userTypeService.getAllUserType());
    }
}

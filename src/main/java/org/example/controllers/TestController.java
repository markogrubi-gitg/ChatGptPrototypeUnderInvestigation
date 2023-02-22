package org.example.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PreAuthorize("hasRole('ROLE_EMPLOYEE')")
    @GetMapping(value="/test")
    public String testMethod(){
        return "Simple String returned by Test Method";
    }
}

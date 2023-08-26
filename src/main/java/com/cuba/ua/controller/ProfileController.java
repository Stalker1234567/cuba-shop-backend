package com.cuba.ua.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profile")
@PreAuthorize("hasRole('MANAGER')")
public class ProfileController {
}

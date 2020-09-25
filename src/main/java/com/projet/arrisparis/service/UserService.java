package com.projet.arrisparis.service;

import com.projet.arrisparis.model.User;
import com.projet.arrisparis.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}

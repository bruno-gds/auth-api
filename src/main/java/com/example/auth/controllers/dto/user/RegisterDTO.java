package com.example.auth.controllers.dto.user;

import com.example.auth.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}

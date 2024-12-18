package com.example.auth.domain.user.dto;

import com.example.auth.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}

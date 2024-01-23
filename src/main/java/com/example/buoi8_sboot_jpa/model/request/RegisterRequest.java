package com.example.buoi8_sboot_jpa.model.request;

import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    String username;
    String email;
    String password;
    String confirmPassword;
}

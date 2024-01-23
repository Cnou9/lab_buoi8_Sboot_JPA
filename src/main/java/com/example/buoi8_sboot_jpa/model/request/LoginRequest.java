package com.example.buoi8_sboot_jpa.model.request;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    String email;
    String password;
}

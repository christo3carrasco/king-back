package com.king.burgos.app.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String dni;
    private String firstname;
    private String lastname;
    private String phone;
    private Date birth;
    private String gender;
    private String email;
    private String password;
}

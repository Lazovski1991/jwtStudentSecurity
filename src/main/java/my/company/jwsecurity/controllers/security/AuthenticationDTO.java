package my.company.jwsecurity.controllers.security;

import lombok.Data;

@Data
public class AuthenticationDTO {
    private String email;
    private String password;
}

package my.company.jwsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "registered")
    private LocalDateTime localDateTime;
    @Column(name = "status")
    private boolean status;
}

package com.restaurant.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;
    public String name;
    public String surname;
    public String username;
    public String password;
    public String address;
    public String phone;
    public String email;

    @Enumerated(EnumType.STRING)
    private Role role;

}

package com.ticketing.entity;

import com.ticketing.enums.Gender;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private Boolean enabled;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;


    @Enumerated(EnumType.STRING)
    private Gender gender;
}
package com.ticketing.dto;

import com.ticketing.enums.Gender;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;
}

package com.ticketing.service;

import com.ticketing.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDTO> listAllUsers();

    UserDTO findByUserName(String username);

    void save(UserDTO dto);

    UserDTO update(UserDTO dto);

    void delete(String username);
}

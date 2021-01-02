package com.ticketing.service;

import com.ticketing.dto.RoleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {

    List<RoleDTO> listAllRoles();

    RoleDTO findById(long id);
}

package com.ticketing.implementation;

import com.ticketing.dto.RoleDTO;
import com.ticketing.entity.Role;
import com.ticketing.mapper.RoleMapper;
import com.ticketing.repository.RoleRepository;
import com.ticketing.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {


    private RoleRepository roleRepository;
    private RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {

        List<Role> list = roleRepository.findAll();

        //convert to DTO and return it - why we need mapper - after
        return list.stream().map(obj -> {
            return roleMapper.convertToDto(obj);
        }).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(long id) {
        Role role = roleRepository.findById(id).get();

        return roleMapper.convertToDto(role);
    }
}

package com.ticketing.implementation;

import com.ticketing.dto.ProjectDTO;
import com.ticketing.entity.Project;
import com.ticketing.enums.Status;
import com.ticketing.mapper.ProjectMapper;
import com.ticketing.mapper.UserMapper;
import com.ticketing.repository.ProjectRepository;
import com.ticketing.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectMapper projectMapper;
    private ProjectRepository projectRepository;
    private UserMapper userMapper;

    public ProjectServiceImpl(ProjectMapper projectMapper, ProjectRepository projectRepository, UserMapper userMapper) {
        this.projectMapper = projectMapper;
        this.projectRepository = projectRepository;
        this.userMapper = userMapper;
    }

    @Override
    public ProjectDTO getByProjectCode(String code) {
        return null;
    }

    @Override
    public List<ProjectDTO> listAllProjects() {
        return null;
    }

    @Override
    public void save(ProjectDTO dto) {
        dto.setProjectStatus(Status.OPEN);
        Project obj = projectMapper.convertToEntity(dto);
        obj.setAssignedManager(userMapper.convertToEntity(dto.getAssignedManager()));
        projectRepository.save(obj);
    }

    @Override
    public ProjectDTO update(ProjectDTO dto) {
        return null;
    }

    @Override
    public void delete(String code) {

    }
}

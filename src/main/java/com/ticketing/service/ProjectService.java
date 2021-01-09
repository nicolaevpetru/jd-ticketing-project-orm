package com.ticketing.service;

import com.ticketing.dto.ProjectDTO;
import com.ticketing.entity.Project;

import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);

    List<ProjectDTO> listAllProjects();

    Project save(ProjectDTO dto);

    void update(ProjectDTO dto);

    void delete(String code);

    void complete(String projectCode);

    List<ProjectDTO> listAllProjectDetails();
}

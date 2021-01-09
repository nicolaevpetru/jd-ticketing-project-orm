package com.ticketing.service;

import com.ticketing.dto.TaskDTO;
import com.ticketing.entity.Task;

import java.util.List;

public interface TaskService {

    TaskDTO findById(Long id);

    List<TaskDTO> listAllTasks();

    Task save(TaskDTO dto);

    void update(TaskDTO dto);

    void delete(long id);

    int totalNonCompletedTasks(String projectCode);

    int totalCopletedTasks(String projectCode);
}

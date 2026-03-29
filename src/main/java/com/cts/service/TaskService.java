package com.cts.service;

import com.cts.exception.TaskNotFoundException;
import com.cts.model.Task;

public interface TaskService {
    Task createTask(Task t);
    Task findTaskById(Long id);
    Task updateTaskById(Long id, Task t);
}

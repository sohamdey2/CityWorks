package com.cts.service;

import com.cts.exception.TaskNotFoundException;
import com.cts.model.Task;

public interface TaskService {
    Task createTask(Task t);
    Task findTaskById(int id) throws TaskNotFoundException;
    Task updateTaskById(int id, Task t) throws TaskNotFoundException;
}

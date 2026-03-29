package com.cts.service;

import com.cts.dao.TaskDAO;
import com.cts.exception.TaskNotFoundException;
import com.cts.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskDAO taskDAO;
    @Override
    public Task createTask(Task t) {
        return taskDAO.save(t);
    }

    @Override
    public Task findTaskById(Long id){
        return taskDAO.findById(id).orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
    }

    @Override
    public Task updateTaskById(Long id, Task newTask){
        Task oldTask = findTaskById(id);
        oldTask.setWorkOrderId(newTask.getWorkOrderId());
        oldTask.setDescription(newTask.getDescription());
        oldTask.setAssignedTo(newTask.getAssignedTo());
        oldTask.setStatus(newTask.getStatus());
        return taskDAO.save(oldTask);
    }

}

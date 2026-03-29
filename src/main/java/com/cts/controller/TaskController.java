package com.cts.controller;

import com.cts.exception.TaskNotFoundException;
import com.cts.model.Task;
import com.cts.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping
    public Task createTask(@Valid @RequestBody Task task){

        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public Task findTaskById(@PathVariable("id") Long id){
        Task t = taskService.findTaskById(id);
        return t;
    }

    @PutMapping("/{id}")
    public Task updateMobileById(@PathVariable("id") Long id, @RequestBody Task t){
        return taskService.updateTaskById(id, t);
    }
}

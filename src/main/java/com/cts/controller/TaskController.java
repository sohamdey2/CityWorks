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
    public Task findTaskById(@PathVariable("id") int id){
        try{
            Task t = taskService.findTaskById(id);
            return t;
        }
        catch (TaskNotFoundException tnfe){
            System.out.println(tnfe);
            return null;
        }
    }

    @PutMapping("/{id}")
    public Task updateMobilebyId(@PathVariable("id") int id, @RequestBody Task t){
        try {
            Task tk = taskService.updateTaskById(id, t);
            return tk;
        }
        catch (TaskNotFoundException tnfe){
            System.out.println(tnfe);
            return null;
        }
    }
}

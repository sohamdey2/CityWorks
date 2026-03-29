package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.model.Task;

public interface TaskDAO extends JpaRepository<Task, Integer> {

}


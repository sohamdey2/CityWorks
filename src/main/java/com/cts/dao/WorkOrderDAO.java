package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.model.WorkOrder;

public interface WorkOrderDAO extends JpaRepository<WorkOrder, Long> {

}

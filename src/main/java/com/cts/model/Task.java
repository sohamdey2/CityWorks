package com.cts.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;
    private int workOrderId;
    private String description;
    private String assignedTo;
    private LocalDate dueDate;
    @NotNull
    @Column(nullable = false)
    @Builder.Default
    private String status = "Open";
    public Task(int workOrderId,String description, String assignedTo, LocalDate dueDate, String status){
        super();
        this.workOrderId = workOrderId;
        this.description = description;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.status = status;
    }
}

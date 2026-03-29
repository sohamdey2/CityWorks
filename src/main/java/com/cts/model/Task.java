package com.cts.model;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name="task")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private Long workOrderId;
    private String description;
    private Long assignedTo;
    private LocalDate dueDate;
    @NotNull
    @Column(nullable = false)
    @Builder.Default
    private String status = "Open";
    public Task(Long workOrderId,String description, Long assignedTo, LocalDate dueDate, String status){
        super();
        this.workOrderId = workOrderId;
        this.description = description;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.status = status;
    }
}

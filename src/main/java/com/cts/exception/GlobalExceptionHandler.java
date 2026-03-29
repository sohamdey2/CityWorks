package com.cts.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TaskNotFoundException.class)
    public ResponseEntity<String> handleTaskNotFoundException(TaskNotFoundException tnfe){
        HttpStatus status = HttpStatus.NOT_FOUND;
        System.out.println("HTTP Status: " + status.value());
        return new ResponseEntity<>(tnfe.getMessage(), status);
    }
}

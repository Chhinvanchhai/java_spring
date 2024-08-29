package com.example.demo.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomGlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Map<String, Object>> handleConstraintViolationException(ConstraintViolationException ex) {
        Map<String, Object> responseBody = new HashMap<>();

        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.BAD_REQUEST.value());
        responseBody.put("error", "Validation Error");
        
        // Get the first violation message
        String errorMessage = ex.getConstraintViolations().iterator().next().getMessage();
        responseBody.put("message", errorMessage);
        responseBody.put("path", "/api/v1/user"); // Adjust this to match your actual path

        return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
    }

    // Other exception handlers...
}

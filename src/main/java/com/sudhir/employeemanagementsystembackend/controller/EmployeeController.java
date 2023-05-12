package com.sudhir.employeemanagementsystembackend.controller;

import com.sudhir.employeemanagementsystembackend.model.Employee;
import com.sudhir.employeemanagementsystembackend.model.Feedback;
import com.sudhir.employeemanagementsystembackend.repository.EmployeeRepository;
import com.sudhir.employeemanagementsystembackend.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private FeedbackRepository feedbackRepository;





}

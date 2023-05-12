package com.sudhir.employeemanagementsystembackend.controller;

import com.sudhir.employeemanagementsystembackend.model.Feedback;
import com.sudhir.employeemanagementsystembackend.repository.EmployeeRepository;
import com.sudhir.employeemanagementsystembackend.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/feedack/")
public class FeedBackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/feedbacks")
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @DeleteMapping("/feedbacks/{id}")
    public String deleteFeedback(@PathVariable("id") Long id) {
        feedbackRepository.deleteById(id);
        return "feedback deleted";
    }

    @PutMapping("/feedbacks/{id}")
    public Feedback updateFeedback(@PathVariable("id") Long id, @RequestBody Feedback feedback) {

        feedbackRepository.deleteById(id);
        return  feedbackRepository.save(feedback);

    }

    @PostMapping("/feedbacks")
    public Feedback createFeedback(@RequestBody Feedback feedback) {
       return  feedbackRepository.save(feedback);
    }

}

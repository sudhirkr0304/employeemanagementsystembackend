package com.sudhir.employeemanagementsystembackend.repository;

import com.sudhir.employeemanagementsystembackend.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}

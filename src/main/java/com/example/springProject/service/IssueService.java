package com.example.springProject.service;

import com.example.springProject.entity.Issue;
import com.example.springProject.entity.IssueHistory;
import com.example.springProject.repository.IssueRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService  {

    Issue save(Issue issue);

    Issue getById(Long id);

    Page<Issue> getAllPageable(Pageable pageable);
}

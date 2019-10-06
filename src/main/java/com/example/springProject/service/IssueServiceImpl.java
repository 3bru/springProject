package com.example.springProject.service;

import com.example.springProject.entity.Issue;
import com.example.springProject.repository.IssueRepo;
import com.example.springProject.service.IssueService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class IssueServiceImpl implements IssueService {

    //Constructor ile implementation ediyorum;

    private final IssueRepo issueRepo;

    public IssueServiceImpl(IssueRepo issueRepo) {
        this.issueRepo = issueRepo;
    }


    @Override
    public Issue save(Issue issue) {
        return issueRepo.save(issue);
    }

    @Override
    public Issue getById(Long id) {
        return issueRepo.getOne(id);
    }

    @Override
    public Page<Issue> getAllPageable(Pageable pageable) {
        return issueRepo.findAll(pageable);
    }
}

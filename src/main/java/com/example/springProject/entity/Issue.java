package com.example.springProject.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "descpription", length = 400)
    private String description;

    @Column(name = "details",length = 400)
    private Date details;

    @Column(name = "description")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description", length = 400)
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private  Project project;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private  User assignee;

}

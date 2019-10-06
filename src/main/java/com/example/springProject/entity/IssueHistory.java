package com.example.springProject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JoinColumn(name = "issue")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private  Issue issue;

    @Column(name = "descpription", length = 400)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "details",length = 400)
    private Date details;

    @Column(name = "description")
    private Date date;

    @Column(name = "description", length = 400)
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private  User assignee;
}

package com.example.springProject.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends  BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_name", length = 400)
    private String projectName;

    @Column(name = "project_code", length = 400)
    private String projectCode;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private  User manager;

//    @JoinColumn(name = "project_id")
//    @ManyToOne(optional = true, fetch = FetchType.LAZY)
//    private Project projectId;
}

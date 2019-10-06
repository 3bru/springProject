package com.example.springProject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name" , length = 100, unique = true)
    private String name;

    @Column(name = "surname",length = 100)
    private String surname;

    @Column(name = "passwd", unique = true)
    private String password;

    @Column(name = "email", length = 200, unique = true)
    private String email;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;

}

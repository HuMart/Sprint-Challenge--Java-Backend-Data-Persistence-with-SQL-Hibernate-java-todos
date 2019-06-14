package com.lambdaschool.todos.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Entity
@Table(name = "todos")
public class Todo
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column(nullable = false)
    private String description;

    @Temporal(TIMESTAMP)
    private Date dateStarted;

    @Temporal(TIMESTAMP)
    private Date datetime;

    private boolean completed;

    @ManyToOne
    @Column(nullable = false)
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("todos")
    private User user;
}

package com.javatar.jwtservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;


}

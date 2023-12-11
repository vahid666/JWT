package com.javatar.jwtservice.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;
    private String family ;
    private String phone ;
}

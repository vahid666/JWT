package com.javatar.jwtservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name ;
    private String family ;
    private String adress ;

}

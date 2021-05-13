package com.baixing.entity.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "app")
public class App {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cnName;
    private String description;


}
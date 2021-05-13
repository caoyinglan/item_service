package com.baixing.entity.po;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer app_id;
    private String key_prop;
    private String value_prop;
    private String comment;

}

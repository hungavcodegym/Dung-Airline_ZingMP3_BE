package com.zingmp3.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "songs")
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String avatar;
    @Column(nullable = false)
    private String fileMp3;
    private Date dateUpLoad;
}

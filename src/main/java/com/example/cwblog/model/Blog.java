package com.example.cwblog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "blog_data")
@Getter
@Setter
@RequiredArgsConstructor
@Data
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blogid;

    private String title;

    private String content;

    private String author;

    private Long Date;


}

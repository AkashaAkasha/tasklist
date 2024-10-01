package com.example.tasklist.domain.task;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Task {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

//    @Enumerated(value = EnumType.STRING)
    private Status status;

    private LocalDateTime expirationDate;

//    @Column(name = "image")
//    @CollectionTable(name = "tasks_images")
//    @ElementCollection(fetch = FetchType.EAGER)
//    private List<String> images;

}

package com.example.tasklist.domain.user;

import com.example.tasklist.domain.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;

//    @Transient
    private String passwordConfirmation;

//    @Column(name = "role")
//    @ElementCollection(fetch = FetchType.EAGER)
//    @CollectionTable(name = "users_roles")
//    @Enumerated(value = EnumType.STRING)
    private Set<Role> roles;

//    @OneToMany(fetch = FetchType.EAGER)
//    @JoinTable(inverseJoinColumns = @JoinColumn(name = "task_id"))
    private List<Task> tasks;
}

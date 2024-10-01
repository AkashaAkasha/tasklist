package com.example.tasklist.service;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {
    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

//    List<Task> getAllSoonTasks(Duration duration);

    Task update(Task task);

    Task create(Task task);

    void delete(Long id);

//    void uploadImage(Long id, TaskImage image);
}

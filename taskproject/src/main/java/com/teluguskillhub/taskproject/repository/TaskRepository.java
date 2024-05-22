package com.teluguskillhub.taskproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teluguskillhub.taskproject.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

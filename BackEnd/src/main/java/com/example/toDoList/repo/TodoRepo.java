package com.example.toDoList.repo;

import com.example.toDoList.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Integer>{
}

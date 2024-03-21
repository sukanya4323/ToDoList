package com.example.toDoList.services;

import com.example.toDoList.model.TodoItem;
import com.example.toDoList.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServices {

    @Autowired
    private TodoRepo toDoRepository;

    public TodoItem saveToDo(TodoItem toDo) {
        return toDoRepository.save(toDo);
    }

    public TodoItem getToDoById(int id) {
        if (toDoRepository.findById(id).get() != null) {
            return toDoRepository.findById(id).get();
        }
        return null;
    }

    public List<TodoItem> getAllToDo() {
        return toDoRepository.findAll();
    }

    public TodoItem updateToDo(TodoItem toDo) {
        return toDoRepository.save(toDo);
    }

    public int deleteToDo(int id) {
        if (toDoRepository.findById(id).get() != null) {
            toDoRepository.deleteById(id);
            return id;
        }
        return -1;
    }


}

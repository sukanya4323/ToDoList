package com.example.toDoList.controller;

import com.example.toDoList.model.TodoItem;
import com.example.toDoList.services.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping(value="/todo")
public class TodoController {


    @Autowired
    private ToDoServices services;

    @PostMapping("/saveToDo")
    public TodoItem saveToDo(@RequestBody TodoItem toDo){
        return services.saveToDo(toDo);
    }

    @GetMapping("/fetchToDoById/{id}")
    public TodoItem fetchToDoById(@PathVariable(name = "id") int id) {
        return services.getToDoById(id);
    }

    @GetMapping("/fetchAllToDo")
    public List<TodoItem> fetchAllToDo(){
        return services.getAllToDo();
    }

    @PutMapping("/update")
    public TodoItem update(@RequestBody TodoItem toDo){
        return services.updateToDo(toDo);
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable(name = "id") int id) {
        return services.deleteToDo(id);
    }
}

package com.example.todo_api.service;

import java.util.List;

import com.example.todo_api.model.TodoModel;

public interface TodoService {
    public TodoModel createTodo(TodoModel task);
    List<TodoModel> getAllTodo();
    public TodoModel updateTodo(Long id,TodoModel task);
    public void deleteTodo(Long id);
}

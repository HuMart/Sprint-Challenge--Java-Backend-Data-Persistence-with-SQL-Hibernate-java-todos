package com.lambdaschool.todos.service;

import com.lambdaschool.todos.model.Todo;

import java.util.List;

public interface TodoService
{
    List<Todo> findAllById(long id);

    Todo findTodoById(long id);

    Todo save(Todo todo);

    void delete(long id);

    Todo update(Todo todo, long id);
}


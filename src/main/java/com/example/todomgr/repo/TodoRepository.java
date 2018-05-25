package com.example.todomgr.repo;


import com.example.todomgr.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
public interface TodoRepository extends CrudRepository<Todo, String> {
    List<Todo> findByPriority(int priority);
}



package com.greenfox.todoslist.repository;

import com.greenfox.todoslist.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

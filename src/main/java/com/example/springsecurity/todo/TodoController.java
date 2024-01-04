package com.example.springsecurity.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {


    Logger logger = LoggerFactory.getLogger(TodoController.class);

    private static List<Todo> TO_DO_LIST = List.of(new Todo("user", "Hi, there!"),
            new Todo("user2", "Hi There 2!"));

    @GetMapping("/todos")
    public List<Todo> retreiveAllTodos() {
        return TO_DO_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retreiveTodoForSprcificUser(@PathVariable("username") String username) {
        return TO_DO_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable("username") String username, @RequestBody Todo todo) {
        logger.info("Create {} for {}", todo, username);
        TO_DO_LIST.add(todo);
    }


}

package com.example.todomgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class TodoMgrApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoMgrApplication.class, args);
    }

}






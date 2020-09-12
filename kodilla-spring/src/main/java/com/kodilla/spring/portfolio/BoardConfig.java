package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;


    @Bean(name  = "toDoList")
    public TaskList getToDo(){
        return new TaskList();
    }
    @Bean(name  = "inProgressList")
    public TaskList getInProgress(){
        return new TaskList();
    }
    @Bean(name  = "doneList")
    public TaskList getDone(){
        return new TaskList();
    }

    @Bean
    public Board getBoardList(){
        return  new Board(toDoList,inProgressList,doneList);
    }



}

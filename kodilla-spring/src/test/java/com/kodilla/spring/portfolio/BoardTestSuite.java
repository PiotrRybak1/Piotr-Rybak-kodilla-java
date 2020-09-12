package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {


    @Test
    public void testIfToDoListIsCreated() {
        //Given
        ApplicationContext contex = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = contex.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("one task to do");
        board.getInProgressList().getTasks().add("one task in progress");
        board.getDoneList().getTasks().add("one task done");

        //Then
        Assert.assertEquals("one task to do", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("one task in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("one task done", board.getDoneList().getTasks().get(0));

    }
}

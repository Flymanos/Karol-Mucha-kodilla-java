package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = (Board)context.getBean(Board.class);
        //when
        board.getDoneList().getTasks().add("Task1");
        board.getInProgressList().getTasks().add("Task2");
        board.getToDoList().getTasks().add("Task3");
        //then
        Assert.assertEquals("Task1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("Task2", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Task3", board.getToDoList().getTasks().get(0));
    }
}

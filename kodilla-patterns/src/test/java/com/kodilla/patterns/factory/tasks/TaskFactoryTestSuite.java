package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {


    @Test
    public void testDrivingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.makeTask(TaskFactory.DRIVING);
        task.executeTask();
        //then
        Assert.assertEquals(TaskFactory.DRIVING, task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }

    @Test
    public void testShoppingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.makeTask(TaskFactory.SHOPPING);
        //then
        Assert.assertEquals(TaskFactory.SHOPPING, task.getTaskName());
        Assert.assertFalse(task.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        //given
        TaskFactory taskFactory = new TaskFactory();
        //when
        Task task = taskFactory.makeTask(TaskFactory.PAINTING);
        task.executeTask();
        //then
        Assert.assertEquals(TaskFactory.PAINTING, task.getTaskName());
        Assert.assertTrue(task.isTaskExecuted());
    }
}

package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.TaskTypes.SHOPPING);

        //Then
        Assert.assertEquals("Task name - buying a new device - consisting in buying iPad in an amount " + 1.0 + " has been initiated", shopping.executeTask());
        Assert.assertEquals("buying a new device", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.TaskTypes.PAINTING);

        //Then
        Assert.assertEquals("Task name - paint the living room - based on painting living room on color gray has been initiated", painting.executeTask());
        Assert.assertEquals("paint the living room", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.TaskTypes.DRIVING);

        //Then
        Assert.assertEquals("Task name - go on vacation - consisting of reaching on Masurian lakes by means of transport own car has been initiated", driving.executeTask());
        Assert.assertEquals("go on vacation", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());

    }
}

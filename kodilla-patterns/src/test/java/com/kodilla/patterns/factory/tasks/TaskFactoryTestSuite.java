package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        String result = shoppingTask.executeTask();

        //Then
        assertEquals("ShoppingTask executed", result);
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        String result = paintingTask.executeTask();

        //Then
        assertEquals("PaintingTask executed", result);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        String result = drivingTask.executeTask();

        //Then
        assertEquals("DrivingTask executed", result);
        assertTrue(drivingTask.isTaskExecuted());
    }
}
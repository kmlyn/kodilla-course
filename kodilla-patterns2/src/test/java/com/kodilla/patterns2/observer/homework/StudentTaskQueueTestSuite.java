package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskQueueTestSuite {
    @Test
    public void testQueue() {
        //Given
        Mentor m1 = new Mentor("J Abraham");
        Mentor m2 = new Mentor("A Banks");
        StudentTaskQueue stq1 = new StudentTaskQueue("J Smith");
        StudentTaskQueue stq2 = new StudentTaskQueue("O Escobar");
        StudentTaskQueue stq3 = new StudentTaskQueue("A Pinkman");
        stq1.registerObserver(m1);
        stq2.registerObserver(m2);
        stq3.registerObserver(m2);

        //When
        stq1.addTask("8.2");
        stq1.addTask("9.3");
        stq2.addTask("1.2");
        stq2.addTask("1.4");
        stq2.addTask("2.1");
        stq3.addTask("12.4");

        //Then
        assertEquals(2, m1.getTasksToCheck());
        assertEquals(4, m2.getTasksToCheck());
    }
}

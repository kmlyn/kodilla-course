package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {
        //Given & When
        board.getToDoList().getTasks().add("Sample task to do");
        board.getInProgressList().getTasks().add("Sample task in progress");
        board.getDoneList().getTasks().add("Sample task done");

        //Then
        assertEquals("Sample task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Sample task in progress", board.getInProgressList().getTasks().get(0));
        assertEquals("Sample task done", board.getDoneList().getTasks().get(0));
    }
}

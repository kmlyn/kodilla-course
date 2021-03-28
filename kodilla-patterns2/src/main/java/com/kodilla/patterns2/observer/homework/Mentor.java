package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private int tasksToCheck;
    private final String name;

    public Mentor(String name) {
        this.name = name;
        this.tasksToCheck = 0;
    }

    @Override
    public void update(StudentTaskQueue studentTaskQueue) {
        ++tasksToCheck;
    }

    public int getTasksToCheck() {
        return tasksToCheck;
    }

    public String getName() {
        return name;
    }
}

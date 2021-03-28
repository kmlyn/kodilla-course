package com.kodilla.patterns2.observer.homework;

import java.util.Deque;
import java.util.LinkedList;

public class StudentTaskQueue implements Observable {
    private Observer observer;
    private final String studentName;
    private final Deque<String> tasks;

    public StudentTaskQueue(String studentName) {
        this.studentName = studentName;
        this.tasks = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObservers() {
        observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observer = null;
    }

    public String getStudentName() {
        return studentName;
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
}

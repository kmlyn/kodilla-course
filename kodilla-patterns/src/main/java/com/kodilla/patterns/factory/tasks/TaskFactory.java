package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Auchan", "Steak", 2);
            case DRIVING:
                return new DrivingTask("Go to a shop", "Auchan", "Car");
            case PAINTING:
                return new PaintingTask("Paint a room","yellow", "room");
            default:
                return null;
        }
    }
}

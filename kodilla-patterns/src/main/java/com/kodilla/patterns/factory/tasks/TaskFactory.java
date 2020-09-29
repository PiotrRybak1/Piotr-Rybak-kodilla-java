package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("buying a new device", "iPad", 1.0);
            case PAINTING:
                return new PaintingTask("paint the living room", "gray", "living room");
            case DRIVING:
                return new DrivingTask("go on vacation", "on Masurian lakes", "own car");
            default:
                return null;
        }
    }
}

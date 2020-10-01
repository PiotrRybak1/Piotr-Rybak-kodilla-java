package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public enum TaskTypes {
        SHOPPING,
        PAINTING,
        DRIVING
    }

    public final Task makeTask(final TaskTypes taskEnum) {
        switch (taskEnum) {
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

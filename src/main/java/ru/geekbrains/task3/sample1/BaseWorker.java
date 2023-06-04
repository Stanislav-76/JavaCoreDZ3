package ru.geekbrains.task3.sample1;

import java.util.Comparator;

public abstract class BaseWorker {
    protected String name;
    double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseWorker(String name) {
        this.name = name;
    }

    abstract double salary();
}

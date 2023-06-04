package ru.geekbrains.task3.sample1;

import java.util.Comparator;

public class WorkerHourly extends BaseWorker {

    private double hourlyRate;

    public WorkerHourly(double hourlyRate) {
        this("noname", hourlyRate);
    }

    public WorkerHourly(String name, double hourlyRate) {
        super(name);
        if (name == null || name.length() < 3){
            this.name = "noname";
        }
        else{
            this.name = name;
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double salary() {
        return 20.8 * 8 * hourlyRate;
    }

    @Override
    public String toString() {
        return "WorkerHourly{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                "}, Salary=" + salary();
    }
}

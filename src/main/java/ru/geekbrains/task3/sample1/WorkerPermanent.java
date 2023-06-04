package ru.geekbrains.task3.sample1;

import java.util.Comparator;

public class WorkerPermanent extends BaseWorker {

    private double fixedMonthlyPayment;

    public WorkerPermanent(double fixedMonthlyPayment) {
        this("noname", fixedMonthlyPayment);
    }

    public WorkerPermanent(String name, double fixedMonthlyPayment) {
        super(name);
        if (name == null || name.length() < 3){
            this.name = "noname";
        }
        else{
            this.name = name;
        }
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public double salary() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "WorkerPermanent{" +
                "name='" + name + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                "}, Salary=" + salary();
    }
}

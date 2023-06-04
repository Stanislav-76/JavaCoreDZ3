package ru.geekbrains.task3;

import ru.geekbrains.task3.sample1.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        WorkerHourly workerHourly = new WorkerHourly(100);
        System.out.println(workerHourly);
        WorkerHourly workerHourly1 = new WorkerHourly("Алексей", 300);
        System.out.println(workerHourly1);
        WorkerPermanent workerPermanent = new WorkerPermanent(35000);
        System.out.println(workerPermanent);
        WorkerPermanent workerPermanent2 = new WorkerPermanent("Виктор", 30000);
        System.out.println(workerPermanent2);



        System.out.println("\nЧерез ArrayList + сортировка по salary");
        ArrayList<BaseWorker> workers = new ArrayList<>();
        workers.add(workerHourly);
        workers.add(workerHourly1);
        workers.add(workerPermanent);
        workers.add(workerPermanent2);

        workers.sort(new BaseWorkerSalaryComparator());

        for (BaseWorker worker: workers) {
            System.out.println(worker);
        }

        System.out.println("\nЧерез класс Workers");
        Workers workers2 = new Workers();

        workers2.addWorker(workerHourly);
        workers2.addWorker(workerHourly1);
        workers2.addWorker(workerPermanent);
        workers2.addWorker(workerPermanent2);

        workers2.getWorkers().sort(new BaseWorkerSalaryComparator());

        for (BaseWorker worker: workers2) {
            System.out.println(worker);
        }

        System.out.println("\nЧерез массив + сортировка");
        BaseWorker[] workers3 = {
                new WorkerHourly("Андрей", 300),
                new WorkerPermanent(35000),
                new WorkerPermanent("Григорий", 30000)
        };

        Arrays.sort(workers3, new BaseWorkerSalaryComparator());

        for (BaseWorker worker: workers3) {
            System.out.println(worker);
        }

    }
}

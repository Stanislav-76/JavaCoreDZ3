package ru.geekbrains.task3.sample1;

import java.util.Comparator;

public class BaseWorkerSalaryComparator implements Comparator<BaseWorker> {

    public int compare(BaseWorker o1, BaseWorker o2){
        return (int)(o1.salary() - o2.salary());
    }
}

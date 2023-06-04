package ru.geekbrains.task3.sample1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Workers implements Iterable<BaseWorker> {

    ArrayList<BaseWorker> workers;

    public Workers(){
        this.workers = new ArrayList<>();
    }

    public ArrayList<BaseWorker> getWorkers() {
        return workers;
    }

    public void addWorker(BaseWorker worker){
        workers.add(worker);
    }

    @Override
    public Iterator<BaseWorker> iterator() {
        return new WorkersIterator();
    }

    class WorkersIterator implements Iterator<BaseWorker>{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < workers.size();
        }

        @Override
        public BaseWorker next() {
            return workers.get(index++);
        }

    }


}

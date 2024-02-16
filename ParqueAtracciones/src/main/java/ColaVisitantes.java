package controlAcceso;

import java.util.LinkedList;
import java.util.Queue;

public class ColaVisitantes {
    private Queue<Visitor> queue = new LinkedList<>();

    public synchronized void addVisitor(Visitor visitor) {
        queue.add(visitor);
        notify();
    }

    public synchronized Visitor getVisitor() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        return queue.poll();
    }
}
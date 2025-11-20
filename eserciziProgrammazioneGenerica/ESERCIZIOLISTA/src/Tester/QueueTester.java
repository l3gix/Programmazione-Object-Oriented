package Tester;

import Queue.Queue;

public class QueueTester
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new  Queue<Integer>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.printQueue();
        q.dequeue();

        System.out.println("print dopo la dequeue");
        q.printQueue();
    }
}

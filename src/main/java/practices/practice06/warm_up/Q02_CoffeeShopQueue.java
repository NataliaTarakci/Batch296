package practices.practice06.warm_up;

import java.util.LinkedList;
import java.util.Queue;

public class Q02_CoffeeShopQueue {


    /*
    Set up the Queue:
    Create a Queue that will represent the line of customers waiting for coffee.
    Use a LinkedList to initialize the queue, which allows us to add, remove, and manage customers in FIFO order.
    Add Customers to the Queue:
    Add several sample customers (such as “Alice,” “Bob,” “Charlie”) to the queue to represent a line of people waiting.
    Serve Customers in FIFO Order:
    Use the remove() method to serve and remove the first customer from the queue.
    Print the queue after each operation to see the updated order of customers.
    Check the Next Customer in Line without Serving Them:
    Use the peek() method to see who’s next in line without removing them from the queue.
    Print the queue after each operation to ensure no customer is removed.
    Serve Another Customer Safely with poll():
    Use the poll() method to serve the next customer and remove them from the queue.
    This method is safer than remove() for handling empty queues, as it returns null instead of throwing an exception.
    Handle an Empty Queue:
    After serving all customers, use poll() and peek() on an empty queue to see how these methods behave when the queue has no remaining customers.
     */

    public static void main(String[] args) {

        // Step 1: Initialize the queue for customers in line
        Queue<String> customerQueue = new LinkedList<>();

        // Adding some customers to the queue
        customerQueue.add("Alice");
        customerQueue.add("Bob");
        customerQueue.add("Charlie");
        customerQueue.add("Diana");
        customerQueue.add("Eve");

        System.out.println("customerQueue = " + customerQueue);

        // Serve the first customer
        String firstCustomer = customerQueue.remove();
        System.out.println("Serving = " + firstCustomer);
        System.out.println("customerQueue = " + customerQueue);

        // Check who's next without serving them
        String nextCustomer = customerQueue.peek();
        System.out.println("Next in line = " + nextCustomer);

        // Serve the next customer using poll
        String servedCustomer = customerQueue.poll();
        System.out.println("Served with poll = " + servedCustomer);
        System.out.println("customerQueue = " + customerQueue);
    }

}

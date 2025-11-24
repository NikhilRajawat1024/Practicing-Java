/*

add() - add element to the queue

poll() - retrieves and removes the head of the queue , Return null if queue is empty

remove() - retrieves and removes the head of the queue , Returns Exception is queue is empty

peek() - retrieve the value present at the head of the queue but do not remove it , Returns null if queue is empty

element() -  Retrieves the value present at the head of the queue but do not remove it 
 */
import java.util.*;



public class priorityqueue {
    public static void main(String[] args) {

        // Min priority queue
        PriorityQueue<Integer> myqueue = new PriorityQueue<>();
        myqueue.add(7);
        myqueue.add(10);
        myqueue.add(2);
        myqueue.add(5);
        myqueue.add(6);
        myqueue.add(9);

       // System.out.println(myqueue);


       // Max priority Queue

       PriorityQueue<Integer> maxpqueue = new PriorityQueue<>((Integer a , Integer b) -> b-a);

       maxpqueue.add(5);
       maxpqueue.add(2);
       maxpqueue.add(8);
       maxpqueue.add(1);

       //printing all values
       maxpqueue.forEach((Integer val) -> System.out.println(val));

       //remove top element from the PriorityQueue
       while(!maxpqueue.isEmpty()){
        int val = maxpqueue.poll();
        System.out.println("Remove from the top:" + val);
       }

    }
}

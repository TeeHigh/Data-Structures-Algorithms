package Queue;

public class Main {
  public static void main(String[] args) {
    Queue<Integer> queue = new Queue<Integer>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.enqueue(7);
    queue.enqueue(7);
    queue.enqueue(8);
    queue.dequeue();
    queue.display();
    System.out.println(queue.getSize());;
  }
}

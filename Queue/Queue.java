package Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue<T> implements Iterable<T> {
  int size = 0;

  LinkedList<T> list = new LinkedList<>();

  public int getSize() {
    return size;
  }

  public void enqueue(T item) {
    size++;
    list.addLast(item);
  }

  public void dequeue(){
    size--;
    list.removeFirst();
  }

  public void peek(){
    System.out.println(list.getFirst());;
  }

  public void display(){
    System.out.println(list.toString());
  }

  @Override
  public Iterator<T> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }
}

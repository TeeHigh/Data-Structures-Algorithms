/**
 * Stack implementation in Java built on the Array data structure
 * 
 * Operations Supported:
 * 1. Push (add an element to the top)
 * 2. Pop (remove the top element)
 * 3. Peek (view the top element without removing it)
 * 4. Size (get the current size of the stack)
 * 5. Display (view all elements in the stack)
 * 
*/

package Stack;

import java.util.Arrays;

public class Stack<T> {
  private int size;
  private int capacity;
  private Object[] data;

  public Stack() {
    this.size = 0;
    this.capacity = 16;
    this.data = new Object[capacity];
  }

  public void push(T item) {
    if (size == capacity) {
      capacity *= 2;
      data = Arrays.copyOf(data, capacity);
    }
    data[size++] = item;
  }

  public void pop() {
    if (size == 0) {
      System.out.println("Stack is empty");
      return;
    }
    data[--size] = null;
  }

  @SuppressWarnings("unchecked")
  public T peek() {
    if (size == 0) {
      System.out.println("Stack is empty");
      return null;
    }
    return (T) data[size - 1];
  }

  public int size() {
    return size;
  }

  public void display() {
    System.out.println("Stack elements: " + Arrays.toString(Arrays.copyOfRange(data, 0, size)));
  }
}

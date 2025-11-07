
/**
 * Doubly Linked List Implementation in Java
 * 
 * Operations Supported:
 * 1. Insertion at the beginning (prepend)
 * 2. Insertion at the end (append)
 * 3. Insertion at any position (insert)
 * 4. Deletion from the beginning (pull)
 * 5. Deletion from the end (pop)
 * 6. Deletion from any position (delete)
 * 5. Displaying the list (display)
 * 6. Searching for an element (search)
 * 7. Reversing the list (reverse)
 * 8. Viewing list size (getSize)
 * 
*/

public class DoublyLinkedList {

  private Node head;
  private Node tail;
  private int size = 0;

  private class Node{
    int value;
    Node next;
    Node prev;

    Node(int data){
      this.value = data;
      this.next = null;
      this.prev = null;
    }
  }

  public void getSize(){
    System.out.println(size);
  }

  public void append(int data){
    Node newNode = new Node(data);

    if (head == null){
      head = tail = newNode;
    }
    else{
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }

    size++;
  }

  public void prepend(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
    }
    head.prev = newNode;
    newNode.next = head;
    head = newNode;

    size++;
  }

  public void pop() {
    if (head == null) {
      System.out.println("Linked List is empty");
      return;
    }

    if (head == tail) {
      head = null;
      tail = null;
    } else {
      tail = tail.prev;
      tail.next = null;
    }

    size--;
    System.out.println("Node popped. Current size: " + size);
  }

  public void pull(){
    if(head == null) return;

    head = head.next;
    head.prev = null;

    size--;
  }

  public void display(){
    Node current = head;

    while (current != null){
      System.out.print(current.value + " -> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public void insert(int data, int position){
    Node newNode = new Node(data);
    int counter = 0;
    Node current = head;

    if (head == null){
      head = tail = newNode;
      return;
    }
    
    if (position <= 0){
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
      size++;
      return;
    }
    
    if (position >= size){
      tail.next = newNode;
      tail.next.prev = tail;
      tail = newNode;
      size++;
      return;
    }
    
    while (counter < position){
      counter++;
      current = current.next;
    }
    
    Node prevNode = current.prev;
    
    newNode.prev = prevNode;
    newNode.next = current;
    current.prev = newNode;
    prevNode.next = newNode;
    size++;

    System.out.println("Node inserted. Current size: " + size);
  }

  public void delete(int position){
    if(head == null) return;

    if(position > size){
      System.out.println("No item exists at this position!");
    }

    Node current = head;
    int counter = 0;

    while (counter < position){
      current = current.next;
      counter++;
    }

    current.prev.next = current.next;
    current.next.prev = current.prev;
    current = null;

    size--;

    System.out.println("Node deleted. Current size: " + size);
  }

  public void search(int data){
    if(head == null) {
      System.out.println("Linked List is empty");
      return;
    };

    int counter = 0;
    Node current = head;

    while (current != null ){
      if(current.value == data){
        System.out.println(current.value + " exists at position: " + counter);
        return;
      }
      counter++;
      current = current.next;
    }

    System.out.println(data + " does not exist in the list");
  }

  public void reverse(){
    if(head == null) return;

    Node current = head;
    Node temp = null;

    while (current != null){
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }

    if(temp != null){
      head = temp.prev;
    }
  }
}

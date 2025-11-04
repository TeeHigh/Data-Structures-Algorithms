/**
 * Singly Linked List Implementation in Java
 * 
 * Operations Supported:
 * 1. Insertion at the beginning
 * 2. Insertion at the end
 * 3. Deletion from the beginning 
 * 4. Deletion from the end
 * 5. Displaying the list
 * 6. Searching for an element
 * 7. Reversing the list
 * 
*/

public class Main {
  public static void main(String[] args) {
    SinglyLinkedList list1 = new SinglyLinkedList();

    list1.insertAtBeginning(0);
    list1.insertAtBeginning(2);
    list1.insertAtBeginning(4);
    list1.insertAtBeginning(5);
    list1.insertAtBeginning(9);
    list1.insertAtEnd(2025);
    list1.display();
    list1.visualize();
    list1.deleteFromEnd();
    list1.display();
    list1.visualize();
  }
}

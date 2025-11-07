
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
    
    DoublyLinkedList list2 = new DoublyLinkedList();
    list2.append(0);
    list2.append(1);
    list2.display();
    list2.append(2);
    list2.append(3);
    list2.append(13);
    list2.display();
    list2.prepend(30);
    list2.display();
    list2.getSize();
    list2.pop();
    list2.display();
    list2.insert(50, 2);
    list2.display();
    list2.delete( 4);
    list2.display();
    list2.search(10);
    list2.search(1);
    list2.reverse();
    list2.display();
  }
}

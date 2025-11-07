package Stack;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Object[] data = new Object[8];

    // data[0] = "Ife";
    // data[1] = "Ore";
    // data[2] = "Taiwo";
    
    // System.out.println(Arrays.toString(data));

    Stack<String> stack = new Stack<String>();
    stack.push("Dami");
    stack.push("Sola");
    stack.display();
  }
}

import java.io.*;
import java.util.*;
// Inside Question.java
public class Question {
  public static void main(String[] args) {
    // int i;
    // int sum = 0;
    // for (i = 2; i < 10; i += 2) {
    //   sum += i;
    // }
    // Scanner input = new Scanner(System.in); // Line 1
    // double v1 = input.nextDouble(); // Line 2
    // System.out.println(v1);
    // double v2 = input.nextDouble(); // Line 3
    // System.out.println(v2);
    // String line = input.nextLine(); // Line 4
    // System.out.println(line);
    try{
      PrintWriter p = new PrintWriter(new File("temp.txt"));
      p.print("hello");
      p.close();
    }
    catch(Exception ex){
      System.out.print("exception");
    }

    // assert i == 8;
    // assert sum == 20;
  }
}

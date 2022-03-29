//make an array with user input of size 10 : and print all even numbers
import java.util.*;
public class third_question {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int b[] = new int[10];
       for(int i=0; i<10;i++)
       {
           System.out.println("enter number");
           b[i] = sc.nextInt();
       }
        for(int i=0; i<10;i++)
        {
            if(b[i] % 2 == 0)
            {

                System.out.print("  "+b[i]);
            }
        }

    }
}

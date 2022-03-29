//make an array with user input of size 10 .then find middle element
import java.util.*;
public class second_question {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]= new int[10];
        for(int i=0; i<10; i++)
        {
            System.out.println("enter input");
            a[i] = sc.nextInt();
        }
        int m;
        m= (a[10/2 - 1] + a[10/2])/2;
        System.out.println("middle element is : "+ m);
    }
}

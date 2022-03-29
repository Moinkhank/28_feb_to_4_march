//make an array with user input of size 10 :then print count of all even numbers
import java.util.*;
public class fourth_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int c[] = new int[10];
        for(int i=0; i<10;i++)
        {
            System.out.println("enter number");
            c[i] = sc.nextInt();
        }
        for(int i=0; i<10;i++)
        {

            if(c[i] % 2 == 0)
            {
                  count ++ ;

            }
        }
        System.out.println(count+"  even numbers are present in this array");
    }
}

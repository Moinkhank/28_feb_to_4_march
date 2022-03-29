//wap to convert binary number to decimal


import java.util.*;
public class forth_question {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number");
        int n = sc.nextInt();
        int t = n, i = 0,  d = 0;
        while(t>0)
        {
            int reminder = t%10;
            t=t/10;
            d = d+ reminder*(int)Math.pow(2,i++);
        }
        System.out.println(d);
    }

}

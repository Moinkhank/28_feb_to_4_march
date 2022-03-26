import java.util.Scanner;
public class third_question {
    public static void main(String[] args) {
        //write three  methods each take int arguments and return its max value
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  1 no ");
        int num1=sc.nextInt();
        System.out.println("enter  2 no ");
        int num2=sc.nextInt();
        System.out.println("enter  3 no ");
        int num3=sc.nextInt();
        max_value(num1,num2,num3);
        System.out.println("max value is " +max_value(num1,num2,num3));
    }
    public static int max_value(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b> c)
        {
            return b;
        }
        else{
            return c;
        }
    }
}

import  java.util.*;
public class forth_question {
    public static void main(String[] args) {
        //write calculator program including add,diff,multiply,divide average and modulo
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the option ");
        System.out.println(" 1 for addition ,2 for substraction ,3 for multiply ,4 for division,5 for avg  ");
        int choice = sc.nextInt();
        if(choice >=1 && choice <= 5){
            System.out.println("enter no one");
            int num1 = sc.nextInt();
            System.out.println("enter no two");
            int num2 = sc.nextInt();
            switch(choice)
            {
                case 1 :
                    add(num1,num2);
                    System.out.println(add(num1,num2));
                    break;
                case 2 :
                    diff(num1,num2);

                    System.out.println( diff(num1,num2));
                    break;
                case 3 :
                    multiply(num1,num2);
                    System.out.println(multiply(num1,num2));
                    break;
                    case 4 :
                   divide (num1,num2);
                        System.out.println(divide (num1,num2));
                    break;
                case 5:
                    avg(num1,num2);
                    System.out.println(avg(num1,num2));
                    break;


            }

        }
        else
        {
            System.out.println("invalid input");
        }
    }
    public static int add(int a,int b)
    {
        int sum= a+b;
        return sum;
    }
    public static  int diff(int a,int b)
    {
        int difference = a-b;
        return difference ;
    }
    public static int multiply(int a,int b)
    {
        int mul = a*b;
        return mul ;
    }
    public static int divide(int a,int b)
    {
        int div = a/b;
        return div ;
    }
    public static int avg(int a,int b)
    {
        int avg = (a+b)/2;
        return avg ;
    }
}

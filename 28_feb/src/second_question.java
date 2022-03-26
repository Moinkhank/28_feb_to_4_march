import java.util.*;
public class second_question {
    public static void main(String[] args) {
      // write 3 different methods each take int ,float ,long number as input and return its multiplication value
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  int  no ");
        int num1=sc.nextInt();
        System.out.println("enter  float no ");
        float num2= sc.nextFloat();
        System.out.println("enter  long  no ");
        long  num3=sc.nextLong();
        value(num1,num2,num3);
        System.out.println(" value is " +value(num1,num2,num3));
    }
    public static  float value(int a,float b,long c){
         float  result = a* b *c ;
         return result ;
    }

}

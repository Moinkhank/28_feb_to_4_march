package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write a method that adds two number and return answer
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the one no");
       int num1= sc.nextInt();
        System.out.println("enter the second no");
       int num2= sc.nextInt();
      // add(num1,num2);
       int me= add(num1,num2);
        System.out.println(me);

    }
    public static int add(int a,int b){
        int result= a+b;
        return result ;
    }
}

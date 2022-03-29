package com.company;
// make an array with user input of size 10 then find sum of all element
import java.util.*;
public class Main {

    public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	   int arr[]=new int[10];
       for(int i=0 ;i<10;i++)
       {
           System.out.println("enter input");
           arr[i]=sc.nextInt();
       }
       int sum = 0;
        for(int i=0 ;i<10;i++)
        {
             sum += arr[i];
        }
        System.out.println(sum);
    }
}

package com.company;
import java.util.*;
// write a method  to reverse a number in java
public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        reverse_no(n);
        int p = reverse_no(n);
        System.out.println(p);
    }
    public static int reverse_no(int no)
    {
        int rev = 0;
        while(no>0)
        {
            int reminder =no%10;
             rev = rev *10+ reminder ;
            no=no/10;
        }

        return rev;
    }
}

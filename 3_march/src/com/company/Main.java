// wap to find first index at which element is present in an array
package com.company;

public class Main {

    public static void main(String[] args) {
        int no = 45;
	        int arr[] = {10,25,45,45,45,27,54,89,85,45,25};
            for(int i = 0;i<arr.length;i++)
            {
                if(arr[i] == no)
                {
                    System.out.println("first element is present at "+(i+1)+" position");
                    break ;
                }
            }
    }
}

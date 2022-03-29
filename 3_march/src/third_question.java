// wap to find differences in two arrays


public class third_question {
    public static void main(String[] args) {
        int a[] = {100,500,50,48,25,17,89,66,54};
        int b[] = {10,20,30,5,12,10,13,14,16,};
        int c[] = new int[a.length];
        for(int i =0;i<a.length;i++)
        {

             c[i] = a[i] - b[i];
            System.out.print("difference in two array is   "+c[i]);
        }
    }
}

// wap to find  last index at which element is present in an array

public class second_question {
    public static void main(String[] args) {
        int no = 45;
        int arr[] = {10,25,45,45,45,27,54,89,85,45,25};
        for(int i = arr.length - 1;i>=0;i--)
        {
            if(arr[i] == no)
            {
                System.out.println(" last index element is present at "+(i+1)+" position");
                break ;
            }
        }
    }
}

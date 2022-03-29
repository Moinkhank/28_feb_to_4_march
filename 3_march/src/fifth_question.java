// write a method to return sum of a  array

public class fifth_question {
    public static void main(String[] args) {
         int arr[] = {10,12,13,15,25,36,95,78,45};
        sum_of_array( arr);
        System.out.println("sum of array  "+ sum_of_array( arr));

    }
    public static int sum_of_array(int arr[])
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
              sum += arr[i];
        }
        return sum;
    }
}
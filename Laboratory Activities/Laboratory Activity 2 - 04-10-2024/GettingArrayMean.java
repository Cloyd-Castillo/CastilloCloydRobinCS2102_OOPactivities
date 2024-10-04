import java.util.Scanner;

public class GetArrayMean 
{
    public static float getArrayMean(int[] arr) 
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        float mean = (float) sum/arr.length;
        return mean;
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) 
        {
            System.out.print("Enter Number: ");
            arr[i] = scanner.nextInt();
        }
        float mean = getArrayMean(arr);
        System.out.printf("Mean of array is: %.2f%n", mean);
        scanner.close();
    }
}
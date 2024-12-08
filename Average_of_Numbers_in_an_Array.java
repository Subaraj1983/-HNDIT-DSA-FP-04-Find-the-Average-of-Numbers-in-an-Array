package Assignments;

public class Average_of_Numbers_in_an_Array {
    public static void main(String[] args) {
       
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Variable to save the summation of the elements
        int sum = 0;
        
        // Find the summation of array elements
        for (int num : numbers) {
            sum += num;
        }
        
        // Find the average
        int average = (int) sum / numbers.length;
        // If we need the average with decimal we could use double on behalf of int data type 
        
        // Output the average
        System.out.println("Average = " + average);
    }
}

package algorithms.implementation;

import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int nonZero = numNonZero(arr);
        int smallest;
        while(nonZero > 1){
            nonZero = numNonZero(arr);
            smallest = findSmallest(arr);
            arr = subtract(arr, smallest);
            
            if(nonZero > 0)
            	System.out.println(nonZero);
        }
        
    }
    
    
    /**
     * @param arr is the array that its elements will be iterated 
     * in order to find smallest non-zero element of the array
     * @return smallest non-zero element of the array
     */
    public static int findSmallest(int[] arr){
        int smallest = 0;
        for(int element:arr){
            if(element != 0){
                smallest = element;
                break;
            }
        }
            
        for(int element:arr){
            if(element > 0 && smallest > element)
                smallest = element;
        }
        
        return smallest;
    }
    
    
    /**
     * @param arr is the array that its elements will be subtracted
     * @param smallest is the number that subtrahend for this subtraction
     * @return subtracted version of array arr
     */
    public static int[] subtract(int[] arr, int smallest){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0)
                arr[i] =  arr[i] - smallest;
        }
        
        return arr;
    }
    
    
    
    /**
     * Returns number of non-zero elements in the array
     * @param arr is the array that will be checked 
     * its elements whether they are non-zero or not
     * @return number of non-zero elements in the array arr
     */
    public static int numNonZero(int[] arr){
        int nonZero = 0;
        for(int element:arr)
            if(element != 0)
                nonZero++;
        
        return nonZero;
    }
    
    
    /**
     * Prints element of array arr
     * @param arr is the array that its elements will be printed
     */
    public static void printArray(int[] arr){
        for(int element:arr)
            System.out.print(element + " ");
        System.out.println();
    }

}

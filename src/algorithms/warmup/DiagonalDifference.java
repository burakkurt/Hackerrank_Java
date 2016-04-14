package algorithms.warmup;
import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		//Assigning value to size variable from input
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        
        //Declaration and value assignment to array
        int[][] array = new int[size][size];
        for(int i=0;i<size;i++){
            for(int n=0;n<size;n++){
                array[i][n] = in.nextInt();    
            }
        }
        
        //sum of first diagonal numbers(from upper left corner to bottom right corner)
        int sumFirstDiag=0;
        for(int i=0;i<size;i++){
            sumFirstDiag += array[i][i];
        }
        
        //sum of second diagonal numbers(from bottom left corner to right upper corner)
        int n=size-1;
        int sumSecDiag=0;
        for(int i=0;i<size;i++){
            sumSecDiag += array[n][i];
            n--;
        }
        
        //Printing absolute value of diagonal difference
        System.out.println(Math.abs(sumFirstDiag-sumSecDiag));
        
    }

}

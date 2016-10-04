package algorithms.warmup;
import java.util.Scanner;


public class Staircase {

	public static void main(String[] args) {
		
		//Assigning height of the staircase from input
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		
		//this loop iterates number of height times
		for(int t=i;t>0;t--){
			
			//number of blanks starts from t-1 and get decreased step by step
            for(int n=1;t-n>0;n++){
                System.out.print(" ");
            }
            
            //number of blanks starts from (i+1)-t and get increased step by step
            for(int k=i+1;k-t>0;k--){
                System.out.print("#");
            }
            
            System.out.println();
        }

	}

}

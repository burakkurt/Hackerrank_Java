package algorithms.implementation;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            int n = in.nextInt();
            int n2 = n;
            
            int remainder = 0;
            int count=0;
            while(n > 0){
            	remainder = n % 10;
            	n /= 10;
            	//System.out.println(remainder);
            	
            	if(remainder == 0)
            		continue;
            	if(n2 % remainder == 0)
            		count++;
            }
            
            System.out.println(count);
        }

	}

}

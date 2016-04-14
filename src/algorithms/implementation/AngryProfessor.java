package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
        
		//Getting number of tests
		Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        
        //Iterating tests
        for(int a = 0; a < test; a++){
            
        	//Getting number of student and how many student needed to start the lecture
            int numStudent = in.nextInt();
            int calcelThresh = in.nextInt();
            
            //checking how many students came on time
            int result=0;
            for(int i=0; i < numStudent; i++){
                if(in.nextInt() < 1)
                    result++;
            }
            
            //checking whether students who came on time is enough to the lecture 
            if(result < calcelThresh)
                System.out.println("YES");
            else
                System.out.println("NO");
                
        }
	    
	}

}

package algorithms.warmup;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		//Reading input as a string
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        //Splitting hours and AM,PM information to different string variables
        String firstTwo = line.substring(0, 2);
        String lastTwo = line.substring(line.length()-2, line.length());
        
        //checking for AM whether hours are between 12 and 24
        if((Integer.parseInt(firstTwo) >= 12 && Integer.parseInt(firstTwo) <= 23)&& lastTwo.equals("AM")){
        	firstTwo = String.valueOf(Integer.parseInt(firstTwo)-12);
	        if(firstTwo.length() == 1)
	        	firstTwo = firstTwo.replace(firstTwo, "0"+firstTwo);
        	line = line.replace(line.substring(0, 2), firstTwo);
        }
        //checking for PM whether hours are between 0 and 12
        else if((Integer.parseInt(firstTwo) >= 0 && Integer.parseInt(firstTwo) <= 11)&& lastTwo.equals("PM")){
        	firstTwo = String.valueOf(12+Integer.parseInt(firstTwo));
	    	line = line.replace(line.substring(0, 2), firstTwo);
        }
        	
        //printing without AM, PM
        line = line.replace(lastTwo, "");
        System.out.println(line);

	}

}

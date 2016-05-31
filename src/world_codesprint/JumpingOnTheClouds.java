package world_codesprint;

import java.util.Scanner;

public class JumpingOnTheClouds {
	//ÇÖZÜLEMEDİ
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] clouds = new int[size];
		
		for(int i=0;i<size;i++)
			clouds[i] = in.nextInt();
		
		int steps=0;
		for (int n=0;n<clouds.length;n++) {
			if(n+2 < clouds.length && clouds[n+2] == 0){
				n += 1;
				steps++;
			}
			else if(n+1 < clouds.length && clouds[n+1] == 0){
				steps++;
			}
		}
		
		System.out.println(steps);
		
	}

}

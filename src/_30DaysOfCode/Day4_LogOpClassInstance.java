package _30DaysOfCode;

import java.util.Scanner;

public class Day4_LogOpClassInstance {

	int age;	
	public Day4_LogOpClassInstance(int initial_Age) {
  		if(initial_Age < 0){
            setAge(0);   
            System.out.println("This person is not valid, setting age to 0.");
        }
        else
            setAge(initial_Age);
	}

	public void amIOld() {
  		if(getAge() < 13)
            System.out.println("You are young.");
        else if(getAge() >= 13 && getAge() < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		setAge(getAge() + 1);
	}
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }

}

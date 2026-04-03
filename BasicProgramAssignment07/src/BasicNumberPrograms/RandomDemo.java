package BasicNumberPrograms;

import java.util.Random;



public class RandomDemo {
    public static void main(String[] args) {
    	int randomNum = (int)(Math.random() * 100) + 1;
    	System.out.println(randomNum);
        Random rand = new Random();

        // Generate a random integer between 0 and 49
        int n = rand.nextInt(50); 
        
        // Generate a random true or false
        boolean choice = rand.nextBoolean();

        System.out.println("Random Number: " + n);
    }
}
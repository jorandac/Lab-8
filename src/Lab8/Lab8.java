/**
 * Created by JoRanda Chapman
 * Grand Circus Lab 7 
 * Date: 07/23/2018 
 *
 */

package Lab8;

import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		
		int number = 0;
        Boolean validateNumber;
        Boolean validateOption;
        String choice;

		
		String[] studentName = { "JoRanda", "Sasi", "Eddy", "Arif", "David", "Anesha", "Kris", "Louis" };
		String[] studentHometown = {"Albion, Jackson, Houston, Detroit, Redford, Taylor, Livonia, Southfield"  };
		String[] favoriteFood = {"Chicken, Crablegs, Salmon, Ice Cream, Pizza, Lasagna, Cupcakes, Turkey" };
		int [] studentNumber = { 1, 2, 3, 4, 5, 6, 7, 8 };
	
		
		System.out.println("Welcome to our java class.");
		
		//Prints User Number and Name for user to choose from
	    for (int i = 0; i <studentName.length; i++) {
			System.out.println(studentNumber[i] + ". " + studentName[i]); 
		}
	    
	do {   
	    System.out.println("Which student would you like to learn more about? Please Enter a number between 1-8:"); 
	       int userInput = scnr.nextInt();  //Prompt for User Input 
	    
	    
	       System.out.println("Student " + studentNumber[userInput -1]  + " is " + studentName[userInput -1]); 
		   System.out.println("What would you like to know about " + studentName[userInput -1] + "?" + " Enter Hometown or Favorite Food:"); 
			int userInput1 = scnr.nextInt();	
		
			   if (userInput1 == "hometown") {
		    	  System.out.println(studentName[userInput1 - 1] + " is from" + studentHometown[userInput1 - 1] + ". " + "Would you like to know more? (Enter Yes or No)");                     
			    }
			  else if (userInput1 == "favorite food") {
		    	System.out.println(studentName[userInput1 - 1] + " favorite food is" + favoriteFood[userInput1 - 1] + ". " + "Would you like to know more? (Enter Yes or No)");   
		    	 
			  }
			   
		      try
		      {
		          System.out.print("Which student would you like to learn more about? Please Enter a number between 1-8:");
		               scnr.nextInt();	
		      }
		      catch (java.lang.ArrayIndexOutOfBoundsException e)
		      {
		        System.out.println("Error! Invalid number. Try again.\n");
		      }
		    	  	
 
			 
	       System.out.println("Would you like to know more about the class? (enter y for yes or n for no):");
	       choice = scnr.next();   
			   
	 } while (choice.equalsIgnoreCase("y"));
	 
	
	
    System.out.println("Thank you for stopping by!");
    
    scnr.close();
	
	}
		  
			 private static Boolean validateNumberIsBetween1and8(int number) {
		         if (number >= 1 && number <= 8) {
		             return true;
		         }
		         System.out.println("That student does not exist. Please try again. (enter a number (1-8): ");
		         return false;
		     }
		     private static Boolean validateOptionBetweenHomeandFood(String choice) {
		         
		    	if (choice.equalsIgnoreCase("Hometown") || choice.equalsIgnoreCase("Favorite Food")) {
		             return true;
		         }
		    	
		         System.out.println("That data does not exist. Please try again.(enter hometown or favorite food): ");
		         return false;
	     
	     }

	}
	     

	          	         
	        


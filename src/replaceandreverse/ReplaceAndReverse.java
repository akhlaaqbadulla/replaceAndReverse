/*
*Name:       Budulla Akhlaaq
*Matric:     242303
*Lecturer:   Yacheen Nubee
*subject:    Programming 2
*Program:    Replace and reverse
*assignment: 1
*/
package replaceandreverse;

import java.util.Scanner;

/**
 *
 * @author Akhlaaq Badulla
 */
public class ReplaceAndReverse {


 public static void main(String args[])
    { 
    //****************************************************************************************************************************************    
        
         String newsen="";//parameter 1 will contain the new sentence
         String temp="";//parameter 2 will be use a temporary memory to save the replace string process
        
        Scanner src = new Scanner(System.in);      //instantiate scanner
        System.out.println("Enter the sentence:"); //display Enter sentence
        String s = src.nextLine();                 //take user input also string s is the 3rd paramter which saves the string inputed

    //****************************************************************************************************************************************
        
        System.out.println("Enter the word to be replaced:"); //display Enter the word to be replaced
        String replace = src.next();                          // take user input
        System.out.println("Enter the word with which it is to be replaced:"); //Display Enter the word with which it is to be replaced
        String replacewith = src.next();        //take user input for the letter to with which to replace the previously inputed word.
        s=s+" ";//add to s
        
    //****************************************************************************************************************************************  
        //loop to perform the replace process
        // is on for loop which contains nested if-else loop
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);// turning string to char
            if(x!=' ')
            {
                temp=temp+x;
            }//end of if loop 1
            else
            {
                if(replace.equals(temp))
                {
                    newsen=newsen+replacewith;
                }//end of if loop 2
                else
                {
                    newsen=newsen+temp;
                }//end of else loop 1
                
                newsen=newsen+" ";
                temp="";
                
            }//end of else loop 2
            
        }//end of for loop for the replace process
        
    //****************************************************************************************************************************************    
        
        System.out.println("The new sentence is :"+" "+newsen); //display the new sentence with the new sentence
        
        System.out.print("The reverse sentence is :"); //display the reverse sentence is
        
    //****************************************************************************************************************************************
    
        //loop to print the words in reverse
        for(int i=newsen.length()-1; i>=0; i-- )
        {
            
         System.out.print(newsen.charAt(i)); // display reverse sentence 
            
        }//end of loop to reverse string
        
    //****************************************************************************************************************************************
        
    }//end of main
}//end of class

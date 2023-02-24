package Guessinggame;

import java.util.*;
import javax.swing.*;

public class GuessingGame {
    //main method 
    public static void main(String[] args) {
        int SystemNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + SystemNumber);
        int count = 1;
        while (userAnswer != SystemNumber)
        {
            String answer = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(answer);
            
            JOptionPane.showMessageDialog(null, ""+ 
            Guess(userAnswer, SystemNumber, count)); 
            count++;
        }  
    }
    
    public static String Guess(int userAnswer, int SystemNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == SystemNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > SystemNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < SystemNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
            
        }
    }
}
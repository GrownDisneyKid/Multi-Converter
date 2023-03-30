/*
 * Justin McQueen
 * CMIS 242:6980
 * Week Six Discussion
 * 26 March 2023
 */

// required imports
import javax.swing.JOptionPane;

public class Converter {
    
    // constructs the object if no variable is passed
    private double userChoice;

    Converter() {
        this.userChoice = 0;
    }

    // constructs the object if a variable is passed
    Converter(double userInput) {
        this.userChoice = userChoice;
    }

    // getter and setter of input variable
    public void setUserChoice(double userChoice) {
        this.userChoice = userChoice;
    }

    public double getUserChoice() {
        return this.userChoice;
    }
    
}

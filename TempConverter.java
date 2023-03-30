/*
 * Justin McQueen
 * CMIS 242:6980
 * Week Six Discussion
 * 26 March 2023
 */

import javax.swing.JOptionPane;

public class TempConverter extends Converter{
    // user input attribute

    // constructor will ask the user for the variable and call the converter method
    TempConverter() {
        String choice = JOptionPane.showInputDialog("Enter the Farenheiht");
        double result = Double.valueOf(choice); 
        setUserChoice(result);
        convertResult(result);
    }

    // used to pull the user choice for the parent class
    @Override
    public double getUserChoice() {
        return this.getUserChoice();
    }

    // method makes the converstion and displays the result with the message dialog box
    public void convertResult(double getUserChoice) {
        double finalTemp = (((getUserChoice-32)*5)/9);
        String temp = (getUserChoice + " Farenheiht is " + finalTemp + " in Celcius");
        JOptionPane.showMessageDialog(null, temp, "Temperature", JOptionPane.INFORMATION_MESSAGE);
    }

    
}

/*
 * Justin McQueen
 * CMIS 242:6980
 * Week Six Discussion
 * 26 March 2023
 */

import javax.swing.JOptionPane;

public class DistanceConverter extends Converter{
    
    // constructor will ask the user for the variable and call the converter method
    DistanceConverter() {
        String choice = JOptionPane.showInputDialog("Enter the miles");
        double result = Double.valueOf(choice); 
        setUserChoice(result);
        convertResult(result);
    }

    // used to pull the user choice for the parent class
    public double getUserChoice() {
        return getUserChoice();
    }

    // method makes the converstion and displays the result with the message dialog box
    public void convertResult(double getUserChoice) {
        double finalDistance = (getUserChoice*1.609);
        String dist = (getUserChoice + " miles is " + finalDistance + " in kilometers.");
        JOptionPane.showMessageDialog(null, dist, "Kilometers", JOptionPane.INFORMATION_MESSAGE);
    }


}

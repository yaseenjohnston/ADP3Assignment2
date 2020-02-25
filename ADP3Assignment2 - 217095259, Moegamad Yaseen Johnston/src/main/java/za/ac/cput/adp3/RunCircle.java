package za.ac.cput.adp3;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * Hello world!
 *
 */
public class RunCircle
{
    public static void main( String[] args )
    {
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(12.5);
        DecimalFormat df = new DecimalFormat("0.00");

        String input = JOptionPane.showInputDialog(null, "Please enter radius for your Circle", "INPUT", JOptionPane.QUESTION_MESSAGE);
        circ1.setRadius(Double.parseDouble(input));
        do {
            input = JOptionPane.showInputDialog(null, "1. Display radius\n2. Display diameter\n3. Display circumference\n4. Display area\n5. Change radius\n6. Exit program", "MENU", JOptionPane.QUESTION_MESSAGE);
            switch(Integer.parseInt(input)){
                case 1: JOptionPane.showMessageDialog(null, "The Radius of Circle 1 = " + circ1.getRadius() + "\nThe Radius of Circle 2 = " + circ2.getRadius(), "DISPLAY RADIUS", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: JOptionPane.showMessageDialog(null, "The Diameter of Circle 1 = " + circ1.getDiameter() + "\nThe Diameter of Circle 2 = " + circ2.getDiameter(), "DISPLAY DIAMETER", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3: JOptionPane.showMessageDialog(null, "The Circumference of Circle 1 = " + df.format(circ1.getCircumference()) + "\nThe Circumference of Circle 2 = " + df.format(circ2.getCircumference()), "Display Circumference", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4: JOptionPane.showMessageDialog(null, "The Area of Circle 1 = " + df.format(circ1.getArea()) + "\nThe Area of Circle 2 = " + df.format(circ2.getArea()), "DISPLAY AREA", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 5: String radius = JOptionPane.showInputDialog(null, "Current Circle 1 radius = " + circ1.getRadius() + "\nPlease enter a new radius for Circle 1", "RADIUS INPUT", JOptionPane.QUESTION_MESSAGE);
                    circ1.setRadius(Double.parseDouble(radius));
                    radius = JOptionPane.showInputDialog(null, "Current Circle 2 radius = " + circ2.getRadius() + "\nPlease enter a new radius for Circle 2", "RADIUS INPUT", JOptionPane.QUESTION_MESSAGE);
                    circ2.setRadius(Double.parseDouble(radius));
                    break;
                case 6: JOptionPane.showMessageDialog(null, "Goodbye", "EXITING", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default: JOptionPane.showMessageDialog(null, "Input is not a valid option!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (Integer.parseInt(input) != 6);
    }
}

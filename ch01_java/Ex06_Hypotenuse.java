import java.util.Scanner;

public class Ex06_Hypotenuse {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the legnth of side 1 :");
        double side1 = userInput.nextDouble();

        System.out.println("Please enter the length of side 2 :");
        double side2 = userInput.nextDouble();

        double hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

        

        System.out.println("The hypotenuse of your triangle is : " + hypotenuse);
        userInput.close();

        
    }
    
}

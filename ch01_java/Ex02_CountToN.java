import java.util.Scanner;

public class Ex02_CountToN {

    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userNum = 0;
        System.out.println("Please enter a number :");
        userNum = userInput.nextInt();

        for (int x = 1; x <= userNum; x ++){

            System.out.println(x);
        }
    }
    
}

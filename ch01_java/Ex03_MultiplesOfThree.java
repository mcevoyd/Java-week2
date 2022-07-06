import java.util.Scanner;

public class Ex03_MultiplesOfThree {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a numer : ");
        int userNumber = userInput.nextInt();

        for (int x = 3; x <= userNumber; x++){
            if (x % 3 == 0){
                System.out.println(x);
            }

        }

    }
    
}
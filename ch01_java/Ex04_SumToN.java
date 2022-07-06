import java.util.Scanner;

public class Ex04_SumToN {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = userInput.nextInt();
        int sum =0;

        for (int x =1; x <= num; x++){
            sum = sum + x;
            System.out.println(x + " : " + sum);
        }
    }    
}
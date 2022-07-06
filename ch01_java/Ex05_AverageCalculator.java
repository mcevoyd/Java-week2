import java.util.ArrayList;
import java.util.Scanner;

public class Ex05_AverageCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);      

        // create an array
        ArrayList<Integer> numList = new ArrayList<Integer>();        

        //take input
        System.out.println("Please enter a number or = to exit :");
        String response = userInput.next();

        while (!response.equals("=")) {
            System.out.println("Enter a number or = to stop :");
            int nextNum = Integer.parseInt(response);
            
            numList.add(nextNum);
            response = userInput.next();

        }

        float total = 0;

        for (Integer num : numList){
            total += num;
        }

        float average = total / numList.size();
        System.out.println("The average is : " + average);
        userInput.close();

    }
    
}

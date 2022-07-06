import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        Integer userSelect;

        ArrayList<Song> top10 = new ArrayList<Song>();

        top10.add(new Song(1, "Running up that hill", "Kate Bush", "Fish People"));
        top10.add(new Song(2, "Afraid to feel", "LF System", "Warner brothers"));
        top10.add(new Song(3, "As it was", "Harry Styles", "Columbia"));
        top10.add(new Song(4, "Break my soul", "Beyonce", "Columbia"));
        top10.add(new Song(5, "Green green grass", "George Ezra", "Columbia"));
        top10.add(new Song(6, "Go", "Cat Burns", "RCA/Since 93"));
        top10.add(new Song(7, "About damn time", "Lizzo", "Atlantic"));
        top10.add(new Song(8, "Massive", "Drake", "OVO/Republic Records"));
        top10.add(new Song(9, "IFTK", "Tion Wayne & La Roux", "Atlantic"));
        top10.add(new Song(10, "Late night talking", "Harry Styles", "Columbia"));

        System.out.println("Please enter the chart number you want to see :");
        userSelect = sc.nextInt();
        System.out.println(top10.get(userSelect - 1));

    }
}

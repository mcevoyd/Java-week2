import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        Integer userSelect;

        ArrayList<Movie> top10Movie = new ArrayList<Movie>();

        top10Movie.add(new Movie(1, "MARCEL THE SHELL WITH SHOES ON", "Dean Fleischer-Camp",
         "100"));
        top10Movie.add(new Movie(2, "FIRE OF LOVE", "Sara Dosa", "100"));
        top10Movie.add(new Movie(3, "PLAYGROUND", "Laura Wandel", "100"));
        top10Movie.add(new Movie(4, "WRITING WITH FIRE", "Rintu Thomas, Sushmit Ghosh",
         "100"));
        top10Movie.add(new Movie(5, "THE JANES", "Tia Lessin, Emma Pildes", "100"));
        top10Movie.add(new Movie(6, "HAPPENING", "Audrey Diwan", "99"));
        top10Movie.add(new Movie(7, "NAVALNY", "Daniel Roher", "99"));
        top10Movie.add(new Movie(8, "POLY STYRENE: I AM A CLICHÉ", "Celeste Bell, Paul Sng",
         "98"));
        top10Movie.add(new Movie(9, "THE AUTOMAT", "Lisa Hurwitz", "98"));
        top10Movie.add(new Movie(10, "WHO WE ARE: A CHRONICLE OF RACISM IN AMERICA",
         "Emily Kunstler, Sarah Kunstler", "98"));

         System.out.println("Please enter which position movie you want from 1 - 10 :");
         userSelect = sc.nextInt();
         System.out.println(top10Movie.get(userSelect -1));


    }
}

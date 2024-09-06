import java.util.Scanner;

public class GettingInputs 
{
    public static void main(String[] args) 
    {
        int Year;
        String Genre;
        String Album;
        String Title;
        String Artist;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        Year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the genre: ");
        Genre = scanner.nextLine();
        System.out.print("Enter the album: ");
        Album = scanner.nextLine();
        System.out.print("Enter the song title: ");
        Title = scanner.nextLine();
        System.out.print("Enter the artist: ");
        Artist = scanner.nextLine();
        
        System.out.println("\n--------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------");
        System.out.println("Year Released; " + Year);
        System.out.println("Genre; " + Genre);
        System.out.println("Album; " + Album);
        System.out.println("Title; " + Title);
        System.out.println("Artist; " + Artist);
    }
}
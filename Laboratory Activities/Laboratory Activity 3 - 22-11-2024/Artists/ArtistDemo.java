public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Minami", "Japanese", 27, "Music", Genre.ROCK);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Benedick Indiola", "Filipino", 20, "Art", Medium.PENCIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("Hugh Dowey", "American", 49, "Literature", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Rachael Gunn", "Australian", 37, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}
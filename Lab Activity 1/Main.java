public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Inception";
        movie1.genre = "Sci-Fi";
        movie1.duration = 148;

        Movie movie2 = new Movie();
        movie2.title = "Titanic";
        movie2.genre = "Romance";
        movie2.duration = 195;

        Movie movie3 = new Movie();
        movie3.title = "The Dark Knight";
        movie3.genre = "Action";
        movie3.duration = 152;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}

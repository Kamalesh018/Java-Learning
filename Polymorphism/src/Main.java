import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie themovie1 = new Movie("Star wars");
//        Movie theMovie = Movie.getMovie("A","stars war");
//        theMovie.watchMovie();

//        themovie1.watchMovie();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("A for adventure , C for Comedy " +
                    "S for Scinece Fiction, or Q to quit");
            String type = sc.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("enter the movie");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type , title);
            movie.watchMovie();
        }

    }
}
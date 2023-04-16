public class NextMain {
    public static void main(String[] args) {
        Movie movie =  Movie.getMovie("A","jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","jaws");
        jaws.watchMovie();//exception occurs

         Object comedy = Movie.getMovie("C","airplane");
         Comedy comedyMovie = (Comedy) comedy;
         comedyMovie.watchMovie();

         var airplane = Movie.getMovie("C","Airplane");
         airplane.watchMovie();

         var plane = new Comedy("plane");
         plane.watchComedy();
    }

}

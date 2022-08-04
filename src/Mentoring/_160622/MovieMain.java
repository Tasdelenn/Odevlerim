package Mentoring._160622;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie1=new Movie("Casino Royale","Eon Productions","PG 13");
        Movie movie2=new Movie("Casino Royale 2","Eon Productions","PG");

        System.out.println("movie1 = " + movie1.title);
        System.out.println("movie2 = " + movie2.title);

        for (Movie movie: Movie.list){
            System.out.println("movie.title = " + movie.title);
        }

        for (Movie movie: Movie.getPG(Movie.list)){
            System.out.println("movie.title = " + movie.title);
        }
    }
}

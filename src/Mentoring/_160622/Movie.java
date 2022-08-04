package Mentoring._160622;


//   todo    The class Movie is started below. An instance of class Movie represents a film. This class
//   todo    has the following three class variables:
//   todo    ● id, which is an int representing the id of the movie and determined automatically and cannot be changed
//   todo    ● title, which is a String representing the title of the movie
//   todo    ● studio, which is a String representing the studio that made the movie
//   todo    ● rating, which is a String representing the rating of the movie (i.e. PG 13, R, etc)

//   todo    a) Write a constructor for the class Movie, which takes a String representing the title of the
//   todo    movie, a String representing the studio, and a String representing the rating as its
//   todo    arguments, and sets the respective class variables to these values.

//   todo    b) Write a second constructor for the class Movie, which takes a String representing the title
//   todo    of the movie and a String representing the studio as its arguments, and sets the respective
//   todo    class variables to these values, while the class variable rating is set to "PG".

//   todo    c) Write a method getPG, which takes an array of base type Movie as its argument, and
//   todo    returns a new array of only those movies in the input array with a rating of "PG". You may
//   todo    assume the input array is full of Movieinstances. The returned array need not be full.

//   todo    d) Write a piece of code that creates an instance of the class Moviewith the title “Casino
//   todo    Royale”, the studio “Eon Productions”, and the rating “PG 13”.

import java.util.ArrayList;

public class Movie {
    final int id;
    String title;
    String studio;
    String rating;
    static int ID=0;
    static ArrayList<Movie> list=new ArrayList<>();

    public Movie(String title, String studio, String rating) {
        this.id=++ID;
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        list.add(this);
    }

    public Movie(String title, String studio) {
        this.id=++ID;
        this.title = title;
        this.studio = studio;
        this.rating="PG";
        list.add(this);
    }

    public static ArrayList<Movie> getPG(ArrayList<Movie> list){
        ArrayList<Movie> returnList=new ArrayList();
        for (Movie movie: list){
            if(movie.rating.equalsIgnoreCase("PG")){
                returnList.add(movie);
            }
        }
        return returnList;
    }
}

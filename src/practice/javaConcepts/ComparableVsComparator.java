package practice.javaConcepts;

import java.util.*;

public class ComparableVsComparator {
    public static void main(String[] args) {
        Movie mv=new Movie("terminator",8d);
        Movie mv1=new Movie("shark attack",5d);
        Movie mv2=new Movie("shashank redumption",9d);
        List<Movie> lst= new ArrayList<>();
        lst.add(mv);
        lst.add(mv1);
        lst.add(mv2);
        Collections.sort(lst);
        for(Movie m:lst){
            System.out.println(m.name+" - "+m.imdbRating);
        }
        Collections.sort(lst,new MovieComparator());
        for(Movie m:lst){
            System.out.println(m.name+" - "+m.imdbRating);
        }
    }
}

class Movie implements Comparable<Movie> {
    String name;
    Double imdbRating;

    Movie(String name, Double rating) {
        this.name = name;
        imdbRating = rating;
    }

    public int compareTo(Movie m) {
        return this.imdbRating.compareTo(m.imdbRating);
    }

}

class MovieComparator implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
}

package com.designpatterns.factory.cinemaFactory;

import com.designpatterns.factory.cinemaFactory.moviesDetails.PulpFiction;
import com.designpatterns.factory.cinemaFactory.moviesDetails.TheDarkKnight;
import com.designpatterns.factory.cinemaFactory.moviesDetails.TheGodFather;
import com.designpatterns.factory.cinemaFactory.moviesDetails.TheShawshanckRedemption;

public class MovieFactory {

    private static MovieFactory movieFactory = null;
    private MovieFactory() {}

    public static MovieFactory getInstance() {
        if (movieFactory == null) {
            movieFactory = new MovieFactory();
        }
        return movieFactory;
    }

    public Movie createMovie(int movieNumber) {
        switch (movieNumber) {
            case 1:
                return new PulpFiction();
            case 2:
                return new TheShawshanckRedemption();
            case 3:
                return new TheDarkKnight();
            case 4:
                return new TheGodFather();
        }
        throw new RuntimeException("Invalid number, out of menu ...");
    }
}

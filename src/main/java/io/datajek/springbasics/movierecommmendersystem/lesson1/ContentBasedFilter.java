package io.datajek.springbasics.movierecommmendersystem.lesson1;

import io.datajek.springbasics.movierecommmendersystem.Filter;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}

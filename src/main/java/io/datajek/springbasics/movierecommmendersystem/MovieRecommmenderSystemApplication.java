package io.datajek.springbasics.movierecommmendersystem;

import io.datajek.springbasics.movierecommmendersystem.lesson1.ContentBasedFilter;
import io.datajek.springbasics.movierecommmendersystem.lesson1.RecommenderImplementation;
import io.datajek.springbasics.movierecommmendersystem.lesson2.CollaborativeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {

//		SpringApplication.run(MovieRecommmenderSystemApplication.class, args);
		Filter filter = new CollaborativeFilter();
		RecommenderImplementation recommenderImplementation = new RecommenderImplementation(filter);
		String[] results = recommenderImplementation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));
	}


}

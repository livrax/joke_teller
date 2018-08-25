package com.liviurau.bibapp.jokeprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeProvider {

    private final Random random = new Random();

    public String getJoke(){
        List<String> jokes = new ArrayList<>();

        jokes.add("Want to hear a joke about a piece of paper?\n" +
                "Never mind… it is tearable.");
        jokes.add("Why don’t they play poker in the jungle?\n" +
                "Too many cheetahs!");
        jokes.add("Does anyone need an ark?\n" +
                "I Noah guy!");
        jokes.add("Cosmetic surgery used to be such a taboo subject.\n" +
                "Now you can talk about Botox and nobody raises an eyebrow.");
        jokes.add("What do you call cheese that isn’t yours?\n" +
                "Nacho Cheese.");
        jokes.add("Did you hear about the circus fire?\n" +
                "It was in tents!");
        jokes.add("What did the pirate get on his report card?\n" +
                "Seven Cs!");
        jokes.add("What did the buffalo say when his son left?\n" +
                "Bison!");
        jokes.add("How do you make holy water?\n" +
                "You boil the hell out of it.");
        jokes.add("How did Moses cut the sea in half?\n" +
                "-\n" +
                "With a seasaw.");

        return jokes.get(random.nextInt(10));
    }
}

package com.udacity.example.jokes;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class JokeSmith {
    public static final String JOKE_TEXT_EXTRA = "JOKE_TEXT_EXTRA";

    private List<String> cornyJokes = Arrays.asList(
            "Why did the mushroom go to the party?\nBecause he was a fungi",
            "What's the difference between a snowman and a snow-woman?\nSnowballs",
            "What do you call fake spaghetti?\nAn Im-pasta",
            "What did the yoga instructor say when her landlord tried to evict her?\nNamaste",
            "What do you call Irish furniture?\nPatty O'Furniture",
            "How many lips does a flower have?\nTu-lips",
            "How does a squid go into battle?\nWell armed.",
            "What do you call a shoe made out of a banana?\nA slipper.",
            "Why couldn't the toilet paper cross the road?\nBecause it got stuck in a crack.",
            "What would bears be without bees?\nEars",
            "How much does a pirate pay for corn?\nA buccaneer",
            "What did the mayonnaise say when the refrigerator door was opened?\nClose the door, I'm dressing.",
            "What lies at the bottom of the sea shaking?\nA nervous wreck.");

    public String tellAHandCraftedJoke() {
        return cornyJokes.get(ThreadLocalRandom.current().nextInt(cornyJokes.size()));
    }
}


package school.mjc.stage0.loops.task2;

import org.jetbrains.annotations.NotNull;

public class WordsBuilder {
    public void buildPhrase(char @NotNull ... chars) {
        StringBuilder phrase = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            phrase.append(chars[i]);
            i++;
        }
        System.out.print(phrase.toString());
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        char[] characters = {'l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l'};
        wordsBuilder.buildPhrase(characters);
    }
}

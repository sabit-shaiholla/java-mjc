package school.mjc.stage0.conditions.task3;


import java.util.Arrays;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            char characterToLowerCase = Character.toLowerCase(character);
            if (characterToLowerCase == 'a' || characterToLowerCase == 'e' || characterToLowerCase == 'i' || characterToLowerCase == 'o' || characterToLowerCase == 'u' ) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}



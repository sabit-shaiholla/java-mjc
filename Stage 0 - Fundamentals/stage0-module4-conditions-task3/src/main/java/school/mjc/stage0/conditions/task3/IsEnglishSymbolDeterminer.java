package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        //convert char symbol to int
        int ascii = (int) symbol;
        //check if ascii is in range of english symbols
        if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}

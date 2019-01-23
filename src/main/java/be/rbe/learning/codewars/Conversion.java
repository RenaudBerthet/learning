package be.rbe.learning.codewars;

public class Conversion {
    public String solution(int number) {
        int numberRemaining = number;
        String buffer = "";

        for (RomanSymbol symbol : RomanSymbol.values()) {
            int multiplier = getMultiplier(numberRemaining, symbol);
            buffer += repeatString(symbol.toString(), multiplier);
            numberRemaining -= (numberRemaining % symbol.value) * symbol.value;
        }
        return buffer;
    }

    public static int getMultiplier(int numberRemaining, RomanSymbol symbol) {
        return numberRemaining - (numberRemaining % symbol.value) / symbol.value;
    }

    private String repeatString(String s, int count) {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < count; i++) {
            r.append(s);
        }
        return r.toString();
    }

    enum RomanSymbol {
        M(1000),
        D(500),
        C(100),
        L(50),
        X(10),
        V(5),
        I(1);
        private int value;

        RomanSymbol(int i) {
            this.value = i;
        }
    }
}

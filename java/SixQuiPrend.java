

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        if(value%10 == 0){
            return 3;
        }
        if (value%5 == 0){
            if (value == 55){
                return 7;
            }
            return 2;
        }
        if (value > 10 && value%10 == value/10){
            return 5;
        }
        return 1;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}

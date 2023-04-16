public class NumberInWord {
    public static void printNumberInWord(int wholeNumber){
        String value = switch (wholeNumber){
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(wholeNumber + " is known as " + value);
    }

    public static void main(String[] args) {
        printNumberInWord(0);
    }

}

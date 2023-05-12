import java.util.Random;

public class RollTheDice {


    public static void start() {
        System.out.println("Game start");
    }

    public static void end() {
        System.out.println("End of game");
    }

    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;

    }

    public static String calculateWinner() {
        int x = 0;
        int firstPlayerCounter = 0;
        int secondPlayerCounter = 0;
        while (x != 3) {
            int firstNumber = randomNumber();
            firstPlayerCounter += firstNumber;
            int secondNumber = randomNumber();
            secondPlayerCounter += secondNumber;
            x++;
        }
        if (firstPlayerCounter == secondPlayerCounter) return "Even";
        return firstPlayerCounter > secondPlayerCounter ? "first player wins" : "second player wins";
    }

    public static void main(String[] args) {
        start();
        System.out.println(calculateWinner());
        end();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner roulette = new Scanner(System.in);
        int firstNumber = roulette.nextInt();
        int secondNumber = roulette.nextInt();
        if (firstNumber == 36 && secondNumber == 17) {
            System.out.println("CONGRATULATION !!! YOU WON THE JACKPOT !!!!");
        } else {
            if (firstNumber == 36) {
                System.out.println("congratulation you won a little prize !!");
            } else {
                if (secondNumber == 17) {
                    System.out.println("congratulation you won a little prize !!");
                } else {
                    System.out.println("SORRY !!! you have lost EVERYTHING");
                }
            }
        }
    }
}
import java.util.Scanner;

public class Bot {
    Scanner input = new Scanner(System.in);

    public void twentyQuestions() {


        while (true) {
            System.out.println("TWENTY QUESTIONS");
            System.out.println("Guess what number I'm thinking of from 1-100");

            int randomNum = (int) (Math.random() * 100);
            int counter = 1;


            while (true) {
                System.out.print("Guess " + counter + ": ");
                int guess = input.nextInt();

                if (guess > randomNum) {
                    System.out.println("Too High!");
                    counter++;
                    continue;
                } else if (guess < randomNum) {
                    System.out.println("Too Low!");
                    counter++;
                    continue;
                } else if (guess == randomNum) {
                    System.out.println("Correct!");
                    break;
                }
            }

            System.out.println("Would you like to play again? (y/n) ");

            if (input.nextLine().equals("y")) {
                continue;
            }
        }
    }

    public void therapyBot() {
        System.out.println("How are you feeling today?");
        String feeling = input.nextLine();



    }
}







